package edu.myan.model;

/**
 * Created by LY on 29.09.2016.
 */

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private Date created;
    private Date birthday;
    private String email;
    private String phonenumber;
    private String address;
    private String pw;

    @OneToOne
    private HistoryEntity historyEntity;
    @OneToOne
    private StatsHistoryEntity statsHistoryEntity;

    private RoleEntity role;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public UserEntity(String name, String surname, String created, String birthday, String email, String phonenumber,
                      String address, String pw, String date) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.created = format.parse(date);
        this.birthday = format.parse(birthday);
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
        this.pw = pw;
        this.role = new RoleEntity("Student");
    }

    UserEntity() {
    }

    public UserEntity(long id) {
        this.id = id;
    }

    public UserEntity(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public HistoryEntity getHistoryEntity() {
        return historyEntity;
    }

    public void setHistoryEntity(HistoryEntity historyEntity) {
        this.historyEntity = historyEntity;
    }

    public StatsHistoryEntity getStatsHistoryEntity() {
        return statsHistoryEntity;
    }

    public void setStatsHistoryEntity(StatsHistoryEntity statsHistoryEntity) {
        this.statsHistoryEntity = statsHistoryEntity;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedAsShort() {
        return format.format(created);
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("JournalEntry(");
        value.append("Id: ");
        value.append(id);
        value.append(",Title: ");
        value.append(name);
        value.append(",Summary: ");
        value.append(",Created: ");
        value.append(getCreatedAsShort());
        value.append(")");
        return value.toString();
    }
}

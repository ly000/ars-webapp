package edu.myan.model;

import com.sun.xml.internal.bind.v2.TODO;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Entity
public class ARSRoomEntity extends BaseEntity{
    private String roomId;

    //TODO: Persist Statistics of ARSRoom
/*    private double statAnswer1;
    private double statAnswer2;
    private double statAnswer3;
    private double statAnswer4;*/
    @OneToMany
    private List<LectureEntity> lectures;


    public ARSRoomEntity(String roomId, List<LectureEntity> lectures) {
        this.roomId = roomId;
        this.lectures = lectures;
    }


/*
    public double getStatAnswer1() {
        return statAnswer1;
    }

    public void setStatAnswer1(double statAnswer1) {
        this.statAnswer1 = statAnswer1;
    }

    public double getStatAnswer2() {
        return statAnswer2;
    }

    public void setStatAnswer2(double statAnswer2) {
        this.statAnswer2 = statAnswer2;
    }

    public double getStatAnswer3() {
        return statAnswer3;
    }

    public void setStatAnswer3(double statAnswer3) {
        this.statAnswer3 = statAnswer3;
    }

    public double getStatAnswer4() {
        return statAnswer4;
    }

    public void setStatAnswer4(double statAnswer4) {
        this.statAnswer4 = statAnswer4;
    }*/

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<LectureEntity> getLectures() {
        return lectures;
    }

    public void setLectures(List<LectureEntity> lectures) {
        this.lectures = lectures;
    }
}

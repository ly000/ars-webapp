package edu.myan.model;

import javax.management.relation.Role;
import javax.persistence.Entity;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Entity
public class RoleEntity extends BaseEntity{

    private String role;

    public RoleEntity() {
        this.role = "Student";
    }

    public RoleEntity(String role){
        this.role = role;
    }
}

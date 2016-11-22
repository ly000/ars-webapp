package edu.myan.model;

import javax.persistence.Entity;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Entity
public class TagEntity extends BaseEntity{
    private String tag;

    public TagEntity(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

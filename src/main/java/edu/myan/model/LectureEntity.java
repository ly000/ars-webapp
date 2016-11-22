package edu.myan.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Entity
public class LectureEntity extends BaseEntity{
    private String name;
    @OneToMany
    private List<QuestionEntity> questions;

    public LectureEntity(List<QuestionEntity> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuestionEntity> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }
}

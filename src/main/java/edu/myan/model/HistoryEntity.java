package edu.myan.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Entity
public class HistoryEntity extends BaseEntity {
    @OneToOne
    private UserEntity userEntity;
    private QuestionEntity Questions;
    private Integer answerChoice;

    public HistoryEntity(UserEntity userEntity, QuestionEntity questions, Integer answerChoice) {
        this.userEntity = userEntity;
        Questions = questions;
        this.answerChoice = answerChoice;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public QuestionEntity getQuestions() {
        return Questions;
    }

    public void setQuestions(QuestionEntity questions) {
        Questions = questions;
    }

    public Integer getAnswerChoice() {
        return answerChoice;
    }

    public void setAnswerChoice(Integer answerChoice) {
        this.answerChoice = answerChoice;
    }
}

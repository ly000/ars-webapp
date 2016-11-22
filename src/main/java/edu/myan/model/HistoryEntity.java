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
    @OneToMany
    private List<QuestionEntity> Questions;
    private List<Integer> answerChoice;

    public HistoryEntity(UserEntity userEntity, List<QuestionEntity> questions, List<Integer> answerChoice) {
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

    public List<QuestionEntity> getQuestions() {
        return Questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        Questions = questions;
    }

    public List<Integer> getAnswerChoice() {
        return answerChoice;
    }

    public void setAnswerChoice(List<Integer> answerChoice) {
        this.answerChoice = answerChoice;
    }
}

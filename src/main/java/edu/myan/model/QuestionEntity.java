package edu.myan.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertFalse;
import java.util.List;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Entity
public class QuestionEntity extends BaseEntity {
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String correctanswer4;

    @OneToMany
    private List<TagEntity> tags;

    public QuestionEntity(String question, String answer1, String answer2, String answer3, String correctanswer4) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctanswer4 = correctanswer4;
    }

    public QuestionEntity(String question, String answer1, String answer2, String answer3, String correctanswer4, List<TagEntity> tags) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctanswer4 = correctanswer4;
        this.tags = tags;
    }

    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getCorrectanswer4() {
        return correctanswer4;
    }

    public void setCorrectanswer4(String correctanswer4) {
        this.correctanswer4 = correctanswer4;
    }
}

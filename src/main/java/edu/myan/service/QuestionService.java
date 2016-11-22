package edu.myan.service;

import edu.myan.model.LectureEntity;
import edu.myan.model.QuestionEntity;
import edu.myan.model.TagEntity;
import edu.myan.persistence.LectureDao;
import edu.myan.persistence.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Component
@Transactional
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<QuestionEntity> getQuestionByTag(String tag){
        return questionDao.findByTags(new TagEntity(tag));
    }
}

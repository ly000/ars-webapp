package edu.myan.persistence;

import edu.myan.model.QuestionEntity;
import edu.myan.model.TagEntity;
import edu.myan.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Transactional
public interface QuestionDao extends CrudRepository<QuestionEntity, Long> {

    public List<QuestionEntity> findByTags(TagEntity tag);
}

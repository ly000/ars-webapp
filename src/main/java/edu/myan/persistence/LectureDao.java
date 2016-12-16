package edu.myan.persistence;

import edu.myan.model.LectureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Transactional
public interface LectureDao extends CrudRepository<LectureEntity, Long>{


}

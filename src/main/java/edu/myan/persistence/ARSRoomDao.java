package edu.myan.persistence;

import edu.myan.model.ARSRoomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Transactional
public interface ARSRoomDao extends CrudRepository<ARSRoomEntity,Long>{


}

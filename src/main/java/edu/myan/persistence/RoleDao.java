package edu.myan.persistence;

import edu.myan.model.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Transactional
public interface RoleDao extends CrudRepository<RoleEntity,Long>{


}

package edu.myan.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by   : LY
 * <p>
 * Description  :
 */
@Transactional
public interface RoleDao extends CrudRepository{


}

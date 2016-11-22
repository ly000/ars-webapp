//package edu.myan.persistence;
//
//import edu.myan.model.UserEntity;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.Query;
//
//@Component
//public class UserDao extends GenericDao<UserEntity> {
//
//    public UserDao() { super(UserEntity.class);}
//
//    public UserEntity getUserByName(String username) {
//        Query query = this.createQuery("SELECT t FROM " + UserEntity.class.getSimpleName() + " t WHERE t.username = :username");
//        query.setParameter("username", username);
//        return this.getSingleResultOrNull(query);
//    }
//
//}
package edu.myan.persistence;


import edu.myan.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends CrudRepository<UserEntity, Long> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public UserEntity findByEmail(String email);

}


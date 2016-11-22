package edu.myan.service;

import edu.myan.model.UserEntity;
import edu.myan.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LY on 01.10.2016.
 */

@Component
@Transactional
public class UserService {

    @Autowired
    private UserDao usrDao;

    public UserEntity getUserByName(String name) {
        return usrDao.findByEmail(name);
    }

    public UserEntity findByEmail(String email) {
        return usrDao.findByEmail(email);
    }

    public void save(UserEntity user) {
        usrDao.save(user);
    }

}

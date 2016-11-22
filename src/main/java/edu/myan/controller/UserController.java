package edu.myan.controller;

import com.sun.deploy.net.HttpResponse;
import edu.myan.model.UserEntity;
import edu.myan.model.dto.UserDto;
import edu.myan.persistence.UserDao;
import edu.myan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LY on 01.10.2016.
 */

@RestController
public class UserController{
    @Autowired
    UserService usrService;

    UserDto userDto;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> getTest () {

        return new ResponseEntity("test",HttpStatus.OK);
    }

    @RequestMapping(path = "/user/{name}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> getUserData(
            @PathVariable("name") String name) {

        UserEntity usr = usrService.getUserByName(name);
        return new ResponseEntity<UserEntity>(usr, HttpStatus.OK);
    }

    @RequestMapping(path = "/user/{name}", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@PathVariable("name") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @RequestMapping(
            path = "/create",
            method = RequestMethod.GET)
    @ResponseBody
    public String create(String email, String name) {
        String userId = "";
        try {
            UserEntity user = new UserEntity(email, name);
            usrService.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId = "";
        try {

            UserEntity user = usrService.findByEmail(email);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }
}

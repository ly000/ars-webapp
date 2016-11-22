package edu.myan.controller;

import edu.myan.model.QuestionEntity;
import edu.myan.model.UserEntity;
import edu.myan.persistence.QuestionDao;
import edu.myan.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by LY on 01.10.2016.
 */

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;


    @RequestMapping("/questions/search")
    public @ResponseBody
    List<QuestionEntity> getByTag(String tag) {
        List<QuestionEntity> question = null;
        try {

            question = questionService.getQuestionByTag(tag);
        }
        catch (Exception ex) {
            return null;
        }
        return question;
    }
}

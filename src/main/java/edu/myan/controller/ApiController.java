package edu.myan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 10/18/2016.
 * https://jira.spring.io/browse/SPR-13882
 */
@RestController
@RequestMapping(path = "/api")
public abstract class ApiController {
}

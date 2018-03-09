package com.wx.controller;

import com.wx.entity.User;
import com.wx.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/testController")
public class TestController {

    private final UserService userService;
    private Logger logger = LogManager.getLogger("myLog");

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public User test(Integer userId){
        System.out.println("test...");
        User user = userService.queryById(userId);
        logger.info("test...");
        return user;
    }

}


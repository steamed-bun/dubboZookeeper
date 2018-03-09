package com.wx.controller;

import com.wx.entity.User;
import com.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/testController")
public class TestController {

    private final UserService userService;

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/test")
    public User test(Integer userId){
        System.out.println("test...");
        return userService.queryById(userId);
    }

}


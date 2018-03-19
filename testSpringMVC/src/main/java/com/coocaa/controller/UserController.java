package com.coocaa.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.coocaa.entity.User;
import com.wx.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class UserController {

    @Reference(version="1.0.0")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/", produces = "application/json;charset=utf-8")
    public User testJson(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/test12")
    public com.wx.entity.User test() {
//        System.out.println(user);
        System.out.println("teat");
        userService.queryById(3);
        System.out.println(userService);
        return userService.queryById(10);
//        return user;
    }

    @RequestMapping(value = "/test2")
    public String test2() {
//        System.out.println(user);
        System.out.println("teat");
        return "test";
//        return user;
    }
}

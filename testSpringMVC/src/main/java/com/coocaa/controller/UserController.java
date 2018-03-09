package com.coocaa.controller;


import com.coocaa.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/", produces = "application/json;charset=utf-8")
    public User testJson(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/test12")
    public User test() {
//        System.out.println(user);
        System.out.println("teat");
        return new User();
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

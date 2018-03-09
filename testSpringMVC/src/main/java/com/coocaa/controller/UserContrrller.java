package com.coocaa.controller;


import com.coocaa.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserContrrller {

    @ResponseBody
    @RequestMapping(value = "/", produces = "application/json;charset=utf-8")
    public User testJson(HttpServletRequest request,@RequestBody User user){
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/test1")
    public User test(HttpServletRequest request, HttpServletResponse response){
//        System.out.println(user);
        System.out.println("teat");
        return new User();
//        return user;
    }

    @RequestMapping(value = "/test2")
    public String test2(HttpServletRequest request, HttpServletResponse response){
//        System.out.println(user);
        System.out.println("teat");
        return "test";
//        return user;
    }

    /**
     * Create an instance with the given map of file extensions and media types.
     * 使用给定的文件扩展名和媒体类型的映射创建一个实例。
     */



//        String jsonpCallback = request.getParameter("callback");
//        JSONPObject jsonpObject = new JSONPObject(jsonpCallback,user);
//        System.out.println(jsonpObject);
//        jsonpObject.addParameter(user);
//        return jsonpObject;
}

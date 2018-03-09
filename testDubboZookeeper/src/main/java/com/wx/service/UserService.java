package com.wx.service;

import com.wx.entity.User;
import com.wx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired(required = false)
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User queryById(Integer userId){
        return userMapper.queryById(userId);
    }

}

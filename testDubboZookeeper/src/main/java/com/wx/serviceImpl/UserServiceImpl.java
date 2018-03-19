package com.wx.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wx.entity.User;
import com.wx.mapper.UserMapper;
import com.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version="1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    @Autowired(required = false)
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User queryById(Integer userId){
        return userMapper.queryById(userId);
    }

}

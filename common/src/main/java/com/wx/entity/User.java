package com.wx.entity;

import java.io.Serializable;

public class User implements Serializable{

    private Integer userId;
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", UserName='" + userName + '\'' +
                '}';
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

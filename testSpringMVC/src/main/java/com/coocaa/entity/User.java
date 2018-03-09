package com.coocaa.entity;

public class User {

    private Integer userId;
    private String UserName;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", UserName='" + UserName + '\'' +
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
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}

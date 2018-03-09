package com.wx.mapper;


import com.wx.entity.User;

/**
 * <br>
 * <b>功能：</b>本地人群与会员属性关系表 Mapper<br>
 * <b>作者：</b>siber.xu<br>
 * <b>日期：</b>2017-07-21 10:08:34<br>
 * <b>详细说明：</b>无<br>
 */
public interface UserMapper {

    User queryById(Integer userId);

}

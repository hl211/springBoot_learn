package com.hl.service;

import com.hl.pojo.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
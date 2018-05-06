package com.hl.service;

import com.hl.mapper.UserMapper;
import com.hl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public List<User> get(){
        return userMapper.findByName("lihui");
    }
}

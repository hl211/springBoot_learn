package com.hl.controller;

import com.hl.common.MyException;
import com.hl.common.ResultCode;
import com.hl.pojo.User;
import com.hl.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @RequestMapping(value = "user",method = RequestMethod.GET)
    List<User> index() {
        return userService.get();
    }

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "user",method = RequestMethod.POST)
    String inde() {
        return "Hello Spring Boot";
    }

    @RequestMapping(value="exce")
    String exce() throws Exception{
        throw new MyException(ResultCode.WEAK_NET_WORK);
    }

}

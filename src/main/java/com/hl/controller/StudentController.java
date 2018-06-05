package com.hl.controller;

import com.hl.common.MyException;
import com.hl.common.ResultCode;
import com.hl.pojo.StudentEntity;
import com.hl.pojo.UserInfo;
import com.hl.service.StudentService;
import com.hl.service.UserInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController

public class StudentController {

    private final static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;
      @Resource
    private UserInfoService userInfoService;

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @RequestMapping(value = "user",method = RequestMethod.GET)
    List<StudentEntity> index() {
      return studentService.findAll();
    }

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "user",method = RequestMethod.POST)
    UserInfo inde() {
        UserInfo userInfo=userInfoService.findByUsername("admin");
        return userInfo;


    }

    @RequestMapping(value="exce")
    String exce() throws Exception{
        throw new MyException(ResultCode.WEAK_NET_WORK);
    }

}

package com.hl.service;

import com.hl.pojo.StudentEntity;

import java.util.List;


public interface StudentService {

    List<StudentEntity> findAll();
    List<StudentEntity> findAll(int pageNum, int pageSize,StudentEntity studentEntity);
}

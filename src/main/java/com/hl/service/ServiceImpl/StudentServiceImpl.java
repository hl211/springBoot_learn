package com.hl.service.ServiceImpl;

import com.hl.mapper.StudentDao;
import com.hl.pojo.StudentEntity;
import com.hl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;
    @Override
    public List<StudentEntity> findAll() {
        return studentDao.findAll();
    }

    @Override
    public List<StudentEntity> findAll(int pageNum, int pageSize, StudentEntity studentEntity) {
        return null;
    }
}

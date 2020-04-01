package com.ljw.service.impl;

import com.ljw.entity.Student;
import com.ljw.mapper.StudentMapper;
import com.ljw.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 84731
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}

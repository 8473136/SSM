package com.ljw.controller;

import com.alibaba.fastjson.JSON;
import com.ljw.entity.Student;
import com.ljw.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author 84731
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource(name = "studentServiceImpl")
    private StudentService studentService;


    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        List<Student> list = studentService.getAll();
        return JSON.toJSONString(list);
    }

}

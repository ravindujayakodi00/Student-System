package com.springprojects.stms.controller;

import com.springprojects.stms.model.Student;
import com.springprojects.stms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public String add(@RequestBody Student student){
        studentService.saveStudent();
        return null;
    }
}

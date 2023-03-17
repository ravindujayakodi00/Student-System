package com.springprojects.stms.service;

import com.springprojects.stms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent() {
        studentRepository.save(student);
    }
}

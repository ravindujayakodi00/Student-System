package com.springprojects.stms.service;

import com.springprojects.stms.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

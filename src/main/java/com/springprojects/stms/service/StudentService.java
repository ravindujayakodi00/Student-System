package com.springprojects.stms.service;

import com.springprojects.stms.model.Student;

import java.util.List;

public interface StudentService {
    public void saveStudent();

    Student saveStudent(Student student);

    List<Student> getAllStudents();
}

package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student createData(Student stu);

    List<Student> fetchRecord();

    Optional<Student> fetchDataById(int id);

    void deleteData(int id);
}

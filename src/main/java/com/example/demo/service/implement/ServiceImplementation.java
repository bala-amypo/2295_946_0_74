package com.example.demo.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class ServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public Student createData(Student student) {
        return repo.save(student);
    }
}

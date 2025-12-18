package com.example.demo.service.implementation;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StuServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StuServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student createData(Student stu) {
        return repo.save(stu);
    }

    @Override
    public List<Student> fetchRecord() {
        return repo.findAll();
    }

    @Override
    public Optional<Student> fetchDataById(int id) {
        return repo.findById(id);
    }

    @Override
    public void deleteData(int id) {
        repo.deleteById(id);
    }
}

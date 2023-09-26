package com.geekster.universityEvent.service;

import com.geekster.universityEvent.model.Student;
import com.geekster.universityEvent.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "Student Added";
    }

    public List<Student> getStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    public String addingStudent(List<Student> newStudent) {
        studentRepo.saveAll(newStudent);
        return newStudent.size() + "Students added";
    }


    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    public String removeStudent(List<Long> ids) {
        studentRepo.deleteAllById(ids);
        return "removed student";
    }
}

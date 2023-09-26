package com.geekster.universityEvent.controller;

import com.geekster.universityEvent.model.Student;
import com.geekster.universityEvent.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("Student")
    public String addStudent(@RequestBody @Valid Student newStudent)
    {
        return studentService.addStudent(newStudent);
    }

    @GetMapping("Students")
    public List<Student> getStudent()
    {
        return studentService.getStudent();
    }

    //ADD MULTIPLE STUDENT
    @PostMapping("MStudent")
    public String addingStudent(@RequestBody List<Student> newStudent)
    {
        return studentService.addingStudent(newStudent);
    }

    //GET STUDENT BY ID

    @GetMapping("Student/id/{id}")
    public Student getStudentById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("Student/ids")
    public String removeStudentByIds(@RequestBody List<Long> ids)
    {
        return studentService.removeStudent(ids);
    }

}

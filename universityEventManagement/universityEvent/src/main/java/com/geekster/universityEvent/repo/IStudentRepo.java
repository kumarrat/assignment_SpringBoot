package com.geekster.universityEvent.repo;

import com.geekster.universityEvent.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Long> {
}

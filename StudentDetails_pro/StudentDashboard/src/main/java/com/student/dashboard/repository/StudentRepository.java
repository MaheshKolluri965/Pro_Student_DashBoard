package com.student.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.dashboard.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}

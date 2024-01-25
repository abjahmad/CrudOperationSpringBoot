package com.info.repository;

import org.springframework.data.repository.CrudRepository;

import com.info.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}

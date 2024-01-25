package com.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudspring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

package com.crudspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudspring.model.Employee;
import com.crudspring.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void insertEmp(Employee employee) {
		employeeRepository.save(employee);
	}
	
	 
}

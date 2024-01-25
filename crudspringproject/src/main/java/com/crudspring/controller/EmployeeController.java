package com.crudspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudspring.model.Employee;
import com.crudspring.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/check")
	public String check() {
		return "Running.....";
	}
	@PostMapping("/insertEmpData")
	public String insertEmpData(@RequestBody Employee employee) {
		employeeService.insertEmp(employee);
		return "Emp Data Insert";
	}
}

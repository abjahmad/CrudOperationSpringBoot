package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("insertStudents")
	public String insertStudents(@RequestBody Student student) {
		studentService.insertStudent(student);
		return "Student insert";
	}
	
	@PostMapping("insertMultipleStudents")
	public String insertMultipleStudents(@RequestBody List<Student> students) {
		studentService.insertMultipleStudent(students);
		return "Added Multiple Student Data";
	}
	@GetMapping("getAllDataFromTable")
	public List<Student> getAllDataFromTable(){
		return studentService.getAllData();
	}
	@PutMapping("studentDataUpdated")
	public String studentDataUpdated(@RequestBody Student  student) {
		studentService.updateStudent(student);
		return "Data Update";
	}
	@DeleteMapping("deleteStudentData/{id}")
	public String deleteStudentData(@PathVariable int id) {
		studentService.deleteData(id);
		return "Data deleted this "+id;
	}
}

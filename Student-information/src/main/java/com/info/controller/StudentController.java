package com.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.model.Student;
import com.info.service.StudentService;

@RestController
public class StudentController {
	@Autowired	
	StudentService   studentService;
	
	@PostMapping("insertStudentData")
	public String insertStudentData(@RequestBody Student student) {
		studentService.insertStudent(student);
		return "Student Insert SuccessFull";
	}
	@PostMapping("insertMultipleStudent")
	public String insertMultipleStudent(@RequestBody List<Student> students) {
		studentService.insertMultiple(students);
		return "Added Multiple Student";
	}
	
	@GetMapping("getMultpleStudentRecord")
	public List<Student> getMultpleStudentRecord(){
		return studentService.getAllStudentData();
	}
	@PutMapping("updateStudentData")
	public String updateStudentData(@RequestBody Student  student) {
		studentService.UpdateStudent(student);
		return "Student Updated";
	}
	@DeleteMapping("deleteStudentRecord/{id}")
	public String deleteStudentRecord(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "Student deleted";
	}
}

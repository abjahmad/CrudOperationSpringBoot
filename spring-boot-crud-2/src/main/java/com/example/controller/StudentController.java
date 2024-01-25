package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("insertStudents")
	public String insertStudents(@RequestBody Student student) {
		studentService.insertStudent(student);
		return "Insert Student";
	}
     @PostMapping("insertMultipleStudents")	
	public String insertMultipleStudents(@RequestBody List<Student> students) {
		studentService.insertMultipleStudent(students);
		return "Insert multiple Student";
	}
     @GetMapping("getAllStudentData")
     public List<Student> getAllStudentData() {
    	 return studentService.getAllDataStudent();
     }
     @DeleteMapping("deleteStudentData/{id}")
     public String deleteStudentData(@PathVariable int id) {
    	 studentService.deleteStudent(id);
    	 return "Student deleted";
     }
     @PutMapping("updateStudentData")
     public String updateStudentData(@RequestBody Student student) {
    	 studentService.updataStudent(student);
    	 return "Updated";
     }
     @GetMapping("getStudentById/{id}")
     public Optional<Student> getStudentById( @PathVariable int id){
    	 return studentService.studentFindById(id);
    	 
     }
}

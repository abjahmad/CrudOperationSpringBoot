package com.info.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.model.College;
import com.info.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService  collegeService;
	
	
	@PostMapping("insertStudents")
	public String insertStudents(@RequestBody College college) {
		collegeService.insertStudent(college);
		return "insert";
	}
	
	@PostMapping("insertAllStudent")
	public String insertAllStudent(@RequestBody List<College> college) {
		collegeService.insertMultiple(college);
		return "Insert all student";
	}
	@GetMapping("getAllUserData")
	public List<College> getAllUserData(){
		return collegeService.getAllStudent();
	}
	@PutMapping("updateCollageData")
	public String updateCollageData(@RequestBody College  college) {
		collegeService.updatCollage(college);
		return "Updated";
	}
	@DeleteMapping("deleteCollegeData/{id}")
	public String deleteCollegeData(@PathVariable int id) {
		collegeService.deleteCollage(id);;
		return "User deleted";
	}
}

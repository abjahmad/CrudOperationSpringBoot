package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CollegeInfo;
import com.example.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	// check method
	@GetMapping("/check")
	public String check() {
		return "OK";
	}
	@PostMapping("/insertClgData")
	public String insertClgData(@RequestBody CollegeInfo collegeInfo) {
		collegeService.insertData(collegeInfo);
		return "College Data Insert";
	}
	@PostMapping("/insertMultipleData")
	public String insertMultipleData(@RequestBody List<CollegeInfo> collegeInfos) {
		collegeService.insertMultipleData(collegeInfos);
		return "Mulitple Data Inserted Successfully";
	}
	@GetMapping("/getAllClgData")
	public List<CollegeInfo> getAllClgData() {
		return collegeService.getAllData();
	}
	@PutMapping("/updateClgData")
	public String updateClgData(@RequestBody CollegeInfo collegeInfo) { 
		collegeService.updatData(collegeInfo);
		return "Data Updated";
	}
	@DeleteMapping("/deleteClgData/{id}")
	public String deleteClgData(@PathVariable int id) {
		collegeService.deleteData(id);
		return "Data deleted ";
	}
	
	
}

package com.info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.model.College;
import com.info.repository.CollegeRepository;

@Service
public class CollegeService {
	@Autowired
	CollegeRepository collegeRepository;
	
	public void insertStudent(College college) {
		collegeRepository.save(college);
	}
	
	public List<College>insertMultiple(List<College>college){
		  collegeRepository.saveAll(college);
		  return college;
	}
	
	public List<College> getAllStudent(){
		List<College> list =new  ArrayList<College>();
		collegeRepository.findAll().forEach(clg -> list.add(clg));
		return list;
	}
	
	public void updatCollage(College college) {
		collegeRepository.save(college);
	}
	
	public void deleteCollage(int id) {
		collegeRepository.deleteById(id);
	}
}

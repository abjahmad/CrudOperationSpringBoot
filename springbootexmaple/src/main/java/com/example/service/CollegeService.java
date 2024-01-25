package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CollegeInfo;
import com.example.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	public void insertData(CollegeInfo collegeInfo) {
		collegeRepository.save(collegeInfo);
	}
	
	public List<CollegeInfo> insertMultipleData(List<CollegeInfo> list) {
		collegeRepository.saveAll(list);
		return list;
	}
	
	public List<CollegeInfo> getAllData(){
		List<CollegeInfo> list = new ArrayList<CollegeInfo>();
		collegeRepository.findAll().forEach(clf->list.add(clf));
		return list;
	}
	
	public void updatData(CollegeInfo collegeInfo) {
		collegeRepository.save(collegeInfo);
	}
	
	public void deleteData(int id){
		collegeRepository.deleteById(id);
	}
}

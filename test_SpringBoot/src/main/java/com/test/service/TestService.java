package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Test;
import com.test.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository testRepository;
	
	public void insertData(Test test) {
		testRepository.save(test);
	}
	
	public List<Test> insertMultiple(List<Test> test) {
		testRepository.saveAll(test);
		return test;
	}
	
	public List<Test> getAllTest(){
		List<Test> tests = new ArrayList<Test>();
		testRepository.findAll().forEach(tt-> tests.add(tt));
		return tests;
	}
	
	public void update(Test test) {
		testRepository.save(test);
	}
	
	public void delete(int id) {
		testRepository.deleteById(id);
	}
	
	
	
	

}

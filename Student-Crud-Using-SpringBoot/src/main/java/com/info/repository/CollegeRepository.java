package com.info.repository;

import org.springframework.data.repository.CrudRepository;

import com.info.model.College;

public interface CollegeRepository  extends CrudRepository<College, Integer>{
	
	
}

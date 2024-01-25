package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.CollegeInfo;

public interface CollegeRepository extends CrudRepository<CollegeInfo, Integer> {

}

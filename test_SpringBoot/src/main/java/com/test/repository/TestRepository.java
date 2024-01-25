package com.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.model.Test;

public interface TestRepository extends CrudRepository<Test, Integer>{

}

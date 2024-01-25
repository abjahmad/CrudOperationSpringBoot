package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Test;
import com.test.service.TestService;

@RestController
public class TestController {

		@Autowired
	private TestService testService;
		
		@GetMapping("test")
		public String  test() {
			return "tets Success";
		}
		
		@PostMapping("insert")
		public String insert(@RequestBody Test test) {
			testService.insertData(test);
			return "SuccessFully inserted";
		}
		
		@PostMapping("insertDataMultiple")
		public String insertDataMultiple(@RequestBody List<Test> tests) {
			testService.insertMultiple(tests);
			return "Insert All Record";
		}
		
		@GetMapping("getAllTest")
		public List<Test> getAllTest(){
			return testService.getAllTest();
		}
		
		@PutMapping("updateTest")
		public String updateTest(@RequestBody Test test) {
			testService.update(test);
			return "Updated";
		}
		@DeleteMapping("deleteTest/{id}")
		public String deleteTest(@PathVariable int id) {
			testService.delete(id);
			return "Deleted"+id;
		}
}

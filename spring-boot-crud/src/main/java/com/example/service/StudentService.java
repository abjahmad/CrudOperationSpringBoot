package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public void insertStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> insertMultipleStudent(List<Student> students) {
		studentRepository.saveAll(students);
		return students;
	}
	
	public List<Student> getAllData(){
		List<Student> list = new ArrayList<Student>();
		studentRepository.findAll().forEach(st -> list.add(st));
		return list;
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteData(int id) {
		studentRepository.deleteById(id);
	}
	
	
}

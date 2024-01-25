package com.info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.model.Student;
import com.info.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public void insertStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> insertMultiple(List<Student> students){
		studentRepository.saveAll(students);
		return  students;
	}
	
	public List<Student> getAllStudentData(){
		List<Student> list =new  ArrayList<Student>();
		studentRepository.findAll().forEach(stu ->list.add(stu));
		return list;
	}
	
	public void UpdateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(int  id) {
		studentRepository.deleteById(id);
	}
}

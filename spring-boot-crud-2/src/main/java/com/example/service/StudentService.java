package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void insertStudent(Student student) {
		studentRepository.save( student);
	}
	
	public List<Student> insertMultipleStudent(List<Student> students) {
		studentRepository.saveAll(students);
		return students;
	}
	
	public List<Student> getAllDataStudent(){
		List<Student> list = new ArrayList<Student>();
		studentRepository.findAll().forEach(stu ->list.add(stu));
		return list;
	}
	
	public void deleteStudent( int id ) {
		studentRepository.deleteById(id);
	}
	
	public void updataStudent(Student student) {
		studentRepository.save(student);
	}
	
	public 	Optional<Student> studentFindById(int id){
		return studentRepository.findById(id);
	}
}

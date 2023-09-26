package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.model.Books;
import com.springboot.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;

	
	public List<Books> getAllBooks(){
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 ->books.add(books1));
		return books;
	}
	
	public void saveData(Books books) {
		booksRepository.save(books);
	}
	
	
}

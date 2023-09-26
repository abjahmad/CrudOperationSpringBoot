package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Books;
import com.springboot.service.BooksService;

@RestController
public class BookController {
	@Autowired
	BooksService booksService;
	
	@GetMapping("/book")
	public List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	@PostMapping("/addedbooks")
	public String insertData(@RequestBody Books books) {
		booksService.saveData(books);
		return "Added";
	}

}

package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.model.Product;
import com.springcrud.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/insertProducts")
	public String insertProducts(@RequestBody Product product) {
		productService.insertproduct(product);
		return "Product inserted sucessfully";
	}
	
	@PostMapping("/insertMultipleProducts")
	public String insertMultipleProducts(@RequestBody List<Product> products) {
		productService.insertMultipleProduct(products);
		return "Inserted Multiple Product";
	}
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}
	@PutMapping("updateProducts")
	public String updateProducts(@RequestBody Product product) {
		productService.updateProduct(product);
		return "Updated";
	}
	@DeleteMapping("/{id}")
	public String deleteProduts(@PathVariable int id) {
		productService.deleteProduct(id);
		return "Product deleted";
	}
	
	
}

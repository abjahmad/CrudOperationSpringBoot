package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("insertProducts")
	public String insertProducts(@RequestBody Product product) {
		productService.insertProduct(product);
		return "Product insert";
	}
	@PostMapping("/insertMultiplesData")
	public String insertMultiplesData(@RequestBody List<Product> products) {
		productService.insertMultipleData(products);
		return "Multiple data insert success";
	}
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		 	return productService.getAllProduct();
	}
	@PutMapping("/updateData")
	public String updateData(@RequestBody Product product) {
		productService.update(product);
		return "Data Updated";
	}
	@DeleteMapping("/deleteByIdProduct/{id}")
	public String deleteByIdProduct(@PathVariable() int id) {
		productService.deleteById(id);
		return "Product deleted";
	}
}

package com.springcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.model.Product;
import com.springcrud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void insertproduct(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> insertMultipleProduct(List<Product>  products) {
		productRepository.saveAll(products);
		return products;
	}
	
	public List<Product> getAllProduct(){
		 List<Product> list = new ArrayList<Product>();
		 productRepository.findAll().forEach( pr -> list.add(pr));
		return list;
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
	
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}
	
}

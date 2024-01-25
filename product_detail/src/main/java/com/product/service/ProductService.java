package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void insertProduct(  Product product) {
		productRepository.save(product);
	}
	
	public List<Product> insertMultipleData(List<Product> products) {
		productRepository.saveAll(products);
		return products;
	}
	public List<Product> getAllProduct(){
		List<Product> products = new ArrayList<Product>();
		productRepository.findAll().forEach(pr -> products.add(pr));
		return products;
	}
	
	public void update(Product product){
		productRepository.save( product);
	}
	public void deleteById(int id) {
		productRepository.deleteById(id);
	}
	
	
	
}

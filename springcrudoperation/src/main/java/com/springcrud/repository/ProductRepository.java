package com.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

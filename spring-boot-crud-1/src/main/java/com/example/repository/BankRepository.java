package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Bank;

public interface BankRepository extends CrudRepository<Bank, Integer>{

}

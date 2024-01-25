package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Bank;

public interface BankkRepository  extends JpaRepository<Bank, Integer>{

}

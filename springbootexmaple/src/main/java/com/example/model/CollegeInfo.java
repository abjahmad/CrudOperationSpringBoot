package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "College_info")
public class CollegeInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clg_id;
	private String clg_name;
	private String clg_loction;
	private int clg_reg_number;
	public int getClg_id() {
		return clg_id;
	}
	public void setClg_id(int clg_id) {
		this.clg_id = clg_id;
	}
	public String getClg_name() {
		return clg_name;
	}
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public String getClg_loction() {
		return clg_loction;
	}
	public void setClg_loction(String clg_loction) {
		this.clg_loction = clg_loction;
	}
	public int getClg_reg_number() {
		return clg_reg_number;
	}
	public void setClg_reg_number(int clg_reg_number) {
		this.clg_reg_number = clg_reg_number;
	}
	
	

}

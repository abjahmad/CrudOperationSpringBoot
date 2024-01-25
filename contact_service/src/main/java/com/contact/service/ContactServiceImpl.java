package com.contact.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact>  list = List.of(
			new Contact(1L,  "amit@gmail.com", "Amit", 1232L),
			new Contact(1L,  "anil@gmail.com", "Anil", 1233L),
			new Contact(1L,  "rohan@gmail.com", "Rohan", 1234L)
			
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact ->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}

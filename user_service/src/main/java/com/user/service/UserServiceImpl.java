package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl  implements UserService{

	
	List<User>  list = List.of(
			new User(1232L, "Arbaj", "Ahmad"),
	new User(1233L, "sameer", "Ahmad"),
	new User(1234L, "shahbaj", "Ahmad"));
	
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}

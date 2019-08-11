package com.mooc.service;

import com.mooc.entity.User;

public interface UserService {

	boolean login(User user);

	int changeUser(User user);

	boolean register(User user);
	
}

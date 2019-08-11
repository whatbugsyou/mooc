package com.mooc.service;

import java.util.List;

import com.mooc.entity.User;

public interface UserService {

	boolean login(User user);

	User enterPersonalCenter();

	int changeUser(User user);
	boolean register(User user);
	List<User> selectAllUser();

	int deleteUserById(int uid);
	
}

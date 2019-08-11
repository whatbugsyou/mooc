package com.mooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.UserMapper;
import com.mooc.entity.User;
import com.mooc.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		User user2 = userMapper.selectUserByAccount(user.getAccount());
		if(user2!=null && user2.getPassword().equals(user.getPassword())) {
			user=user2;
			return true;
		}
		return false;
	}

	@Override
<<<<<<< HEAD
	public User enterPersonalCenter() {
		return userMapper.selectUserByUid(1);
	}

	@Override
	public int changeUser(User user) {
		return userMapper.updateUser(user);
=======
	public boolean register(User user) {
		User user2 = userMapper.selectUserByAccount(user.getAccount());
		if(user2==null) {
			userMapper.insertUser(user);
			return true;
		}
		return false;
>>>>>>> 3497af9915ef59150abfc8e8712463831cfd00d6
	}
}

package com.mooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.UserMapper;
import com.mooc.entity.User;
import com.mooc.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private static UserMapper userMapper;

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
}

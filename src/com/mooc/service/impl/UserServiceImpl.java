package com.mooc.service.impl;

import java.util.List;

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
		User user2 = userMapper.selectUserByAccount(user.getAccount());
		System.out.println("=====================");
		System.out.println(user2);
		if(user2!=null && user2.getPassword().equals(user.getPassword())) {
			user.setUid(user2.getUid());
			user.setPortrait(user2.getPortrait());
			user.setSignature(user2.getSignature());
			return true;
		}
		return false;
	}

	@Override
	public User enterPersonalCenter() {
		return userMapper.selectUserByUid(1);
	}

	@Override
	public int changeUser(User user) {
		return userMapper.updateUser(user);
	}
	
	public boolean register(User user) {
		User user2 = userMapper.selectUserByAccount(user.getAccount());
		if(user2==null) {
			userMapper.insertUser(user);
			return true;
		}
		return false;
	}
	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}

	@Override
	public int deleteUserById(int uid) {
		// TODO Auto-generated method stub
		return userMapper.deleteUserById(uid);
	}
}

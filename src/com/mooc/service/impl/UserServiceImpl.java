package com.mooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.UserMapper;
import com.mooc.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private static UserMapper userMapper;
}

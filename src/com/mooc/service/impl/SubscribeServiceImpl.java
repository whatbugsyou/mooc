package com.mooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.SubscribeMapper;
import com.mooc.service.SubscribeService;
@Service
public class SubscribeServiceImpl implements SubscribeService {
	@Autowired
	private static SubscribeMapper subscribeMapper;
}

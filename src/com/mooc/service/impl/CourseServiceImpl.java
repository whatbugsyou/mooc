package com.mooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.CourseMapper;
import com.mooc.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseMapper courseMapper;
}

package com.mooc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.CourseMapper;
import com.mooc.entity.Course;
import com.mooc.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired

	private CourseMapper courseMapper;


	@Override
	public List<Course> searchcourse(String name) {
		// TODO Auto-generated method stub
		List<Course> list =courseMapper.selectLikeCname( name);
		System.out.println("我进服务层了");
		return list;
	}

	@Override
	public List<Course> show() {
		// TODO Auto-generated method stub
		List<Course> list=courseMapper.selectAll();
		return list;
	}

}

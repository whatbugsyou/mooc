package com.mooc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.CourseMapper;
import com.mooc.entity.Course;
import com.mooc.entity.Coursetype;
import com.mooc.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired

	private CourseMapper courseMapper;


	@Override
	public List<Course> selectLikeCname(String name) {
		// TODO Auto-generated method stub
		List<Course> list =courseMapper.selectLikeCname( name);
		return list;
	}

	@Override
	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		List<Course> list=courseMapper.selectAll();
		return list;
	}

	@Override
	public List<Course> selectByCplayvolume() {
		// TODO Auto-generated method stub
		List<Course> list=courseMapper.selectByCplayvolume();
		return list;
	}

	@Override
	public List<Coursetype> selectAllType() {
		List<Coursetype> list =courseMapper.selectAllType();
		return list;
	}

	@Override
	public List<Course> selectCourseByCtid(int ctid) {
		// TODO Auto-generated method stub
		List<Course> list =courseMapper.selectCourseByCtid(ctid);
		return list;
	}


}

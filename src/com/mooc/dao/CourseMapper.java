package com.mooc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.mooc.entity.Course;

@Repository
public interface CourseMapper {


	List<Course> selectLikeCname(String name);

	List<Course> selectAll();
	
	
	@Select("select * from course where cid=#{cid}")
	public Course selectCourseByCid(int cid);

}

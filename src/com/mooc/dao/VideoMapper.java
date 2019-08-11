package com.mooc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mooc.entity.Video;

@Repository
public interface VideoMapper {

	List<Video> selectVidioByCid(int cid);

	void insertPlayColum(int cid);

	Video showVideoByvid(int vid);
	
	//增加视频
		int addVideo(Video v);
		//查询所有的课程
		List<Video> findAllVideo(int cid);
		//删除指定vid的 视频
		int deleteVideoByVid(int vid);

}

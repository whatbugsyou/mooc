package com.mooc.service;

import java.util.List;

import com.mooc.entity.Video;

public interface VideoService {

	void insertPlayColum(int cid);
	//
	List<Video> selectVidioByCid(int cid);

	Video showVideoByvid(int vid);
	int addVideo(Video v);

	List<Video> findAllVideo(int cid);

	int deleteVideoByVid(int vid);

}

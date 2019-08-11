package com.mooc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.VideoMapper;
import com.mooc.entity.Video;
import com.mooc.service.VideoService;

@Service
public class VideoSerciceImpl implements VideoService {
	@Autowired
	private VideoMapper videoMapper;
	
	@Override
	public List<Video> selectVidioByCid(int cid) {
		 List<Video> list =videoMapper.selectVidioByCid(cid);
		 return list;
	}

	@Override
	public void insertPlayColum(int cid) {
		videoMapper.insertPlayColum(cid);		
	}

	@Override
	public Video showVideoByvid(int vid) {
		Video video =videoMapper.showVideoByvid(vid);
		 return video;
	}

	@Override
	public int addVideo(Video v) {
		// TODO Auto-generated method stub
		return videoMapper.addVideo(v);
	}

	@Override
	public List<Video> findAllVideo(int cid) {
		// TODO Auto-generated method stub
		return videoMapper.findAllVideo(cid);
	}

	@Override
	public int deleteVideoByVid(int vid) {
		// TODO Auto-generated method stub
		return videoMapper.deleteVideoByVid(vid);
	}
}

package com.mooc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mooc.entity.Video;

@Repository
public interface VideoMapper {

	List<Video> selectVidioByCid(int cid);

	void insertPlayColum(int cid);

	Video showVideoByvid(int vid);

}

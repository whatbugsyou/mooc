package com.mooc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mooc.dao.VideoMapper;
import com.mooc.service.VideoService;

@Service
public class VideoSerciceImpl implements VideoService {
	@Autowired
	private static VideoMapper videoMapper;
}

package com.mooc.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mooc.entity.Video;
import com.mooc.service.VideoService;

@Controller
public class VideoController {
	@Autowired
	private VideoService videoService;

	//点击视频后执行这个方法
	@RequestMapping("/showvideo.do")
	@ResponseBody 
	public List<Video> selectVidioByCid(int cid){
		List<Video> list = 	videoService.selectVidioByCid(cid);		
		videoService.insertPlayColum(cid);

		return list;	
	}
	@RequestMapping("/showVideoByvid.do")
	@ResponseBody
	public Video showVideoByvid(int vid){
		Video video = 	videoService.showVideoByvid(vid);		
		System.out.println("测试结果---------------------"+video.getVname());
		System.out.println("测试结果---------------------"+video.getVaddress());

		return video;	
	}
	/**
	 * zsz
	 * 为课程添加视频
	 * @param v
	 * @param pfile
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/addVideo.do")
	public String Addvideo(String vname,String vepisode,String cid,MultipartFile pfile) throws IOException{
		System.out.println("video控制层");
		System.out.println(vname+vepisode+cid);
		Video v = new Video();
		v.setVname(vname);
		v.setVepisode(vepisode);
		int Cid = Integer.parseInt(cid);
		v.setCid(Cid);
		//获取文件名
		String FileName = pfile.getOriginalFilename();
		//随机生成一个新的文件名称
		String newName = UUID.randomUUID().toString().replace("-", "")+FileName.substring(FileName.indexOf("."));
		//获取流来读取文件
		System.out.println(FileName);
		InputStream is = pfile.getInputStream();
		pfile.transferTo(new File("/Users/Hzl/Desktop/"+newName));
		//将v保存到数据库中
		v.setVaddress("/Users/Hzl/Desktop/"+newName);
		System.out.println(v);
		//调用服务层的方法
		int column = videoService.addVideo(v);
		is.close();
		if(column>0){
			return "admin.html";
		}else{
			return "admin.html";
		}
	}
	@RequestMapping("findAllVideo.do")
	@ResponseBody
	public List<Video> findAllVideo(int cid){
		List<Video> list = videoService.findAllVideo(cid);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("deleteVideoByVid.do")
	@ResponseBody
	public int deleteVideoByVid(int vid){
		int i = videoService.deleteVideoByVid(vid);
		return i;
	}
}

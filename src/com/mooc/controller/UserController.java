package com.mooc.controller;

import java.util.List;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HttpServletBean;

import com.mooc.entity.User;
import com.mooc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/login.do")
	public @ResponseBody String login(User user,HttpServletRequest req) {
		System.out.println("�ս�����Ʋ��"+user);
		if(userService.login(user)) {
			req.getSession().setAttribute("user", user);
			return "ok";
		}else {
			return "false";
		}

	}
	
	
	/**
	 * ���������ҳ
	 * @param request
	 * @return ��ǰsession�е�user��Ϣ
	 * @author ����
	 */
	@PostMapping("/enterPersonalCenter.do")
	public @ResponseBody User enterPersonalCenter(HttpServletRequest request) {
		//��session��ȡ����user��Ϣ
		User user = (User)request.getSession().getAttribute("user");
		System.out.println(user);
		return user;
	}
	
	
	
	/**
	 * �޸ĸ���ǩ��
	 * @param signature
	 * @return �޸ĳɹ�����1
	 * @author ����
	 */
	@PostMapping("/changeSignature.do")
	public @ResponseBody int changeSignature(String signature,HttpServletRequest request) {
		//��session��ȡ����user��Ϣ
		User user = (User)request.getSession().getAttribute("user");
		user.setSignature(signature);
		if(userService.changeUser(user)==1) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	/**
	 * ��һ��ͷ��Ԥ������
	 * @return ���ػ���ͷ���ͼƬ·��
	 * @author ����
	 */
	@PostMapping("/preViewPortrait.do")
	public @ResponseBody String preViewPortrait() {
		int random=(int)(Math.random()*4+1);
		String portrait = "img/user-default/u"+random+".jpg";
		System.out.println(portrait);
		return portrait;
	}
	
	
	/**
	 * ȷ������ͷ��(��һ����)������dao��
	 * @return ���ػ���ͷ���ͼƬ·��
	 * @author ����
	 */
	@PostMapping("/changePortraitRandom.do")
	public @ResponseBody int changePortraitRandom(String portrait,HttpServletRequest request) {
		//��session��ȡ����user��Ϣ
		User user = (User)request.getSession().getAttribute("user");
		user.setPortrait(portrait);
		if(userService.changeUser(user)==1) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	
	
	/**
	 * ȷ������ͷ��(�ϴ���)������dao��
	 * @return ���ػ���ͷ���ͼƬ·��
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/changePortraitUpload.do")
	public @ResponseBody String changePortraitUpload(MultipartFile pictureFile,HttpServletRequest request) throws Exception {
		
		// ��ȡͼƬԭʼ�ļ���
        String originalFilename = pictureFile.getOriginalFilename();
        //���ļ�����
        String newFileName = UUID.randomUUID().toString().replace("-", "")+originalFilename.substring(originalFilename.lastIndexOf("."));           
        // ͼƬ�ϴ���浽���ݿ�����·��
        String path = "img/user-upload/"+newFileName ;
        System.out.println(path);
        //ͼƬ�ϴ���洢�ľ���·��
        File uploadPic = new File("E:/GitFileTest/mooc/WebContent/img/user-upload/"+newFileName);
        if(!uploadPic.exists()) {
        	uploadPic.mkdirs();
        }
        //�����д�ļ�
        pictureFile.transferTo(uploadPic);
        
        User user = (User)request.getSession().getAttribute("user");
		user.setPortrait(path);
		int changeUser = userService.changeUser(user);
		if(changeUser==1) {
			return path;
		}
		return "error";
	}
	

	@PostMapping("/register.do")
	public @ResponseBody String register( User user) {
		user.setPortrait("img/user-default/u1.jpg");
		user.setSignature("��û�����ø���ǩ��");
		if(userService.register(user)) {
			return "ok";
		}else {
			return "false";
		}
	}
	@RequestMapping("/isLogin.do")
	public @ResponseBody  User isLogin(HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("user");
		return user;
	}
	@RequestMapping("selectAllUser.do")
	@ResponseBody
	public List<User> selectAllUser(){
		List<User> users = userService.selectAllUser();
		System.out.println(users);
		return users;
	}
	
	@RequestMapping("deleteUserById.do")
	@ResponseBody
	public int deleteUserById(int uid){
		int column = userService.deleteUserById(uid);
		return column;
	}
}

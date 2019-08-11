package com.mooc.controller;

<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.util.UUID;

=======
>>>>>>> 3497af9915ef59150abfc8e8712463831cfd00d6
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
	public @ResponseBody String login( User user,HttpServletRequest req) {
		if(userService.login(user)) {
			req.getSession().setAttribute("user", user);
			return "ok";
		}else {
			return "false";
		}

	}
<<<<<<< HEAD
	
	
	/**
	 * ���������ҳ
	 * @param request
	 * @return ��ǰsession�е�user��Ϣ
	 * @author ����
	 */
	@PostMapping("/enterPersonalCenter.do")
	public @ResponseBody User enterPersonalCenter(HttpServletRequest request) {
//		��session��ȡ����user��Ϣ
//		request.getSession().getAttribute("user");
		User user = userService.enterPersonalCenter();
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
	public @ResponseBody int changeSignature(String signature) {
//		��session��ȡ����user��Ϣ
//		request.getSession().getAttribute("user");	
		User user = new User();
		user.setUid(1);
		user.setAccount("LWG");
		user.setPassword("666666");
		user.setPortrait("img/user-default/u1.jpg");
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
	public @ResponseBody int changePortraitRandom(String portrait) {
//		��session��ȡ����user��Ϣ
//		request.getSession().getAttribute("user");	
		User user = new User();
		user.setUid(1);
		user.setAccount("LWG");
		user.setPassword("666666");
		user.setPortrait(portrait);
		user.setSignature("��ʤ��");
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
	public @ResponseBody String changePortraitUpload(MultipartFile pictureFile) throws Exception {
		
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
        
        User user = new User();
		user.setUid(1);
		user.setAccount("LWG");
		user.setPassword("666666");
		user.setPortrait(path);
		user.setSignature("��ʤ��");
		int changeUser = userService.changeUser(user);
		if(changeUser==1) {
			return path;
		}
		return "img/user-default/u4.jpg";
	}
	

=======
	@PostMapping("/register.do")
	public @ResponseBody String register( User user) {
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
>>>>>>> 3497af9915ef59150abfc8e8712463831cfd00d6
}

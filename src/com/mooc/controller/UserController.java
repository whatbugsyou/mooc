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
	 * 进入个人主页
	 * @param request
	 * @return 当前session中的user信息
	 * @author 国国
	 */
	@PostMapping("/enterPersonalCenter.do")
	public @ResponseBody User enterPersonalCenter(HttpServletRequest request) {
//		从session中取出来user信息
//		request.getSession().getAttribute("user");
		User user = userService.enterPersonalCenter();
		System.out.println(user);
		return user;
	}
	
	
	
	/**
	 * 修改个性签名
	 * @param signature
	 * @return 修改成功返回1
	 * @author 国国
	 */
	@PostMapping("/changeSignature.do")
	public @ResponseBody int changeSignature(String signature) {
//		从session中取出来user信息
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
	 * 换一换头像，预览而已
	 * @return 返回换了头像的图片路径
	 * @author 国国
	 */
	@PostMapping("/preViewPortrait.do")
	public @ResponseBody String preViewPortrait() {
		int random=(int)(Math.random()*4+1);
		String portrait = "img/user-default/u"+random+".jpg";
		System.out.println(portrait);
		return portrait;
	}
	
	
	/**
	 * 确定更换头像(换一换的)，存入dao层
	 * @return 返回换了头像的图片路径
	 * @author 国国
	 */
	@PostMapping("/changePortraitRandom.do")
	public @ResponseBody int changePortraitRandom(String portrait) {
//		从session中取出来user信息
//		request.getSession().getAttribute("user");	
		User user = new User();
		user.setUid(1);
		user.setAccount("LWG");
		user.setPassword("666666");
		user.setPortrait(portrait);
		user.setSignature("曾胜哲");
		if(userService.changeUser(user)==1) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	
	
	/**
	 * 确定更换头像(上传的)，存入dao层
	 * @return 返回换了头像的图片路径
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("/changePortraitUpload.do")
	public @ResponseBody String changePortraitUpload(MultipartFile pictureFile) throws Exception {
		
		// 获取图片原始文件名
        String originalFilename = pictureFile.getOriginalFilename();
        //新文件名称
        String newFileName = UUID.randomUUID().toString().replace("-", "")+originalFilename.substring(originalFilename.lastIndexOf("."));           
        // 图片上传后存到数据库的相对路径
        String path = "img/user-upload/"+newFileName ;
        System.out.println(path);
        //图片上传后存储的绝对路径
        File uploadPic = new File("E:/GitFileTest/mooc/WebContent/img/user-upload/"+newFileName);
        if(!uploadPic.exists()) {
        	uploadPic.mkdirs();
        }
        //向磁盘写文件
        pictureFile.transferTo(uploadPic);
        
        User user = new User();
		user.setUid(1);
		user.setAccount("LWG");
		user.setPassword("666666");
		user.setPortrait(path);
		user.setSignature("曾胜哲");
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

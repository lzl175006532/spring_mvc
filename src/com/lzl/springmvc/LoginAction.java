package com.lzl.springmvc;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzl.domain.StudentVo;

@Controller
public class LoginAction {

	@RequestMapping("/login")
	public String login(){
		
		return "login";
	}
	
	@RequestMapping("/loginSubmit")
	public String loginSubmit(HttpSession session,StudentVo studentVo){
		String studentname = studentVo.getStudent().getStudentname();
		session.setAttribute("userInfo", studentname);
		return "queryStudent";
	}
}

package com.lzl.springmvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzl.domain.Student;
import com.lzl.domain.StudentVo;

@Controller
public class HelloAction {

	@RequestMapping(value = "/hello")
	public String hell(Model model , Integer id,
			HttpServletRequest request,HttpSession session){
		
		request.setAttribute("request", 111);
		Student student1 = new Student();
		student1.setStudentname("张三");
		student1.setAge(1);
		
		Student student2 = new Student();
		student2.setStudentname("李四");
		student2.setAge(11);
		
		
		session.setAttribute("student1", student1.getStudentname());
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		model.addAttribute("studentInfo", studentList);
		return "queryStudent";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(String studentname,Integer age ,Student map,StudentVo studentVo){
		System.out.println(studentVo.getList().get(0).getStudentname());
		return "success";
	}
	
	@RequestMapping("/jasonConvert")
	public @ResponseBody Student responseJson(@RequestBody Student student){
		System.out.println("a");
		return student;
	}
}

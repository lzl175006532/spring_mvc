package com.lzl.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Helloworld implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String msg = "hello world ,this is springmvc";
		modelAndView.addObject("msg",msg);
		modelAndView.setViewName("/helloworld");
		return modelAndView;
	}

}

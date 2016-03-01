package com.ai.test.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	public static int money = 100;
	
	@RequestMapping("/web/toSuccess")
	public String webLogin(){
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute("money", money);
		return "success";
	}
	
	@RequestMapping("/web/reduce")
	public String reduce(){
		money--;
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute("money", money);
		return "success";
	}
	
	@RequestMapping("/web/loginout")
	public String loginout(){
		SecurityUtils.getSubject().logout();
		return "login";
	}
}

package com.ai.test.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestAction {
	
	static int money = 100;
	
	public TestAction(){
		System.out.println("测试Controller已注入");
	}
	
	@RequiresRoles("admin")
//	@RequiresPermissions()
	@ResponseBody
	@RequestMapping("/TestAction/test")
	public String test(HttpServletRequest request){
		System.out.println("这是一个Controller测试123333333333333333");
		return "HelloWorld!";
	}
	
	@RequestMapping("/TestAction/Web/shiroLogin")
	public String shiroLogin(){
		Collection<Object> keys = SecurityUtils.getSubject().getSession().getAttributeKeys();
		System.out.println(keys);
		for(Object key:keys){
			System.out.println("======="+key);
		}
		return "JSP/index";
	}
	
//	@ResponseBody
	@RequestMapping("/TestAction/temp/webTest")
	public ModelAndView test1(HttpSession session,HttpServletResponse response){
		session.setAttribute("name", "Login success");
		response.setHeader("Set-Cookie", "cookiename=cookievalue;");
		ModelAndView view = new ModelAndView("JSP/index");
		view.addObject("money", money);
		return view;
	}
	
	@RequiresRoles("admin")
	@RequestMapping("/TestAction/temp/reduce")
	public ModelAndView reduce(HttpSession session,HttpServletRequest request,HttpServletResponse response){
//		Cookie[] cookies = request.getCookies();
//		for(Cookie c:cookies){
//			System.out.println(c.getName()+"=="+c.getValue());
//		}
//		String cookiename=(String)session.getAttribute("cookiename");
//		System.out.println("cookie====="+cookiename);
//		if(cookiename!=null && cookiename.equals("cookievalue")){
//			System.out.println(cookiename);
//		}
		Object attr = session.getAttribute("name");
		String referer = request.getHeader("Referer");
//		if(referer==null || !referer.contains("127.0.0.1")){
//			return new ModelAndView();
//		}
		System.out.println(referer);
		if(attr!=null && !("").equals(attr)){
			money--;
		}else{
			try {
				response.getWriter().println("非法操作");
				return new ModelAndView("JSP/index");
			} catch (IOException e) {
				e.printStackTrace();
			};
		}
		ModelAndView view = new ModelAndView("JSP/index");
		view.addObject("money", money);
		return view;
	}
	
	@RequestMapping("/TestAction/loginout")
	public String loginOut(HttpSession session){
		session.setAttribute("name","");
		session.setAttribute("money","");
		return "JSP/NewFile";
	}
	
	@ResponseBody
	@RequestMapping("/TestAction/Service/temp/AppTest")
	public String test2(HttpSession session){
		session.setAttribute("name", "已通过验证");
		return "test App";
	}
}

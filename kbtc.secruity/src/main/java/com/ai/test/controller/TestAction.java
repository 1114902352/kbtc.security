package com.ai.test.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAction {
	
	public TestAction(){
		System.out.println("测试Controller已注入");
	}
	
	@RequiresRoles("admin")
	@ResponseBody
	@RequestMapping("/TestAction/test")
	public String test(){
		System.out.println("这是一个Controller测试123333333333333333");
		return "HelloWorld!";
	}
}

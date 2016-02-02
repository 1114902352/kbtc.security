package com.ai.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAction {
	
	public TestAction(){
		System.out.println("测试Controller已注入");
	}
	
	@ResponseBody
	@RequestMapping("/TestAction/test")
	public String test(){
		System.out.println("这是一个Controller测试");
		return "HelloWorld!";
	}
}

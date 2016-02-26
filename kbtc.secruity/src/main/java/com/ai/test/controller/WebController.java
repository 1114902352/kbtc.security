package com.ai.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/web/toSuccess")
	public String webLogin(){
		return "JSP/success";
	}
}

package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class Siscontroller {
	
	@ResponseBody
	@RequestMapping("/code")
	public String code() {
		return "I love coding";
	}
	
	
	@RequestMapping("/book")
	public String book() {
		return "book";
	}

}

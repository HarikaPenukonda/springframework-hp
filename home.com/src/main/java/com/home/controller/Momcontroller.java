package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // to indicate that this class is a controller
public class Momcontroller {
	
	@ResponseBody // returns the response directly instead of the view(html or jsp)
	@RequestMapping("/sugar") //map web requests to the specific controller methods
	public String getSugar() {
		return "Hello! Can you give me some sugar. Thank you!";
	}

}

package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // indicates that the class is a controller
public class Momcontroller {
	
	@ResponseBody // returns the response directly instead of a view(html or jsp)
	@RequestMapping("/sugar") // map web requests to the specific controller methods
	public String getMessage() {
		return "Hello World! Welcome to Java programming";
	}

}

package com.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	
	@RequestMapping("/mycafe")
	public String welcome(Model model) {
		String myName = "Christian Grey";
		model.addAttribute("myName",myName);
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String myOrder(HttpServletRequest request,Model model) {
		
		// handle the data recieved from the user
		String userValue = request.getParameter("foodType");
		
		// set the user data with the model object
		model.addAttribute("userValue", userValue);
		
		return "processOrder";
	}

}

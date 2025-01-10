package com.springcore.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {
	
	@Autowired
	@Qualifier("spanishGreetingService")
	private GreetingService greetingService;
	
	public void greetings(String name) {
		System.out.println(greetingService.greet(name));
	}
	

}

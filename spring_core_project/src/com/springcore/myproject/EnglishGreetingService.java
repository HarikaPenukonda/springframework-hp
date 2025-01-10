package com.springcore.myproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class EnglishGreetingService implements GreetingService{

	@Override
	public String greet(String name) {
		return "Hello my name is " + name;
	}

}

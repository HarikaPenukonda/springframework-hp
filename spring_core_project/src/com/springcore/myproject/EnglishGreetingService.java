package com.springcore.myproject;

public class EnglishGreetingService implements GreetingService{

	@Override
	public String greet(String name) {
		return "Hello! My name is " + name;
	}

}

package com.springcore.myproject;

import org.springframework.stereotype.Component;

@Component
public class SpanishGreetingService implements GreetingService {

	@Override
	public String greet(String name) {
		return "hola mi nombre es " + name ;
	}

	

}

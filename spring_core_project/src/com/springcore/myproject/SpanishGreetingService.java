package com.springcore.myproject;

public class SpanishGreetingService implements GreetingService {

	@Override
	public String greet(String name) {
		return "hola mi nombre es" + name;
	}

}

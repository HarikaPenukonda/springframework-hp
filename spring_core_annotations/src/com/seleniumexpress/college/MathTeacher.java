package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("My name is Mike... I am your Math Teacher");
		
	}

}

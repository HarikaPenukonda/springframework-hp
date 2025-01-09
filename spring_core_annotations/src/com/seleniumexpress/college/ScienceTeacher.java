package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("Hi my name is Holly... I am your science teacher");
		
	}

}

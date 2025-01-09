package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

/*The @Primary annotation designates a bean as the default candidate when
 * multiple beans of the same type exist. If no specific bean is specified
 * during injection, Spring will choose the bean marked with @Primary */

public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("Hi my name is Holly... I am your science teacher");
		
	}

}

package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	@Autowired
	private Principle principle;
	
	@Autowired
	private Teacher teacher;
	
	/*
	 * public College(Principle principle) 
	 * { this.principle = principle; }
	 */
	
	/*
	 * @Autowired public void setPrinciple(Principle principle) { this.principle =
	 * principle; System.out.println("calling setter method..."); }
	 * 
	 * @Autowired public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * }
	 */

	public void test() {
		System.out.println("tesing method...");
		System.out.println("college name is : " + collegeName);
		principle.principleInfo();
		teacher.teach();
	}

}

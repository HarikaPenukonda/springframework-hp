package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class College {
	
	private Principle principle;
	
	private Teacher teacher;
	
	/*
	 * public College(Principle principle) 
	 * { this.principle = principle; }
	 */
	
	public void setPrinciple(Principle principle) {
		this.principle = principle;
		System.out.println("calling setter method...");
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void test() {
		System.out.println("tesing method...");
		principle.principleInfo();
		teacher.teach();
	}

}

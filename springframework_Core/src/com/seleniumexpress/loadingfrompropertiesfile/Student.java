package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String name;
	private String interestedCourse;
	private String hobby;
	
	@Value("Admin")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("Python")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	
	@Value("Coding")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void getDetails() {
		System.out.println("student name : " + name);
		System.out.println("interestedCourse : " + interestedCourse);
		System.out.println("hobby : " + hobby);
	}
	

}

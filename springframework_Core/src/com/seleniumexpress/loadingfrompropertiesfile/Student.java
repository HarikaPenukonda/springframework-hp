package com.seleniumexpress.loadingfrompropertiesfile;

public class Student {
	
	private String name;
	private String interestedCourse;
	private String hobby;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void getDetails() {
		System.out.println("student name : " + name);
		System.out.println("interestedCourse : " + interestedCourse);
		System.out.println("hobby : " + hobby);
	}
	

}

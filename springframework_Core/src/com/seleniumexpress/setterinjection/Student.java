package com.seleniumexpress.setterinjection;

public class Student {
	
	private String studentName;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void studentDetails() {
		System.out.println("Student name is " + studentName);
	}

}

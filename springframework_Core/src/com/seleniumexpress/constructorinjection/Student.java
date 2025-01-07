package com.seleniumexpress.constructorinjection;

public class Student {
	
	private int id;
	private String studentName;
	
	/* Why do we use a constructor? 
	 * To initialize non-static variables
	 * */
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public void getStudentDetails() {
		System.out.println("student name : " + studentName + " and student id is : " + id);
	}
	
	

}

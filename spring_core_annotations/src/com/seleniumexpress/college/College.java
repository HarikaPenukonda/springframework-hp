package com.seleniumexpress.college;

//@Component("collegeBean")
public class College {
	
	private Principle principle;
	
	/*
	 * public College(Principle principle) 
	 * { this.principle = principle; }
	 */

	public void setPrinciple(Principle principle) {
		this.principle = principle;
		System.out.println("calling setter method...");
	}

	public void test() {
		System.out.println("tesing method...");
		principle.principleInfo();
	}

}

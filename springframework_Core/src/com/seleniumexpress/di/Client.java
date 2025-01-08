package com.seleniumexpress.di;

public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		MathCheat cheat = new MathCheat();
		student.setMathCheat(cheat);
		student.cheat();

	}

}

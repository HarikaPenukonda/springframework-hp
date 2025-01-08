package com.seleniumexpress.di;

public class AnotherStudent {
	
	private int id;
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void cheat() {
		mathCheat.cheating();
		System.out.println("my id is " + id);
	}

}

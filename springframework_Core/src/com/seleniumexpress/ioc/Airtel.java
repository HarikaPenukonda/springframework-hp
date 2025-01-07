package com.seleniumexpress.ioc;

public class Airtel implements Sim{
	
	public Airtel() {
		System.out.println("Airtel constructor is called");
	}
	
	public void calling() {
		System.out.println("calling from airtel network");
	}
	
	public void data() {
		System.out.println("browsing internet using airtel internet services");
	}

}

package com.seleniumexpress.ioc;

public class Vodafone implements Sim{
	
	public void calling() {
		System.out.println("calling from vodafone network");
	}
	
	public void data() {
		System.out.println("browsing internet using vodafone internet services");
	}

}

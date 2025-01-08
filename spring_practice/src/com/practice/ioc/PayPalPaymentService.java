package com.practice.ioc;

public class PayPalPaymentService implements PaymentService{

	@Override
	public void processPayment() {
		System.out.println("Processing payment via PayPal");
		
	}

}

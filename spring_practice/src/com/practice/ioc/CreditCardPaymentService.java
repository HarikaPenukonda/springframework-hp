package com.practice.ioc;

public class CreditCardPaymentService implements PaymentService{

	@Override
	public void processPayment() {
		System.out.println("Processing payment via Credit Card");
		
	}

}

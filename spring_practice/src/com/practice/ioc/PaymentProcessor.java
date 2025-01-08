package com.practice.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentProcessor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("loading.. config file..");
		//CreditCardPaymentService credit = context.getBean("cc",CreditCardPaymentService.class);
		PayPalPaymentService paypal = context.getBean("pp",PayPalPaymentService.class);
		paypal.processPayment();
	}

}

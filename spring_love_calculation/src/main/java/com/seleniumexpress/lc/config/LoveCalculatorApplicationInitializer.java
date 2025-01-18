package com.seleniumexpress.lc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		
		
		// create a dispatcherServlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register the dispatcherServlet with servletContext object
		ServletRegistration.Dynamic myCustomServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		// setting up load-on-startup
		myCustomServlet.setLoadOnStartup(1);
		
		// setting up url mapping
		myCustomServlet.addMapping("/");
	}

}

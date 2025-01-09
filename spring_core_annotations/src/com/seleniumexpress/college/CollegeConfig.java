package com.seleniumexpress.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.college")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	/*
	 * @Bean // Dependency Injection using Bean annotation public Principle
	 * principleBean() { return new Principle(); }
	 * 
	 * public Teacher mathTeacher() { return new MathTeacher(); }
	 * 
	 * @Bean public College collegeBean() { // injecting the principleBean using
	 * constructor injection //College college = new College(principleBean());
	 * 
	 * // injecting the principleBean using setter injection College college = new
	 * College(); college.setPrinciple(principleBean());
	 * college.setTeacher(mathTeacher()); return college; }
	 */
}

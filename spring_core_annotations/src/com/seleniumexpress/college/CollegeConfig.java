package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.seleniumexpress.college")
public class CollegeConfig {
	
	@Bean
	public Principle principleBean() {
		return new Principle();
	}
	
	@Bean
	public College collegeBean() {
		College college = new College(principleBean());
		return college;
	}
}

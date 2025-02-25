package com.seleniumexpress.beanlifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO bean = context.getBean("student",StudentDAO.class);
		//dao.deleteStudentRecord(5);
		bean.selectAllRows();
		//((ClassPathXmlApplicationContext)context).close();
		context.registerShutdownHook(); // executes once the main thread ends

	}

}

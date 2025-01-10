package com.seleniumexpress.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	
	private String driver;
	private String url; 
	private String userName;
	private String password;
	
	Connection con;
	
	public void setDriver(String driver) {
		this.driver = driver;
		System.out.println("setting driver...");
	}

	public void setUrl(String url) {
		this.url = url;
		System.out.println("setting url...");
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("setting userName...");
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("setting password...");
	}
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("calling the init method...");
		databaseConnection();
		
	}
	
	public void databaseConnection() throws ClassNotFoundException, SQLException {
		
		// load the driver
		Class.forName(driver);
		
		// get a connection
		con = DriverManager.getConnection(url, userName, password);
		System.out.println("loading the driver and gets a connection");
		
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
			
		// create a statement
		Statement stmt = con.createStatement();
		
		// execute the query
		ResultSet rs = stmt.executeQuery("SELECT * FROM Food.HostelStudentInfo;");
		
		while(rs.next()) {
			int student_id = rs.getInt(1);
			String student_name = rs.getString(2);
			String hostel_fee = rs.getString(3);
			String food_type = rs.getString(4);
			
			System.out.println(student_id + " " + student_name + " " + hostel_fee + " " + food_type);
		}
		
	}
	
	public void deleteStudentRecord(int student_id) throws ClassNotFoundException, SQLException {
		
		// create a statemnt
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("delete from Food.HostelStudentInfo where student_id = " + student_id);
		System.out.println("student id : " + student_id + " has been deleted ");
		
	}
	
	@PreDestroy
	// This method will be called before the bean is removed or destroyed from the container
	public void destroy() throws SQLException {
		System.out.println("inside the destroy method");
		con.close();
	}
	
	

}

package com.seleniumexpress.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/Food?useSSL=false"; 
	private String userName = "root";
	private String password = "admin";
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		// load the driver
		Class.forName(driver);
		
		// get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		
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
		
		// load the driver
		Class.forName(driver);
		
		// establish the connection
		Connection conn = DriverManager.getConnection(url, userName, password);
		
		// create a statemnt
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("delete from Food.HostelStudentInfo where student_id = " + student_id);
		System.out.println("student id : " + student_id + " has been deleted ");
	}
	

}

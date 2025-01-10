package com.seleniumexpress.beanlifecycle;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO dao = new StudentDAO();
		
		dao.deleteStudentRecord(5);
		dao.selectAllRows();

	}

}

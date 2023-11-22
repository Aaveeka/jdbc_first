package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataFromTable {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst", "root", "root");
			
			Statement st = con.createStatement();
			
			int row = st.executeUpdate("delete from employee where age =23");
			
			System.out.println(row+" rows are delete");
			
			con.close();
			
			System.out.println("data deleted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

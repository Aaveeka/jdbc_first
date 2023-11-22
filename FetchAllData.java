package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllData {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst","root","root");
			
			Statement  st = con.createStatement();
			
			String sql = "select * from employee";
			
			ResultSet rst= st.executeQuery(sql);
			
			while (rst.next()) {
//				System.out.println(rst.getInt(1));
//				System.out.println(rst.getString(2));
//				System.out.println(rst.getInt(3));
//				System.out.println(rst.getString(4));
//				System.out.println(rst.getLong(5));
//				System.out.println(rst.getString(6));
//				System.out.println("-------------------------");
				
				System.out.println("id");
				System.out.println("name");
				System.out.println("age");
				System.out.println("mobile");
				System.out.println("email");
				System.out.println("salary");
				System.out.println("-------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

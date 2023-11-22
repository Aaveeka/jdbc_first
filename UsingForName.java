package com.org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingForName {
	public static void main(String[] args) {
		try {
			//step-1:load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2:establish connection between java app and database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc", "root", "root");
			
			// step-3 stcreate platform
			Statement st = con.createStatement();
			
			String sql ="insert into user(id,name,age,mobile) values(1,'ankita',22,8657898878)";
						//step-4:
			st.execute(sql);
			con.close();

			System.out.println("load and Register complete");
			System.out.println("establishing connection");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			//jdbc:mysql://localhost:3306/?user=root
			e.printStackTrace();
		}
	}

}

package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicDataUsingStatement {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst","root", "root");

			Statement st = con.createStatement();

			System.out.println("enter id");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("enter name");
			String name = sc.nextLine();
			
			System.out.println("enter email");
			String email = sc.nextLine();
			
			System.out.println("enter age");
			int age = sc.nextInt();
			
			System.out.println("enter salary");
			int salary = sc.nextInt();
			
			System.out.println("enter mobile");
			int mobile = sc.nextInt();
			
			
			String sql = "insert into employee(id,name,age,salary,mobile,email) values("+id+",'"+name+"',"+age+","+salary+","+mobile+",'"+email+"')";
			
			
			st.executeUpdate(sql);
			
			st.close();
			con.close();
			
			System.out.println("data inserted.....");
			
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

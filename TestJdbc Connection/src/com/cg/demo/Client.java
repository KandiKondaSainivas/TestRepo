package com.cg.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.cg.util.DBUtil;

public class Client {
	public static void main(String args[]) throws Exception {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the employee name"); 
		String name = scanner.nextLine();
		System.out.println("enter the employee salary");
		Double salary = scanner.nextDouble();
		Connection con = DBUtil.getConnection();
		int employee_Id=0;
		String qry = "insert into employee_tbl values(employee_seq.nextval,?,?)";	
		 PreparedStatement pstmt = con.prepareStatement(qry);
		 pstmt.setString(1, name);
		 pstmt.setDouble(2, salary);
		 pstmt.executeUpdate(); 
	    qry = "select employee_seq.currval from dual";
		pstmt = con.prepareStatement(qry);
	    ResultSet rst = pstmt.executeQuery();
	    if(rst.next()) {
	    	employee_Id= rst.getInt(1);
	    }
	     System.out.println("added successfully");
		System.out.println("employee Id= "+ employee_Id);
	       
	}

}

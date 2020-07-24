package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.util.DBUtil;


public class Insert {
	public static void main(String[] args) throws Exception {
		try {
		Connection con = DBUtil.getConnection();
		
		String qry = "insert into employee_tbl values(?,?,?)";		
   
       
       PreparedStatement pstmt = con.prepareStatement(qry);
       pstmt.setInt(1, 1004);
       pstmt.setString(2, "sai");
       pstmt.setFloat(3, 76000);
       pstmt.executeUpdate();
       System.out.println("inserted successfully");
       con.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
       catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}

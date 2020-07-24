package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.util.DBUtil;

public class Delete {
	public static void main(String[] args)throws Exception {
	  try {
		
		String qry = "delete from employee_tbl where empid=?";		
		Connection con = DBUtil.getConnection();
       
       PreparedStatement pstmt = con.prepareStatement(qry);
       pstmt.setInt(1, 1004);
       pstmt.executeUpdate();
       System.out.println("deleted successfully");
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

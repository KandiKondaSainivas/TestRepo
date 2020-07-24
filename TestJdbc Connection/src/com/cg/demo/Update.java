package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.util.DBUtil;

public class Update {
	public static void main(String[] args)throws Exception {
		try {
		Connection con = DBUtil.getConnection();
		
		String qry = "update employee_tbl set empname=? where empid=?";		
        
       PreparedStatement pstmt = con.prepareStatement(qry);
       pstmt.setString(1, "sai");
       pstmt.setInt(2, 1001);
       pstmt.executeUpdate();
       System.out.println("updated successfully");
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

package com.cg.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.util.DBUtil;

public class TestDisplay {
	public static void main(String[] args) throws Exception {
		try {
		Connection con = DBUtil.getConnection();
		String qry = "select empid,empname,empsal from employee_tbl";		
   
       
       PreparedStatement pstmt = con.prepareStatement(qry);
       
      
       ResultSet rst = pstmt.executeQuery();
       
       while(rst.next())
       {
       
       int id = rst.getInt("empid");
       String name = rst.getString("empname");
       double salary = rst.getDouble("empsal");
       System.out.println(id+ "  "+name+"  "+salary);
       

	}
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
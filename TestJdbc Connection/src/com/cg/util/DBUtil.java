package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection()throws Exception{
		String className = "oracle.jdbc.driver.OracleDriver";
		String user="hr";
		String pass="123";
		String url="jdbc:oracle:thin:@localhost:1521:orcal";
		Class.forName(className);
        Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	       
	}

}

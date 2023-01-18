package com.tender.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButility {
      public static Connection DBconnection() {
    	  Connection conn=null;
    	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	  String url="jdbc:mysql://localhost:3306/tender";
    	  
    	  try {
			conn=DriverManager.getConnection(url,"root","dikshant@1003");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	  return conn;
      }
}

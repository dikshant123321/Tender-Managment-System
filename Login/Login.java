package com.tender.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.tender.Bean.Vender;
import com.tender.Exception.VenderException;
import com.tender.Utility.DButility;

public class Login {
	
	 public static boolean  AdministratorLoginAuth() {			
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter Administrator Username");
			String user=scn.next();
			System.out.println("Enter Admin Password");
			String pass=scn.next();
			if(user.equals("admin")&&pass.equals("admin@123")) {
				return true;
			}else{
				return false;
				
			}	
		}
	 
	 
	 
	 public static Vender  VenderLoginAuth() throws VenderException{			
			Vender veder=null;
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter Vender UserName");
			String username=scn.next();
			System.out.println("Enter Vender Password");
			String password=scn.next();
			try(Connection conn=DButility.DBconnection()){
				PreparedStatement ps=conn.prepareStatement("select * from vender where username=?");
				ps.setString(1, username);
				
				
				ResultSet rs= ps.executeQuery();
				if(rs.next())
				{
					int id=rs.getInt("id");
					String username1=rs.getString("username");
					String password1=rs.getString("password");
					String address=rs.getString("address");
					String email=rs.getString("email");
                    veder=new Vender(id, username1, password1, address, email);
                    if(!password1.equals(password))
                    {
                    	throw new VenderException("Wrong Password");
                    }
                    
				}
				else
				{
					throw new VenderException("username not exist");
				}
				
				
			} catch (SQLException e) {
				throw new VenderException(e.getMessage());
			}

			return veder;
		}
	
	
	
}

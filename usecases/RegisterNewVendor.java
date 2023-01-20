package com.tender.usecases;

import java.util.Scanner;

import com.tender.Bean.Vender;
import com.tender.Dao.AdministratorDao;
import com.tender.Dao.AdministratorDaoImple;
import com.tender.Exception.VenderException;

public class RegisterNewVendor {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Vender id : ");
		int id=scn.nextInt();
		
		System.out.print("Enter venter Username : ");
		String username=scn.next();
		
		System.out.print("Enter venter Password : ");
		String password=scn.next();
		
		System.out.print("Enter venter Address : ");
		String Address=scn.next();
		
		System.out.print("Enter venter Email Address : ");
		String email=scn.next();
		
		Vender v=new Vender(id, username, password, Address, email);
		
		AdministratorDao adao=new AdministratorDaoImple();
		
		String s;
		try {
			s = adao.registerNewVendor(v);
			System.out.println(s);
		} catch (VenderException e) {
			System.out.println(e.getMessage());
			
		}
		

	}

}

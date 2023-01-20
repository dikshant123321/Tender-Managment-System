package com.tender.usecases;

import java.util.Scanner;

import com.tender.Bean.Tender;
import com.tender.Dao.AdministratorDao;
import com.tender.Dao.AdministratorDaoImple;
import com.tender.Exception.TenderException;

public class CreateNewTender {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Tender Id : ");
		int tid=scn.nextInt();
		System.out.println("Enter Tender Username : ");
		String username=scn.next();
		System.out.println("Enter Tender Type : ");
		String type=scn.next();
		System.out.println("Enter Tender Price : ");
		int price =scn.nextInt();
		System.out.println("Enter Tender Location : ");
		String location =scn.next();
		
		Tender tender=new Tender(tid, username, type, price, location);
		AdministratorDao dao=new AdministratorDaoImple();
		String str;
		try {
			str = dao.createNewTender(tender);
			System.out.println(str);
		} catch (TenderException e) {
			System.out.println(e.getMessage());
			
		}
		

	}

}

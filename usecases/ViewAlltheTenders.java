package com.tender.usecases;

import java.util.List;
import java.util.Scanner;

import com.tender.Bean.Tender;
import com.tender.Dao.AdministratorDao;
import com.tender.Dao.AdministratorDaoImple;
import com.tender.Exception.TenderException;

public class ViewAlltheTenders {

	public static void main(String[] args) {
		AdministratorDao dao=new AdministratorDaoImple();
		List<Tender> tender;
		try {
			tender = dao.ViewAlltheTenders();
			System.out.println("============================================================");
			tender.forEach(s->{
				System.out.println("Tender Id : " +s.getId());
				System.out.println("Tender username :"+s.getUsername());
				System.out.println("Tender Type : "+s.getType());
				System.out.println("Tender Price : "+s.getPrice());
				System.out.println("Tender Location : "+s.getLocation());
				System.out.println("==========================================================");
			});
		} catch (TenderException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
//private  int id;
//private String username;
//private String type;
//private int price;
//private String location;
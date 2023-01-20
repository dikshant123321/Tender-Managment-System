package com.tender.usecases;

import java.util.List;
import java.util.Scanner;

import com.tender.Bean.Bidder;
import com.tender.Dao.AdministratorDao;
import com.tender.Dao.AdministratorDaoImple;
import com.tender.Exception.TenderException;

public class ViewAlltheBidsoftender {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Tender ID : ");
		int tid=scn.nextInt();
		AdministratorDao dao=new AdministratorDaoImple();
		List<Bidder> bidder;
		try {
			bidder = dao.ViewAlltheBidsoftender(tid);
			bidder.forEach(s->{
				System.out.println("Bidder Id : "+s.getBnum());
				System.out.println("Tender Id : "+s.getTid());
				System.out.println("vender ID : "+s.getVid());
				System.out.println("Bidder Price : "+s.getBprice());
				System.out.println("Bidder Status : "+s.getBstatus());
			});
		} catch (TenderException e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}

}

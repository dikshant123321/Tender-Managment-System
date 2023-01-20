package com.tender.usecases;

import java.util.Scanner;

import com.tender.Bean.Bidder;
import com.tender.Dao.VenderDao;
import com.tender.Dao.VenderDaoImple;
import com.tender.Exception.TenderException;

public class PlaceABidAgainstTender {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Bidder Id");
		int bid=scn.nextInt();
		
		System.out.println("Enter Tender ID ");
		int tid=scn.nextInt();
		System.out.println("Enter Vender Id ");
		int vid=scn.nextInt();
		System.out.println("Enter Bidder Price ");
		int price=scn.nextInt();
		
		String bstatus="selected";
		
		VenderDao dao=new VenderDaoImple();
		Bidder bider=new Bidder(bid, tid, vid, price, bstatus);
		try {
			String str=dao.PlaceABidAgainstTender(bider);
			System.out.println(str);
		} catch (TenderException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

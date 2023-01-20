package com.tender.usecases;

import java.util.Scanner;

import com.tender.Bean.Bidder;
import com.tender.Dao.VenderDao;
import com.tender.Dao.VenderDaoImple;
import com.tender.Exception.BidderException;

public class ViewhisownBidHistory {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Bidder ID : ");
		int bidder=scn.nextInt();
		VenderDao dao=new VenderDaoImple();
		Bidder b;
		try {
			b = dao.ViewhisownBidHistory(bidder);
			System.out.println(b);
		} catch (BidderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

package com.tender.usecases;

import java.util.Scanner;

import com.tender.Dao.VenderDao;
import com.tender.Dao.VenderDaoImple;
import com.tender.Exception.BidderException;

public class ViewstatusofBid {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Bidder ID : ");
		int bid=scn.nextInt();
		VenderDao dao=new VenderDaoImple();
		String str;
		try {
			str = dao.ViewstatusofBid(bid);
			System.out.println(str);
		} catch (BidderException e) {
			System.out.println(e.getMessage());
		}
		

	}

}

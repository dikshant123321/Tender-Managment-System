package com.tender.panels;

import java.util.Scanner;
import com.tender.Bean.Vender;
import com.tender.customs.ConsoleColors;
import com.tender.usecases.Assigntendertovendor;
import com.tender.usecases.CreateNewTender;
import com.tender.usecases.PlaceABidAgainstTender;
import com.tender.usecases.RegisterNewVendor;
import com.tender.usecases.ViewAllTheCurrentTenders;
import com.tender.usecases.ViewAlltheBidsoftender;
import com.tender.usecases.ViewAlltheTenders;
import com.tender.usecases.Viewallthevendors;
import com.tender.usecases.ViewhisownBidHistory;
import com.tender.usecases.ViewstatusofBid;
public class Panel {
//=====================================admin()===============================================================
	public static void admin() {
		try {
		System.out.println();
		Thread.sleep(300);
		System.out.println(ConsoleColors.BROWN+"╰┈┈┈┈➤ 1.  Register New Vendor");
		Thread.sleep(300);
		System.out.println("╰┈┈┈┈➤ 2.  View all the vendors.");
		Thread.sleep(300);
		System.out.println("╰┈┈┈┈➤ 3.  Create new tenders.");
		Thread.sleep(300);
		System.out.println("╰┈┈┈┈➤ 4.  View All the Tenders.");
		Thread.sleep(300);
		System.out.println("╰┈┈┈┈➤ 5.  View All the Bids of a tender.");
		Thread.sleep(300);
		System.out.println("╰┈┈┈┈➤ 6.  Assign tender to a vendor.");
		Thread.sleep(300);
		System.out.println("╰┈┈┈┈➤ 7.  EXIT"+ConsoleColors.RESET);
		Thread.sleep(500);
		System.out.println();
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"———————— CHOOSE OPTION ————————"+ConsoleColors.RESET);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			RegisterNewVendor.main(null);
			Panel.admin();
			break;
		case 2:
			Viewallthevendors.main(null);
			Panel.admin();
			break;
		case 3:
			CreateNewTender.main(null);
			Panel.admin();
			break;
		case 4:
			ViewAlltheTenders.main(null);
			Panel.admin();
			break;
		case 5:
			ViewAlltheBidsoftender.main(null);
			Panel.admin();
			break;
		case 6:
			Assigntendertovendor.main(null);
			Panel.admin();
			break;
		
		case 7:
			System.out.println();
			System.out.println(ConsoleColors.GREEN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT+"     Thank You     "+ConsoleColors.RESET);
			return;
		default:
			System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT+"  Wrong Input  "+ConsoleColors.RESET);
	    
	}
	
}
	
	//===============================================================================================
	public static void welcomeAdministrater() {
		try {
			System.out.println();
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"████████████████████████████████████████████████████████████████████████████████"+ConsoleColors.RESET);
			System.out.println();
			Thread.sleep(500);
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"»»——————————————————————————"+ConsoleColors.RESET+ConsoleColors.BROWN_BACKGROUND+ConsoleColors.WHITE_BOLD_BRIGHT+"  WELCOME TO ADMIN DASHBOARD  "+ConsoleColors.RESET+ConsoleColors.PURPLE_BOLD_BRIGHT+"——————————————————————————««"+ConsoleColors.RESET);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//===============================================================================================	
	
	 public static void vender(Vender vender) {
	    	try {
	    	System.out.println();
	    	Thread.sleep(300);
			System.out.println(ConsoleColors.BROWN+"╰┈┈┈┈➤ 1.   View all the current Tenders.");
			Thread.sleep(300);
			System.out.println("╰┈┈┈┈➤ 2.   Place a Bid against a Tender.");
			Thread.sleep(300);
			System.out.println("╰┈┈┈┈➤ 3.   View status of a Bid");
			Thread.sleep(300);
			System.out.println("╰┈┈┈┈➤ 4.   View his own Bid History.");
			Thread.sleep(300);
			System.out.println("╰┈┈┈┈➤ 5.   EXIT"+ConsoleColors.RESET);
			Thread.sleep(500);
			System.out.println();
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"———————— CHOOSE OPTION ————————"+ConsoleColors.RESET);
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	switch(n) {
			case 1:
				ViewAllTheCurrentTenders.main(null);
				Panel.vender(vender);
				break;
			case 2:
				PlaceABidAgainstTender.main(null);
				Panel.vender(vender);
				break;
			case 3:
				ViewstatusofBid.main(null);
				Panel.vender(vender);
				break;
			case 4:
				ViewhisownBidHistory.main(null);
				Panel.vender(vender);
				break;
			case 5:
				System.out.println();
				System.out.println(ConsoleColors.GREEN_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT+"     Thank You     "+ConsoleColors.RESET);
				return;
				default:
					System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT+"  Wrong Input  "+ConsoleColors.RESET);
			}
	    }
	
	   
//=========================================================================================================	
	 
	 
	    public static void welcomeVender(Vender vender) {
			try {
				System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"████████████████████████████████████████████████████████████████████████████████"+ConsoleColors.RESET);
				System.out.println();
				Thread.sleep(500);
				System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"»»——————————————————————————"+ConsoleColors.RESET+ConsoleColors.BROWN_BACKGROUND+ConsoleColors.WHITE_BOLD_BRIGHT+"  WELCOME TO VENDER DASHBOARD  "+ConsoleColors.RESET+ConsoleColors.PURPLE_BOLD_BRIGHT+"——————————————————————————««"+ConsoleColors.RESET);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	
	
}

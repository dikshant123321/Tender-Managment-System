package com.tender.Login;
import java.util.Scanner;
import com.tender.Bean.Vender;
import com.tender.Exception.VenderException;
import com.tender.customs.*;
import com.tender.panels.Panel;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true)
		{
			System.out.println("\r\n"+ConsoleColors.PURPLE_BOLD_BRIGHT+""
					+"╔════════════════════════════════════════════════════════════════╗\r\n"+ConsoleColors.RESET
					+"         "+ConsoleColors.BROWN_BACKGROUND+ConsoleColors.WHITE_BOLD_BRIGHT+"    Welcome to Tender Managment Application : \r\n"+ConsoleColors.RESET
					+ConsoleColors.PURPLE_BOLD_BRIGHT+"╚════════════════════════════════════════════════════════════════╝\r\n"+ConsoleColors.RESET
					+"                                                                                               \r\n"
					+ConsoleColors.BLUE_BOLD_BRIGHT+"Choose Login Option from Below According to your Designation  :\r\n" + ConsoleColors.RESET
					+"1. Admin login\r\n"
					+"2. Vender login\r\n"
					+"3. Exit");
			
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"▃▃▃▃▃▃▃▃▃▃ Choose Option ▃▃▃▃▃▃▃▃▃▃▃"+ConsoleColors.RESET);
			System.out.println();
			int choice=scn.nextInt();
			
			
			
			switch(choice)
			{
			
			case 1:
				if(Login.AdministratorLoginAuth()) {
                 Panel.welcomeAdministrater();
                 Panel.admin();
				}
				else {
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND + ConsoleColors.WHITE_BOLD_BRIGHT+"  Wrong Credentials Try Again  "+ConsoleColors.RESET);
				}
				break;
			case 2:
				try {
					Vender v=Login.VenderLoginAuth();
					Panel.welcomeVender(v);
					Panel.vender(v);
				} catch (VenderException e) {
					System.out.println(e.getMessage());
				}
			
			}
		}

	}

}

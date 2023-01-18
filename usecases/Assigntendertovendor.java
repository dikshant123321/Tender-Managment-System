package com.tender.usecases;

import java.util.Scanner;

import com.tender.Dao.AdministratorDao;
import com.tender.Dao.AdministratorDaoImple;

public class Assigntendertovendor {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Vender ID : ");
		int vid=scn.nextInt();
		System.out.println("Enter Tender ID : ");
		int tid=scn.nextInt();
		
		AdministratorDao dao=new AdministratorDaoImple();
		String str=dao.Assigntendertovendor(vid, tid);
		System.out.println(str);

	}

}

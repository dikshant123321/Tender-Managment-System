package com.tender.usecases;

import java.util.List;

import com.tender.Bean.Vender;
import com.tender.Dao.AdministratorDao;
import com.tender.Dao.AdministratorDaoImple;

public class Vewallthevendors {

	public static void main(String[] args) {
		AdministratorDao dao=new AdministratorDaoImple();
		
		List<Vender> vender=dao.viewallthevendors();
		System.out.println("================================================================================");
		vender.forEach(s->{
			System.out.println("Vender id : "+s.getId());
			System.out.println("Vender Username : "+s.getUsername());
			System.out.println("Vender password : "+s.getPassword());
			System.out.println("Vender address : "+s.getAddress());
			System.out.println("Vender Email : "+s.getEmail());
			System.out.println("============================================================================");
		});

	}

}

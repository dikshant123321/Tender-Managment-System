package com.tender.usecases;

import java.util.List;

import com.tender.Bean.Tender;
import com.tender.Bean.Vender;
import com.tender.Dao.VenderDao;
import com.tender.Dao.VenderDaoImple;
import com.tender.Exception.TenderException;

public class ViewAllTheCurrentTenders {

	public static void main(String[] args) {
		VenderDao dao=new VenderDaoImple();
		List<Tender> list;
		try {
			list = dao.viewAllTheCurrentTenders();
			list.forEach(s->{
				System.out.println("Tender id : "+s.getId());
				System.out.println("Tender username : "+s.getUsername());
				System.out.println("Tender password : "+s.getType());
				System.out.println("Tender address : "+s.getPrice());
				System.out.println("Iender email : "+s.getLocation());
			});
		} catch (TenderException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}

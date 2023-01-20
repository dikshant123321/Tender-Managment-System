package com.tender.Dao;

import java.util.List;

import com.tender.Bean.Bidder;
import com.tender.Bean.Tender;
import com.tender.Bean.Vender;
import com.tender.Exception.TenderException;
import com.tender.Exception.VenderException;

public interface AdministratorDao {

	public String registerNewVendor(Vender vender)throws VenderException;
	public List<Vender> viewallthevendors()throws VenderException;
	public String createNewTender(Tender tender) throws TenderException;
	public List<Tender> ViewAlltheTenders()throws TenderException;
	public List<Bidder> ViewAlltheBidsoftender(int tid)throws TenderException;
	public String Assigntendertovendor(int vid, int tid)throws VenderException;
}

package com.tender.Dao;

import java.util.List;

import com.tender.Bean.Bidder;
import com.tender.Bean.Tender;
import com.tender.Bean.Vender;

public interface AdministratorDao {

	public String registerNewVendor(Vender vender);
	public List<Vender> viewallthevendors();
	public String createNewTender(Tender tender);
	public List<Tender> ViewAlltheTenders();
	public List<Bidder> ViewAlltheBidsoftender(int tid);
	public String Assigntendertovendor(int vid, int tid);
}

package com.tender.Dao;

import java.util.List;

import com.tender.Bean.Bidder;
import com.tender.Bean.Tender;
import com.tender.Bean.Vender;
import com.tender.Exception.BidderException;
import com.tender.Exception.TenderException;

public interface VenderDao {

	public List<Tender> viewAllTheCurrentTenders()throws TenderException;
	public String  PlaceABidAgainstTender(Bidder bider)throws TenderException;
	public String ViewstatusofBid(int BidderId) throws BidderException;
	public Bidder ViewhisownBidHistory(int Bid)throws BidderException;
	
}

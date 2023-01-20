package com.tender.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.tender.Bean.Bidder;
import com.tender.Bean.Tender;
import com.tender.Bean.Vender;
import com.tender.Exception.BidderException;
import com.tender.Exception.TenderException;
import com.tender.Utility.DButility;

public class VenderDaoImple implements VenderDao{

	@Override
	public List<Tender> viewAllTheCurrentTenders()throws TenderException {
		List<Tender> list=new ArrayList<>();
		try(Connection conn=DButility.DBconnection()){
			PreparedStatement ps=conn.prepareStatement("select * from tender");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt("id");
				String username=rs.getString("username");
				String type=rs.getString("type");
				int price=rs.getInt("price");
				String location =rs.getString("location");
				
				Tender tender=new Tender(id, username, type, price, location);
				list.add(tender);
			}
			if(list.isEmpty())
			{
				throw new TenderException("Tendes Doen't Exist !!");
			}
		} catch (SQLException e) {
			throw new  TenderException(e.getMessage());
			
		}

		return list;
	}
//======================================ViewstatusofBid====================================
	@Override
	public String ViewstatusofBid(int BidderId)throws BidderException {
		String bidder="Not valid BidderId";
		try(Connection conn=DButility.DBconnection()){
			PreparedStatement pr=conn.prepareStatement("Select * from bidder where bnum=?");
			pr.setInt(1, BidderId);
			ResultSet rs=pr.executeQuery();
			if(rs.next())
			{
				
				bidder=rs.getString("bstatus");
			}
			else
			{
				throw new BidderException("With this Biider Id Does't exist");
			}
			
		} catch (Exception e) {
			throw new BidderException(e.getMessage());
		}
		return bidder;
	}
	@Override
	public Bidder ViewhisownBidHistory(int Bid)throws BidderException {
		Bidder bidder=null;
		try(Connection conn=DButility.DBconnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from bidder where bnum=?");
			 ps.setInt(1,Bid);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				int bnum=rs.getInt("bnum");
				int tid=rs.getInt("tid");
				int vid=rs.getInt("bprice");
				int bprice=rs.getInt("bprice");
				String bstatus=rs.getString("bstatus");
				bidder=new Bidder(bnum, tid, vid, bprice, bstatus);
  
			}
			else
			{
				throw new BidderException("Bidder History Does't Exist");
			}
			
		} catch (SQLException e) {
			throw new BidderException(e.getMessage());
		}
		
		return bidder;
	}
	
//	============================PlaceABidAgainstTender========================================================
	@Override
	public String PlaceABidAgainstTender(Bidder bidder)throws TenderException {
		String message="Bidding failed ";
		
		try(Connection conn=DButility.DBconnection()){
			 PreparedStatement ps=conn.prepareStatement("select * from bidder where tid=?");
			 ps.setInt(1, bidder.getTid());
			ResultSet rs= ps.executeQuery();
			if(!rs.next())
			{
				PreparedStatement ps1=conn.prepareStatement("insert into bidder values(?,?,?,?,?)");
				ps1.setInt(1, bidder.getBnum());
				ps1.setInt(2, bidder.getTid());
				ps1.setInt(3, bidder.getVid());
				ps1.setInt(4,bidder.getBprice());
				ps1.setString(5, bidder.getBstatus());
				int x=ps1.executeUpdate();
				if(x>0)
				{
					message="Bidder place successfully....";
				}
				else
				{
					throw new TenderException("Enter Correct infomation.....");
				}

			}
			
			
		} catch (SQLException e) {
			throw new TenderException(e.getMessage());
		}
		
		return message;
	}

}

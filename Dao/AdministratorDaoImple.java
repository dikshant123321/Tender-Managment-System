package com.tender.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.tender.Bean.Bidder;
import com.tender.Bean.Tender;
import com.tender.Bean.Vender;
import com.tender.Utility.DButility;

public class AdministratorDaoImple implements AdministratorDao{

//==============================RegisterNewVendor================================================================
	@Override
	public String registerNewVendor(Vender vender) {
		String message="Vender Not Register....";
		try(Connection conn=DButility.DBconnection()){
			PreparedStatement ps=conn.prepareStatement("insert into vender values(?,?,?,?,?)");
			ps.setInt(1,vender.getId());
			ps.setString(2,vender.getUsername());
			ps.setString(3, vender.getPassword());
			ps.setString(4,vender.getAddress());
			ps.setString(5,vender.getEmail());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				message="Vender Register Successful....";
			}

		} catch (SQLException e) {
			e.getMessage();
		}
		return message;
	}
//=========================================viewallthevendors=========================================================
	@Override
	public List<Vender> viewallthevendors() {
		List<Vender> list=new ArrayList<>();
		try(Connection conn=DButility.DBconnection()){
			PreparedStatement ps=conn.prepareStatement("select * from vender");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt("id");
				String username=rs.getString("username");
				String password=rs.getString("password");
				String address=rs.getString("address");
				String email=rs.getString("email");
				Vender vender=new Vender(id, username, password, address, email);
				list.add(vender);
				
				
			}
			
		} catch (SQLException e) {
		   e.getMessage();
		}
		
		
		
		return list;
	}
	
//	============================createNewTender=============================================
	@Override
	public String createNewTender(Tender tender) {
		String message="Opps...Tender not created! Please Try Again ";
		
		try(Connection conn=DButility.DBconnection()){
			PreparedStatement ps=conn.prepareStatement("insert into tender values(?,?,?,?,?)");
			ps.setInt(1, tender.getId());
			ps.setString(2, tender.getUsername());
			ps.setString(3,tender.getType());
			ps.setInt(4,tender.getPrice());
			ps.setString(5, tender.getLocation());
			int x=ps.executeUpdate();
			if(x>0)
			{
			   message="Tender created..";
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		return message;
		
	}
	
//	=====================================ViewAlltheTenders========================================================
	@Override
	public List<Tender> ViewAlltheTenders() {
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
				String locaction=rs.getString("location");
				Tender t=new Tender(id, username, type, price, locaction);
				list.add(t);
				
				
			}
		} catch (SQLException e) {
		      e.getMessage();
		}
		return list;
	}
	
//	============================================ViewAlltheBidsoftender==========================================
	@Override
	public List<Bidder> ViewAlltheBidsoftender(int tid) {
		List<Bidder> bidder=new ArrayList<>();
		try(Connection conn=DButility.DBconnection()){
			PreparedStatement ps=conn.prepareStatement("select * from bidder where  tid=?");
			ps.setInt(1, tid);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int bnum=rs.getInt("bnum");
				int tid1=rs.getInt("tid");
				int vid=rs.getInt("vid");
				int bprice=rs.getInt("bprice");
				String bstatus=rs.getString("bstatus");
				
				Bidder b=new Bidder(bnum, tid1, vid, bprice, bstatus);
				bidder.add(b);
				
				

			}
			
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		return bidder;
	}
	
//	================================Assigntendertovendor=======================================================
	@Override
	public String Assigntendertovendor(int vid, int tid) {
		String message="Not Assin tender to vender   !!!!";
		try(Connection conn=DButility.DBconnection()){
          PreparedStatement ps = conn.prepareStatement("update bidder set bstatus = 'selected' where vid=? AND tid=?");
			ps.setInt(1, vid);
			ps.setInt(2, tid);
			int x = ps.executeUpdate();
			if(x>0) {
				message= "Tender assigned successfully...";
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		return message;
	}

}

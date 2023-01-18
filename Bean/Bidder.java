package com.tender.Bean;

public class Bidder {
    private int bnum;
    private int  tid;
    private int vid;
    private int bprice;
    private String bstatus;
    
    public Bidder() {
    	
    }

	public Bidder(int bnum, int tid, int vid, int bprice, String bstatus) {
		super();
		this.bnum = bnum;
		this.tid = tid;
		this.vid = vid;
		this.bprice = bprice;
		this.bstatus = bstatus;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	public String getBstatus() {
		return bstatus;
	}

	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}

	@Override
	public String toString() {
		return "Bidder [bnum=" + bnum + ", tid=" + tid + ", vid=" + vid + ", bprice=" + bprice + ", bstatus=" + bstatus
				+ "]";
	}
    
    
    
    
}

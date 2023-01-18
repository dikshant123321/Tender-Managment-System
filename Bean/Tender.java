package com.tender.Bean;

public class Tender {
    private  int id;
    private String username;
    private String type;
    private int price;
    private String location;
    
    
    public Tender() {
    	
    }


	public Tender(int id, String username, String type, int price, String location) {
		super();
		this.id = id;
		this.username = username;
		this.type = type;
		this.price = price;
		this.location = location;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Tender [id=" + id + ", username=" + username + ", type=" + type + ", price=" + price + ", location="
				+ location + "]";
	}
    
    
}

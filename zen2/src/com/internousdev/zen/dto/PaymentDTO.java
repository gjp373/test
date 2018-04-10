package com.internousdev.zen.dto;

public class PaymentDTO {
	private int userID;
	private String productName;
	private String Price;
	private String productCount;

	public String getProductName(){
		return productName;
	}

	public void setProductID(String productName){
		this.productName=productName;
	}
	public String getPrice(){
		return Price;
	}

	public void setPrice(String Price){
		this.Price=Price;
	}

	public String getProductCount(){
		return productCount;
	}

	public void setProductCount(String productCount){
		this.productCount=productCount;
	}

	public int getUserId(){
		return userID;
	}

	public void setUserID(int userID){
		this.userID=userID;
	}

}

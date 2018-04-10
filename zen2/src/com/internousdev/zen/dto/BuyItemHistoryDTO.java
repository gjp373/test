package com.internousdev.zen.dto;

public class BuyItemHistoryDTO {

	public String user_id;

	public String product_name;


	public String product_count;

	public String price;

	public String regist_date;

	public String update_date;


	public String getUserid(){
		return user_id;
	}
	public void setUser_id(String user_id){
		this.user_id=user_id;
	}

	public String getProduct_name(){
		return product_name;
	}
	public void setProduct_name(String product_name){
		this.product_name=product_name;
	}

	public String getProduct_count(){
		return product_count;
	}

	public void setProduct_count(String product_count){
		this.product_count=product_count;
	}


	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}

	public String getRegist_date(){
		return regist_date;
	}

	public void setRegist_date(String regist_date){
		this.regist_date=regist_date;
	}

	public String getUpdate_date(){
		return update_date;
	}

	public void setUpdate_date(String update_date){
		this.update_date=update_date;
	}



}

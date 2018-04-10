package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.PaymentCompleteDAO;
import com.internousdev.zen.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentCompleteAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private int id;
	private String token;
	public String execute(){
		String sessionToken=(String)session.get("token");
		if(sessionToken == null || !(token.equals(sessionToken))){
			return ERROR;
		}

		session.remove("token");

		LoginDTO loginDTO=(LoginDTO)session.get("loginUser");
		String userId=loginDTO.getUserName();

		@SuppressWarnings("unchecked")
		ArrayList<CartDTO>purchasedItems=(ArrayList<CartDTO>)session.get("cart");

		int purchaseResult=0;
		int cartResult=0;

		PaymentCompleteDAO paymentDAO=new PaymentCompleteDAO();
		purchaseResult=PaymentCompleteDAO.insertNewProsuctCount(userId,purchasedItems,id);

		cartResult=paymentDAO.deleteCartItems(userId,purchasedItems);

		if(purchaseResult==0 || cartResult==0){
			return ERROR;
		}

		session.remove("cart");
		session.remove("price");
		session.remove("latestAddress");
		session.remove("addressList");

		return SUCCESS;

	}

	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getToken(){
		return token;
	}
	public void setToken(String token){
		this.token=token;
	}

}

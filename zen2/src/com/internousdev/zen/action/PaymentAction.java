package com.internousdev.zen.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.PaymentDAO;
import com.internousdev.zen.dto.LoginDTO;
import com.internousdev.zen.util.CSRFUtil;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;

	private String token;
	private int latestAddress;

	public String execute(){
		LoginDTO loginDTO=(LoginDTO)session.get("loginUser");

		if(loginDTO==null){
		session.put("target", "payment");
		return "login";
		}

		String userId=loginDTO.getUserName();
		PaymentDAO paymentDAO=new PaymentDAO();
		ArrayList<CartDTO> cartList=paymentDAO.getCartProductInfo(user_id);
		if(cartList.isEmpty()){
			return "cart";
		}

		int totalPrice=0;
		for(CartDTO dto: cartList){
			if(dto.isStockFlg()) return "cart";
			totalPrice += dto.getTotalPrice();
		}

	session.put("cart",cartList);
	session.put("totalPrice", totalPrice);

	DestinationDAO destinationDAO=new DestinationDAO();
	ArrayList<DestinationDTO>addressList=destinationDAO.getDestinationList(user_id);
	if(!(addressList.isEmpty())){
		int length=addressList.size();
		latestAddress=addressList.get(length - 1).getId();
	}

	session.put("latestAddress",latestAddress);
	session.put("addressList",addressList);

	token=new CSRFUtil().makeToken();
	session.put("token",token);

	return SUCCESS;

}

	public Map<String,Object>getSession(){
		return session;
	}

	public void setSession(Map<String,Object>session){
		this.session=session;
	}

	public String getToken(){
		return token;
	}

	public void setToken(String token){
		this.token=token;
	}

	public int getLatestAddress(){
		return latestAddress;
	}

	public void setLatestAddress(int latestAddress){
		this.latestAddress=latestAddress;
	}

}

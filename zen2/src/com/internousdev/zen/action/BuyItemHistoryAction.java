package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.BuyItemHistoryDAO;
import com.internousdev.zen.dto.BuyItemHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;


public class BuyItemHistoryAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	public ArrayList<BuyItemHistoryDTO> buyItemHistoryDTOList;
	private String deleteFlg;
	private String message;
	private BuyItemHistoryDAO dao;


	public String execute()throws SQLException{
		session.put("user_id","jiro");
		if(!session.containsKey("user_id")){
			return ERROR;
		}
		if(deleteFlg==null){
			String purchase_history_info=session.get("user_id").toString();
			BuyItemHistoryDAO dao = new BuyItemHistoryDAO();
			buyItemHistoryDTOList = dao.getMyPageUserInfo(purchase_history_info);
			}else if(deleteFlg.equals("1")){
				delete();
			}
		String result=SUCCESS;
		return result;
	}

	public void delete()throws SQLException{

		String purchase_history_info=session.get("user_id").toString();

		int res= dao.buyItemHistoryDelete(purchase_history_info);

		if(res>0){
			buyItemHistoryDTOList=null;
			setMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");

		}
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
//	@Override



	public void setSession(Map<String,Object>session){
		this.session=session;
	}

	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message=message;
	}

	public ArrayList<BuyItemHistoryDTO> getBuyItemHistoryDTOList() {
		return buyItemHistoryDTOList;
	}

	public void setBuyItemHistoryDTOList(ArrayList<BuyItemHistoryDTO> buyItemHistoryDTOList) {
		this.buyItemHistoryDTOList = buyItemHistoryDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}



}



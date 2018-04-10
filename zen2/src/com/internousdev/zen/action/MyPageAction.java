package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.MyPageDAO;
import com.internousdev.zen.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware  {
	   private Map<String, Object> session;
	   public MyPageDAO myPageDAO = new MyPageDAO();
	   public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();


    public String execute() throws SQLException{
    	if(session.containsKey("id")){
    		String user_info_id = session.get("id").toString();
    		myPageList = myPageDAO.getMyPageUserInfo(user_info_id);
    		session.put("list", myPageList);
    	}
    	return SUCCESS;

    }

    @Override
    public void setSession(Map<String, Object> session){
    	this.session = session;
    }

    public Map<String, Object> getSession() {
		return session;
	}

	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	public ArrayList<MyPageDTO> getMyPageList(){
    	return this.myPageList;

    }


    }










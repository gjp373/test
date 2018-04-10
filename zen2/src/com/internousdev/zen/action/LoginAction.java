package com.internousdev.zen.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.LoginDAO;
import com.internousdev.zen.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;//ユーザーid
	private String loginPassword;//パスワード
//	private boolean saveLogin;//ID保持
	public Map<String,Object> session;//セッション

	private String errorMessage;
	private boolean errorFlg;

    public String execute(){
    	String result=ERROR;
    	errorFlg=false;
    	LoginDAO loginDAO=new LoginDAO();
    	LoginDTO loginDTO=new LoginDTO();

    	loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);
    	if(loginDTO.getLoginId()==null){
    		errorMessage="ログインに失敗しました。";
    		errorFlg=true;
    		return ERROR;
    	}

    	session.put("loginUser", loginDTO);

    	if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
    		result=SUCCESS;
    		session.put("login_user_id",loginDTO.getLoginId());

    		return result;

    	}
    	return result;
    }


	public boolean getErrorFlg() {
		return errorFlg;
	}


	public void setErrorFlg(boolean errorFlg) {
		this.errorFlg = errorFlg;
	}


	public String getLoginUserId(){
		return loginUserId;
	}
    public void setLoginUserId(String loginUserId){
    	this.loginUserId=loginUserId;
    }
    public String getLoginPassword(){
    	return loginPassword;
    }
    public void setLoginPassword(String loginPassword){
    	this.loginPassword=loginPassword;
    }

    @Override
    public void setSession(Map<String,Object> session){
    	this.session=session;
    }


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	public Map<String, Object> getSession() {
		return session;
	}




}

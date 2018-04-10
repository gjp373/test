package com.internousdev.zen.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware {
	private String loginId;
	private String password;
	private String passwordConfirm;
	private Map<String, Object> session;
	private String errorMessage;

	public String execute() {
		String result = ERROR;

		System.out.println(loginId);
		System.out.println(password);
		System.out.println(passwordConfirm);
		errorMessage = null;
		if (!(password.equals(passwordConfirm))) {
			errorMessage += "入力されたパスワードが異なります。\n";
		}
		if (loginId.equals("")) {
			errorMessage += "ログインIDを入力してください。\n";
		}
		if (password.equals("")) {
			errorMessage += "パスワードを入力してください。\n";
			if (passwordConfirm.equals("")) {
				errorMessage += "パスワード再設定を入力してください。\n";
			}
			if (loginId.length() < 0 && loginId.length() > 8) {
				errorMessage += "パスワードは1文字以上8文字以内で表示してください。\n";
			}
			if (password.length() < 0 && password.length() > 16) {
				errorMessage += "パスワードは1文字以上16文字以内で表示してください。\n";
			}
			if (passwordConfirm.length() < 0 && passwordConfirm.length() > 16) {
				errorMessage += "パスワードは1文字以上16文字以内で表示してください。\n";
			}
			if (loginId.equals("[^0-9a-zA-Z_]")) {
				errorMessage += "入力は半角英数で入力してください。\n";
			}
			if (password.equals("[^0-9a-zA-Z_]")) {
				errorMessage += "入力は半角英数で入力してください。\n";
			}
			if (passwordConfirm.equals("[^0-9a-zA-Z_]")) {
				errorMessage += "入力は半角英数で入力してください。\n";
			}
			if(errorMessage!=null){
				System.out.println("ERROR");
				return ERROR;
			}
		}
		result =SUCCESS;
		System.out.println("SUCCESS");
		return result;

	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}

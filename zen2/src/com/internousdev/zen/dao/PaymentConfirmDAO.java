package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.zen.util.DBConnector;
import com.internousdev.zen.util.DateUtil;


public class PaymentConfirmDAO {
	private String id;
	private String user_id;
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String email;

	private String tel_number;
	private String user_address;

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO destination_info(id,user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address,regist_date)";

	public int paymentConfirmInfo(int id,String user_id,String family_name,String first_name,String family_name_kana,String first_name_kana,String email,String tel_number,String user_address)throws SQLException{
		int ret = 0;
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, user_id);
			ps.setString(3, family_name);
			ps.setString(4, first_name);
			ps.setString(5, family_name_kana);
			ps.setString(6, first_name_kana);
			ps.setString(7, email);
			ps.setString(8, tel_number);
			ps.setString(9, user_address);
			ps.setString(10, dateUtil.getDate());
			ret = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return ret;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFamily_name_kana() {
		return family_name_kana;
	}

	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirst_name_kana() {
		return first_name_kana;
	}

	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}




}

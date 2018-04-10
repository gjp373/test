package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.PaymentCompleteDAO;
import com.internousdev.zen.dao.PaymentConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentConfirmAction extends ActionSupport implements SessionAware {
	private String id;
	private String user_id;
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String email;
	private String tel_number;
	private String user_address;

	public Map<String, Object> session;
	private PaymentCompleteDAO paymentCompleteDAO = new PaymentCompleteDAO();

	private String radio;

	public String execute() throws SQLException{
		paymentCompleteDAO.cartInfo(
				session.get("user_id").toString(),
				session.get("product_name").toString(),
				session.get("product_count").toString(),
				session.get("price").toString());


		//*選択した宛先を宛先情報テーブルへ格納

		String[] radioList = radio.split(" ,",0);
		for(int j=0; j < radioList.length; j++){
			if( Integer.parseInt(radioList[j].toString()) == 1){

			String[] idList = id.split(", ",0);
			String[] user_idList = user_id.split(", ",0);
			String[] family_nameList = family_name.split(", ",0);
			String[] first_nameList = first_name.split(", ",0);
			String[] family_name_kanaList = family_name_kana.split(", ",0);
			String[] first_name_kanaList = first_name_kana.split(", ",0);
			String[] emailList = email.split(", ",0);
			String[] tel_numberList = tel_number.split(", ",0);
			String[] user_addressList = user_address.split(", ",0);

				for(int i = 0;i<idList.length;i++){
					PaymentConfirmDAO dao = new PaymentConfirmDAO();

					dao.paymentConfirmInfo(idList[i].length(),user_idList[i].toString(),family_nameList[i].toString(),first_nameList[i].toString(),family_name_kanaList[i].toString(),first_name_kanaList[i].toString(),emailList[i].toString(),tel_numberList[i].toString(),user_addressList[i].toString());

					if(session.containsKey("id")){
						session.put(family_name, family_nameList[0].toString());
						session.put(first_name, first_nameList.toString());
						session.put(family_name, family_name_kanaList.toString());
						session.put(first_name, first_name_kanaList.toString());
						session.put(email, emailList.toString());
						session.put(tel_number, tel_numberList.toString());
						session.put(user_address, user_addressList.toString());
					}
				}
			}
		}
		String result=SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}

/* ====データベースをどこ購入履歴にすべきか？ 4/4 ===== */
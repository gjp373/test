package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.internousdev.zen.dto.PaymentDTO;
import com.internousdev.zen.util.DBConnector;

public class PaymentDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private PaymentDTO paymentDTO=new PaymentDTO();

	public PaymentDTO getPaymentInfo(){
		String sql="SELECT UserID,ProductID,ProductCount,Price FROM cart_info";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				paymentDTO.setUserID(resultSet.getInt("user_id"));
				paymentDTO.setProductID(resultSet.getString("product_name"));
				paymentDTO.setProductCount(resultSet.getString("product_count"));
				paymentDTO.setPrice(resultSet.getString("price"));

			}

		} catch(Exception e) {

				e.printStackTrace();

		}
		return paymentDTO;

	}
	public PaymentDTO getPaymentmDTO() {
			return paymentDTO;



	}

}

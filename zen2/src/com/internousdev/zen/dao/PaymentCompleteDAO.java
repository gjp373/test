package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.zen.util.DBConnector;
import com.internousdev.zen.util.DateUtil;

public class PaymentCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();
	private String sql="INSERT INTO cart_info(user_id,product_name,product_count,price,insert_date) VALUES(?,?,?,?,?)";

		public void cartInfo(String user_id,String product_name,String product_count,String price)throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			preparedStatement.setString(2,product_name);
			preparedStatement.setString(3,product_count);
			preparedStatement.setString(4,price);
			preparedStatement.setString(5,dateUtil.getDate());
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
				connection.close();
		}
	}
		public int insertNewPurchase(String userId,int destinationId){
			db=new DBConnector();
			con=db.getConnection();
			DateUtil util=new DateUtil();

			int result=0;

			String sql="insert into purchase_history_info(user_id,product_name,product_count,price,destination_id,regist_date)"
					 "values(?,?,?,?,?,?)";

		}

}

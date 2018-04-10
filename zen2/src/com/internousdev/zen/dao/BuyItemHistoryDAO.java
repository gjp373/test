package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.BuyItemHistoryDTO;
import com.internousdev.zen.util.DBConnector;

public class BuyItemHistoryDAO {

	 DBConnector dbConnector=new DBConnector();
	 Connection connection=dbConnector.getConnection();
	 ArrayList<BuyItemHistoryDTO> buyItemHistoryDTOList = new ArrayList<BuyItemHistoryDTO>();




	public ArrayList<BuyItemHistoryDTO> getMyPageUserInfo(String purchase_history_info) throws SQLException{


//phはpurchase_historyの頭文字。購入履歴を取得するｓｑｌ

		String sql="SELECT * FROM purchase_history_info ORDER BY regist_date DESC";


	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
//		preparedStatement.setString(1,purchase_history_info);

		ResultSet resultSet=preparedStatement.executeQuery();

		//↓取得した結果を1件ずつＤＴＯに格納して更にArrayListに格納してる

		while(resultSet.next()){
			BuyItemHistoryDTO dto=new BuyItemHistoryDTO();
			dto.setUser_id(resultSet.getString("user_id"));
			dto.setProduct_name(resultSet.getString("product_name"));
			dto.setProduct_count(resultSet.getString("product_count"));
			dto.setPrice(resultSet.getString("price"));
			dto.setRegist_date(resultSet.getString("regist_date"));
			dto.setUpdate_date(resultSet.getString("update_date"));
			buyItemHistoryDTOList.add(dto);

		}
	}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return buyItemHistoryDTOList;

	}

	//↓ＤＢから購入履歴を削除するためのやつ

	public int buyItemHistoryDelete(String purchase_history_info)throws SQLException{
		String sql="DELETE FROM purchase_history_info WHERE purchase_history_info=?";

		PreparedStatement preparedStatement;
		int result=0;
		try{
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,purchase_history_info);
			result=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}return result;


	}



}

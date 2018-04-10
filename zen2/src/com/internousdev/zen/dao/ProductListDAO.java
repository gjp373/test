package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.DBConnector;

public class ProductListDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	//商品情報の取得
	public ArrayList<ProductDTO> getProductInfo()throws SQLException{
		ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();
		String sql = "select * from product_info order by product_id asc";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ProductDTO dto = new ProductDTO();

				dto.setId(rs.getInt("id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_name_kana(rs.getString("product_name_kana"));
				dto.setPrice(rs.getInt("price"));
				dto.setImage_file_path(rs.getString("image_file_path"));
				dto.setImage_file_name(rs.getString("image_file_name"));
				productList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return productList;
	}
}

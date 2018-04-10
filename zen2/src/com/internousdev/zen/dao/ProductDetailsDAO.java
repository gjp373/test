package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.zen.dto.ProductDTO;
import com.internousdev.zen.util.DBConnector;

public class ProductDetailsDAO {
	//単体の商品情報取得
	public ProductDTO getProductDetailsInfo(String product_id)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ProductDTO productDTO = new ProductDTO();
		String sql = "select * from product_info where product_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, product_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				productDTO.setId(rs.getInt("id"));
				productDTO.setProduct_id(rs.getInt("product_id"));
				productDTO.setProduct_name(rs.getString("product_name"));
				productDTO.setProduct_name_kana(rs.getString("product_name_kana"));
				productDTO.setProduct_description(rs.getString("product_description"));
				productDTO.setCategory_id(rs.getInt("category_id"));
				productDTO.setPrice(rs.getInt("price"));
				productDTO.setStock(rs.getInt("stock"));
				productDTO.setImage_file_path(rs.getString("image_file_path"));
				productDTO.setImage_file_name(rs.getString("image_file_name"));
				productDTO.setRelease_date(rs.getString("release_date"));
				productDTO.setRelease_company(rs.getString("release_company"));
			}else{
				return null;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return productDTO;
	}
	//商品詳細情報取得
	public List<ProductDTO> getProductDetailsInfoList(String[] productIdList)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<ProductDTO> detailsList = new ArrayList<ProductDTO>();

		for(int i = 0; i < productIdList.length; i++){
			String sql = "select * from product_info where product_id = ?";
			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, String.valueOf(productIdList[i]));
				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					((ProductDTO) detailsList).setId(rs.getInt("id"));
					((ProductDTO) detailsList).setProduct_id(rs.getInt("product_id"));
					((ProductDTO) detailsList).setProduct_name(rs.getString("product_name"));
					((ProductDTO) detailsList).setProduct_name_kana(rs.getString("id"));
					((ProductDTO) detailsList).setProduct_description(rs.getString("product_description"));
					((ProductDTO) detailsList).setCategory_id(rs.getInt("category_id"));
					((ProductDTO) detailsList).setPrice(rs.getInt("price"));
					((ProductDTO) detailsList).setImage_file_path(rs.getString("image_file_path"));
					((ProductDTO) detailsList).setImage_file_name(rs.getString("image_file_name"));
					((ProductDTO) detailsList).setRelease_date(rs.getString("release_date"));
					((ProductDTO) detailsList).setRelease_company(rs.getString("release_company"));
					((ProductDTO) detailsList).setRegist_date(rs.getDate("regist_date"));
					((ProductDTO) detailsList).setStock(rs.getInt("stock"));
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return detailsList;
	}
	//おすすめ商品リスト
	public ArrayList<ProductDTO> getSugestProductInfo(int category_id) throws SQLException {
		ArrayList<ProductDTO> sugestList = new ArrayList<ProductDTO>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from product_info where category_id = ? order by rand() limit 3 ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, category_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ProductDTO dto = new ProductDTO();

				dto.setId(rs.getInt("id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_name_kana(rs.getString("product_name_kana"));
				dto.setProduct_description(rs.getString("product_description"));
				dto.setCategory_id(rs.getInt("category_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setImage_file_path(rs.getString("image_file_path"));
				dto.setImage_file_name(rs.getString("image_file_name"));
				dto.setRelease_date(rs.getString("release_date"));
				dto.setRelease_company(rs.getString("release_company"));
				dto.setRegist_date(rs.getDate("regist_date"));
				dto.setUpdate_date(rs.getDate("update_date"));
				dto.setStock(rs.getInt("item_stock"));
				sugestList.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return sugestList;
	}
}

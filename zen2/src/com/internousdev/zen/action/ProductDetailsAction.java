package com.internousdev.zen.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.zen.dao.ProductDetailsDAO;
import com.internousdev.zen.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware{
	//セッション情報の取得
	public Map<String,Object> session;
	private String id;
	private String product_id;
	private int product_count;

	private String stock;
	private String error;
	private int insertFlg;

	private int price;
	private int category_id;

	//商品購入個数リスト
	private List<Integer> stockList = new ArrayList<Integer>();

	//商品詳細情報リスト
	public ProductDTO detail = new ProductDTO();
	public List<ProductDTO> detailsList = new ArrayList<ProductDTO>();

	//お勧め商品リスト
	public List<ProductDTO> sugestList = new ArrayList<ProductDTO>();

	//実行メソッド
	public String execute()throws SQLException{
		//商品詳細情報取得
		ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();
		try{
			detail = productDetailsDAO.getProductDetailsInfo(product_id);
			if(detail != null){
				session.put("d_image_file_path", detail.getImage_file_path());
				session.put("d_product_name_kana", detail.getProduct_name_kana());
				session.put("d_product_name", detail.getProduct_name());
				session.put("d_product_description", detail.getProduct_description());
				session.put("d_product_price", detail.getPrice());
				session.put("d_release_date", detail.getRelease_date());
				session.put("d_release_company", detail.getRelease_company());
				session.put("d_stock", detail.getStock());
				session.put("d_product_id", detail.getProduct_id());
				session.put("d_product_count", detail.getProduct_count());
				session.put("d_category_id", detail.getCategory_id());
			}else{
				return ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		//お勧め商品リスト情報取得
		try {
			sugestList = productDetailsDAO.getSugestProductInfo(Integer.parseInt((session.get("d_category_id")).toString()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= detail.getStock(); i++) {
			stockList.add(i);

		}

		if (session.get("d_category_id").equals("")) {
			return ERROR;
		}

		price = detail.getPrice();
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getInsertFlg() {
		return insertFlg;
	}

	public void setInsertFlg(int insertFlg) {
		this.insertFlg = insertFlg;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public List<Integer> getStockList() {
		return stockList;
	}

	public void setStockList(List<Integer> stockList) {
		this.stockList = stockList;
	}

	public ProductDTO getDetail() {
		return detail;
	}

	public void setDetail(ProductDTO detail) {
		this.detail = detail;
	}

	public List<ProductDTO> getDetailsList() {
		return detailsList;
	}

	public void setDetailsList(List<ProductDTO> detailsList) {
		this.detailsList = detailsList;
	}


}

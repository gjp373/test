package com.internousdev.zen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.zen.dto.LoginDTO;
import com.internousdev.zen.util.DBConnector;

public class LoginDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
		String sql = "SELECT*FROM user_info where user_id=? AND password=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("user_id"));
				loginDTO.setLoginPassword(resultSet.getString("password"));
				// loginDTO.setUserName(resultSet.getString("first_name"));

				if (!(resultSet.getString("user_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}else{
				loginDTO = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
}

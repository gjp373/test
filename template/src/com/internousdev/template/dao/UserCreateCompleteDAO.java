package com.internousdev.template.dao;

import java.sql.Connection;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class UserCreateCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

}

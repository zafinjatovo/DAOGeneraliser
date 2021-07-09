package DAO.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseAcess {
	DatabaseHelper helper;
	Connection connection;

	public DatabaseAcess() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public DatabaseAcess(Connection connection) {
		super();
		this.connection = connection;
	}



	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	
	public DatabaseHelper getHelper() {
		return helper;
	}



	public void setHelper(DatabaseHelper helper) {
		this.helper = helper;
	}

	public void loadProperty(String config) throws Exception {
		this.helper=new DatabaseHelper();
		try {
			helper.loadProperty(config);
		} catch (Exception e) {
			throw e;
		}
	}

	public void open(String config) throws Exception{
		try {
			this.loadProperty(config);
			this.setConnection(DriverManager.getConnection(helper.getUrl(),helper.getUsername(),helper.getPassword()));
		} catch (Exception e) {
			throw e;
		}
	}
	
}

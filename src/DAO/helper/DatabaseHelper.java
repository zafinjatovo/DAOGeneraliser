package DAO.helper;

import java.io.FileInputStream;
import java.util.Properties;

public class DatabaseHelper {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public DatabaseHelper() {
		// TODO Auto-generated constructor stub
	}

	public DatabaseHelper(String driver,String url, String username, String password) {
		super();
		this.setDriver(driver);
		this.setUrl(url);
		this.setUsername(username);
		this.setPassword(password);
	}

	public void loadProperty(String urlFichier) throws Exception {
		Properties properties=new Properties();
		try {
			FileInputStream input=new FileInputStream(urlFichier);
			properties.load(input);
			this.setDriver(properties.getProperty("connection.driver"));
			this.setUrl(properties.getProperty("connection.url"));
			this.setUsername(properties.getProperty("connection.username"));
			this.setPassword(properties.getProperty("connection.password"));
		} catch (Exception e) {
			throw e;
		}
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	
}

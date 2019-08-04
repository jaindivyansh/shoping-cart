package com.database;
public class AdminLogin {
	private int admin_id;
	private String username;
	private String password;
	
	
	public AdminLogin()	{	
	}

	public AdminLogin(int admin_id, String username, String password) {
		
		super();
		this.admin_id = admin_id;
		this.username = username;
		this.password = password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public String getName() {
		return username;
	}

	public String getPass() {
		return password;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public void setName(String username) {
		this.username = username;
	}

	public void setPass(String password) {
		this.password = password;
	}
	
}
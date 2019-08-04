package com.database;

public class Login1 {
	private int user_id;
	private String pass;
	public Login1() {
		// TODO Auto-generated constructor stub
		this.user_id = 0;
		this.pass = null;
	}
	public Login1(int user_id, String pass) {		
		this.user_id = user_id;
		this.pass = pass;
	}

	public int getUser_id() {
		return user_id;
	}

	public String getPass() {
		return pass;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}

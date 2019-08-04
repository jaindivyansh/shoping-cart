package com.database;

import java.sql.Date;

public class User {
	private int id;	
	private String address;
	private String phone;
	private String name;
	private String state;
	private String district;
	private int pin_code;
	private Date dob;
	
	public User(){
		this.id = 0;		
		this.name = null;
		this.address = null;
		this.phone = null;
		this.state = null;
		this.district = null;
		this.dob = null;
		this.pin_code = 0;
	}
	
	public User(int id,String pass,String name,String address, String phone,
			String state,String district, Date dob, int pin_code){
		this.id = id;		
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.state = state;
		this.district = district;
		this.dob = dob;
		this.pin_code = pin_code;
		
	}

	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public int getPin_code() {
		return pin_code;
	}

	public Date getDob() {
		return dob;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
		
}

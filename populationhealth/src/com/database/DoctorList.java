package com.database;

import java.sql.Date;

public class DoctorList {
	private int id;
	private String field;
	private int remark;
	private Date date;
	private String name;
	private String address;//state or district
	private String state;
	private String district;
	private int pin_code;
	private String phone;
	
	public DoctorList(){
		this.id = 0;
		this.field = null;
		this.remark = 0;
		this.name = null;
		this.date = null;
		this.address = null;
		this.phone = null;
		this.state = null;
		this.district = null;
		this.pin_code = 0;
	}
	
	public DoctorList(int id, String field, String remark,String name,String address,Date date,String phone,String state, String district,int pin_code){
		this.id = id;
		this.field = field;
		this.remark = 0;
		this.name = name;
		this.date = date;
		this.address = address;
		this.phone = phone;
		this.state = state;
		this.district = district;
		this.pin_code = pin_code;
	}

	public int getId() {
		return id;
	}

	public String getField() {
		return field;
	}

	public int getRemark() {
		return remark;
	}

	public Date getDate() {
		return date;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
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

	public String getPhone() {
		return phone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setField(String field) {
		this.field = field;
	}

	public void setRemark(int remark) {
		this.remark = remark;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

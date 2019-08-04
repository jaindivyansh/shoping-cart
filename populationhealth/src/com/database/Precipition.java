package com.database;

import java.awt.TextArea;
import java.sql.Date;

public class Precipition {
	private int id;
	private String disease;
	private TextArea precipition;
	private int doctor_id;
	private Date data_time;
	
	public Precipition(){
		this.id = 0;
		this.disease = null;
		this.precipition = null;
		this.doctor_id = 0;
		this.data_time = null;
	}
	
	public Precipition(int id, String disease, TextArea precipition,int doctor_id,Date date_time){
		this.id = id;
		this.disease = disease;
		this.precipition = precipition;
		this.doctor_id = doctor_id;
		this.data_time = date_time;
	}

	public int getId() {
		return id;
	}

	public String getDisease() {
		return disease;
	}

	public TextArea getPrecipition() {
		return precipition;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public Date getData_time() {
		return data_time;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void setPrecipition(TextArea precipition) {
		this.precipition = precipition;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public void setData_time(Date data_time) {
		this.data_time = data_time;
	}

		
}

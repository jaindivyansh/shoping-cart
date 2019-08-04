package com.database;

import java.sql.Blob;
import java.sql.Date;

public class Report {
	private int id;
	private Blob report_img;
	private Date date_time;
	
	public Report(){
		this.id = 0;
		this.report_img = null;
		this.date_time = null;
	}
	
	public Report(int id, Blob report_img, Date date_time){
		this.id = id;
		this.report_img = report_img;
		this.date_time = date_time;
	}

	public int getId() {
		return id;
	}

	public Blob getReport_img() {
		return report_img;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setReport_img(Blob report_img) {
		this.report_img = report_img;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

		
}

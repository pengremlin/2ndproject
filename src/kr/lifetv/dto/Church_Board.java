package kr.lifetv.dto;

import java.sql.Date;

public class Church_Board {

	private int church_index;
	private String church_id;
	private String church_subject;
	private String church_content;
	private Date church_write_date;
	private int church_read_num;
	
	public int getChurch_index() {
		return church_index;
	}
	public void setChurch_index(int church_index) {
		this.church_index = church_index;
	}
	public String getChurch_id() {
		return church_id;
	}
	public void setChurch_id(String church_id) {
		this.church_id = church_id;
	}
	public String getChurch_subject() {
		return church_subject;
	}
	public void setChurch_subject(String church_subject) {
		this.church_subject = church_subject;
	}
	public String getChurch_content() {
		return church_content;
	}
	public void setChurch_content(String church_content) {
		this.church_content = church_content;
	}
	public Date getChurch_write_date() {
		return church_write_date;
	}
	public void setChurch_write_date(Date church_write_date) {
		this.church_write_date = church_write_date;
	}
	public int getChurch_read_num() {
		return church_read_num;
	}
	public void setChurch_read_num(int church_read_num) {
		this.church_read_num = church_read_num;
	}
	
	
}

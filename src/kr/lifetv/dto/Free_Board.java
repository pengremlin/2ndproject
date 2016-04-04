package kr.lifetv.dto;

import java.sql.Date;

public class Free_Board {

	// Community > 자유게시판
	
	private int free_index;
	private String free_id;
	private String free_subject;
	private String free_content;
	private Date free_write_date;
	private int free_read_num;
	
	public int getFree_index() {
		return free_index;
	}
	public void setFree_index(int free_index) {
		this.free_index = free_index;
	}
	public String getFree_id() {
		return free_id;
	}
	public void setFree_id(String free_id) {
		this.free_id = free_id;
	}
	public String getFree_subject() {
		return free_subject;
	}
	public void setFree_subject(String free_subject) {
		this.free_subject = free_subject;
	}
	public String getFree_content() {
		return free_content;
	}
	public void setFree_content(String free_content) {
		this.free_content = free_content;
	}
	public Date getFree_write_date() {
		return free_write_date;
	}
	public void setFree_write_date(Date free_write_date) {
		this.free_write_date = free_write_date;
	}
	public int getFree_read_num() {
		return free_read_num;
	}
	public void setFree_read_num(int free_read_num) {
		this.free_read_num = free_read_num;
	}
	
	
}

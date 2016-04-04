package kr.lifetv.dto;

import java.sql.Date;

public class Notice_Board {

	// Notice > 공지게시판
	
	private int notice_index;
	private String notice_id;
	private String notice_subject;
	private String notice_content;
	private Date notice_write_date;
	private int notice_read_num;
	
	public int getNotice_index() {
		return notice_index;
	}
	public void setNotice_index(int notice_index) {
		this.notice_index = notice_index;
	}
	public String getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
	}
	public String getNotice_subject() {
		return notice_subject;
	}
	public void setNotice_subject(String notice_subject) {
		this.notice_subject = notice_subject;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public Date getNotice_write_date() {
		return notice_write_date;
	}
	public void setNotice_write_date(Date notice_write_date) {
		this.notice_write_date = notice_write_date;
	}
	public int getNotice_read_num() {
		return notice_read_num;
	}
	public void setNotice_read_num(int notice_read_num) {
		this.notice_read_num = notice_read_num;
	}
	
	
}

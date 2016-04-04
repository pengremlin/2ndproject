package kr.lifetv.dto;

import java.sql.Date;

public class Free_Reply {

	// Community > 자유게시판 댓글
	
	private int free_reply_index;
	private String free_reply_id;
	private String free_reply_content;
	private Date free_reply_write_date;
	private int free_idx_fk;
	
	public int getFree_reply_index() {
		return free_reply_index;
	}
	public void setFree_reply_index(int free_reply_index) {
		this.free_reply_index = free_reply_index;
	}
	public String getFree_reply_id() {
		return free_reply_id;
	}
	public void setFree_reply_id(String free_reply_id) {
		this.free_reply_id = free_reply_id;
	}
	public String getFree_reply_content() {
		return free_reply_content;
	}
	public void setFree_reply_content(String free_reply_content) {
		this.free_reply_content = free_reply_content;
	}
	public Date getFree_reply_write_date() {
		return free_reply_write_date;
	}
	public void setFree_reply_write_date(Date free_reply_write_date) {
		this.free_reply_write_date = free_reply_write_date;
	}
	public int getFree_idx_fk() {
		return free_idx_fk;
	}
	public void setFree_idx_fk(int free_idx_fk) {
		this.free_idx_fk = free_idx_fk;
	}
	
	
}

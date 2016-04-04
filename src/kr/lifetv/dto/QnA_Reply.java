package kr.lifetv.dto;

import java.sql.Date;

public class QnA_Reply {

	// Community > QnA 댓글게시판
	
	private int qna_reply_index;
	private String qna_reply_id;
	private String qna_reply_content;
	private Date qna_reply_write_date;
	private int qna_idx_fk;
	
	public int getQna_reply_index() {
		return qna_reply_index;
	}
	public void setQna_reply_index(int qna_reply_index) {
		this.qna_reply_index = qna_reply_index;
	}
	public String getQna_reply_id() {
		return qna_reply_id;
	}
	public void setQna_reply_id(String qna_reply_id) {
		this.qna_reply_id = qna_reply_id;
	}
	public String getQna_reply_content() {
		return qna_reply_content;
	}
	public void setQna_reply_content(String qna_reply_content) {
		this.qna_reply_content = qna_reply_content;
	}
	public Date getQna_reply_write_date() {
		return qna_reply_write_date;
	}
	public void setQna_reply_write_date(Date qna_reply_write_date) {
		this.qna_reply_write_date = qna_reply_write_date;
	}
	public int getQna_idx_fk() {
		return qna_idx_fk;
	}
	public void setQna_idx_fk(int qna_idx_fk) {
		this.qna_idx_fk = qna_idx_fk;
	}
	
	
}

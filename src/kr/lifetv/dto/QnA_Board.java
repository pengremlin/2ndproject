package kr.lifetv.dto;

import java.sql.Date;

public class QnA_Board {

	// Community > Q&A게시판
	
	private int qna_index;
	private String qna_id;
	private String qna_subject;
	private String qna_content;
	private Date qna_write_date;
	private int qna_read_num;
	
	public int getQna_index() {
		return qna_index;
	}
	public void setQna_index(int qna_index) {
		this.qna_index = qna_index;
	}
	public String getQna_id() {
		return qna_id;
	}
	public void setQna_id(String qna_id) {
		this.qna_id = qna_id;
	}
	public String getQna_subject() {
		return qna_subject;
	}
	public void setQna_subject(String qna_subject) {
		this.qna_subject = qna_subject;
	}
	public String getQna_content() {
		return qna_content;
	}
	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}
	public Date getQna_write_date() {
		return qna_write_date;
	}
	public void setQna_write_date(Date qna_write_date) {
		this.qna_write_date = qna_write_date;
	}
	public int getQna_read_num() {
		return qna_read_num;
	}
	public void setQna_read_num(int qna_read_num) {
		this.qna_read_num = qna_read_num;
	}
	
	
}

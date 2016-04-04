package kr.lifetv.dto;

import java.sql.Date;

public class Video_Board {

	// Content > 비디오 게시판
	
	private int video_index;
	private String video_subject;
	private String video_link;
	private String video_img_link;
	private String video_category;
	private int video_read_num;
	private Date video_write_date;
	
	public int getVideo_index() {
		return video_index;
	}
	public void setVideo_index(int video_index) {
		this.video_index = video_index;
	}
	public String getVideo_subject() {
		return video_subject;
	}
	public void setVideo_subject(String video_subject) {
		this.video_subject = video_subject;
	}
	public String getVideo_link() {
		return video_link;
	}
	public void setVideo_link(String video_link) {
		this.video_link = video_link;
	}
	public String getVideo_img_link() {
		return video_img_link;
	}
	public void setVideo_img_link(String video_img_link) {
		this.video_img_link = video_img_link;
	}
	public String getVideo_category() {
		return video_category;
	}
	public void setVideo_category(String video_category) {
		this.video_category = video_category;
	}
	public int getVideo_read_num() {
		return video_read_num;
	}
	public void setVideo_read_num(int video_read_num) {
		this.video_read_num = video_read_num;
	}
	public Date getVideo_write_date() {
		return video_write_date;
	}
	public void setVideo_write_date(Date video_write_date) {
		this.video_write_date = video_write_date;
	}
	
	
	
}

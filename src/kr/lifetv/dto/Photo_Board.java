package kr.lifetv.dto;

import java.sql.Date;

public class Photo_Board {
		// Content > 사진 게시판
	
		private int photo_index;
		private String photo_subject;
		private String photo_link;
		private String photo_category;
		private int photo_read_num;
		private Date photo_write_date;
		
		public int getPhoto_index() {
			return photo_index;
		}
		public void setPhoto_index(int photo_index) {
			this.photo_index = photo_index;
		}
		public String getPhoto_subject() {
			return photo_subject;
		}
		public void setPhoto_subject(String photo_subject) {
			this.photo_subject = photo_subject;
		}
		public String getPhoto_link() {
			return photo_link;
		}
		public void setPhoto_link(String photo_link) {
			this.photo_link = photo_link;
		}
		public String getPhoto_category() {
			return photo_category;
		}
		public void setPhoto_category(String photo_category) {
			this.photo_category = photo_category;
		}
		public int getPhoto_read_num() {
			return photo_read_num;
		}
		public void setPhoto_read_num(int photo_read_num) {
			this.photo_read_num = photo_read_num;
		}
		public Date getPhoto_write_date() {
			return photo_write_date;
		}
		public void setPhoto_write_date(Date photo_write_date) {
			this.photo_write_date = photo_write_date;
		}
		
		
}

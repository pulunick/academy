package restaurant;

import java.sql.Date;

//IDX		        NUMBER		    DEFAULT RESTAURANT_SEQ.NEXTVAL PRIMARY KEY,
//CATEGORY	    	VARCHAR2(100)	CHECK(CATEGORY IN('한식','중식','양식','일식','기타')),
//RESTAURANT_NAME	VARCHAR2(255)	UNIQUE NOT NULL,
//ADDRESS		    VARCHAR2(255)	NOT NULL,
//TEL		        VARCHAR2(255)	NOT NULL,
//PARKING		    VARCHAR2(100)	CHECK(PARKING IN('Y', 'N')),
//JOINDATE	    	DATE		    DEFAULT SYSDATE

public class RestaurantDTO {
	private int idx;
	private String category;
	private String restaurant_name;
	private String address;
	private String tel;
	private String parking;
	private Date joindate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	

}

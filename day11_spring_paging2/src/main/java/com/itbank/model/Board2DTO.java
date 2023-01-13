package com.itbank.model;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class Board2DTO {

	private int idx;
	private String title;
	private String content;
	private Date boarddate;
	private String writer;
	private String ipaddr;
	private int viewCount;
	private String uploadFile;
	
	private MultipartFile realUpload;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getBoarddate() {
		return boarddate;
	}
	public void setBoarddate(Date boarddate) {
		this.boarddate = boarddate;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getIpaddr() {
		return ipaddr;
	}
	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public String getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(String uploadFile) {
		this.uploadFile = uploadFile;
	}
	public MultipartFile getRealUpload() {
		return realUpload;
	}
	public void setRealUpload(MultipartFile realUpload) {
		this.realUpload = realUpload;
	}


	
}

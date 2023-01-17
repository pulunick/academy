package com.itbank.model;

public class PagingDTO {
	
	private int page;
	// 전체 페이지 수
	private int boardCount;
	// 한페이제 띄울 board 수
	private final int perPage = 10;
	// 한페이지에 띄울 수 
	private final int pageNum_cnt = 5;
	
	private int offset;
	
	private int pageCount;
	private int endPageNum;
	private int startPageNum;
	private boolean prev;
	private boolean next;
	private int prevFive;
	private int nextFive;
	
	public PagingDTO(int page, int boardCount) {
		this.page = page;
		this.boardCount = boardCount;
		setPageCount(boardCount, perPage);
		setEndPageNum(page, pageNum_cnt, getPageCount());
		setStartPageNum(getEndPageNum(), pageNum_cnt);
		setPrev(getStartPageNum());
		setNext(getEndPageNum(), getPageCount());
		setPrevFive(getStartPageNum(), pageNum_cnt);
		setNextFive(getEndPageNum());
		setOffset(page, getPerPage());
	}
	
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(int startPageNum) {
		this.prev = startPageNum == 1 ? false : true;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(int endPageNum, int pageCount) {
		this.next = endPageNum == pageCount ? false : true;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getBoardCount() {
		return boardCount;
	}
	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int boardCount, int perpage) {
		this.pageCount = boardCount / perPage;
		if(boardCount % perPage != 0) {
			this.pageCount += 1;
		}
	}
	public int getEndPageNum() {
		return endPageNum;
	}
	public void setEndPageNum(int page, int pageNum_cnt, int pageCount) {
		this.endPageNum = (int)(Math.ceil((double)page / (double)pageNum_cnt) * pageNum_cnt);
		if(endPageNum > pageCount) {
			this.endPageNum = pageCount;
		}
	}
	public int getStartPageNum() {
		return startPageNum;
	}
	public void setStartPageNum(int endPageNum, int pageNum_cnt) {
		this.startPageNum = endPageNum - (pageNum_cnt - 1);
	}
	public int getPerPage() {
		return perPage;
	}
	public int getPageNum_cnt() {
		return pageNum_cnt;
	}

	public int getPrevFive() {
		return prevFive;
	}

	public void setPrevFive(int startPageNum, int pageNmum_cnt) {
		this.prevFive = startPageNum - pageNmum_cnt;
	}

	public int getNextFive() {
		return nextFive;
	}

	public void setNextFive(int endPageNum) {
		this.nextFive = endPageNum + 1;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int page, int perPage) {
		this.offset = (page -1) * perPage;
	}

	
	
	
}

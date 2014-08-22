package com.kt.swe.DAO;

public class BoardInfo{
	String BoardAttributeNum;
	String BoardTitle;
	String CreateDate;
	String User;
	
	public String getBoardAttributeNum() {
		return BoardAttributeNum;
	}
	public void setBoardAttributeNum(String BoardAttributeNum) {
		this.BoardAttributeNum = BoardAttributeNum;
	}
	public String getBoardTitle() {
		return BoardTitle;
	}
	public void setBoardTitle(String BoardTitle) {
		this.BoardTitle = BoardTitle;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String CreateDate) {
		this.CreateDate = CreateDate;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String User) {
		this.User = User;
	}
}
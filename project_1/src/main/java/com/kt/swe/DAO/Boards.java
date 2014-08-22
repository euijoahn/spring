package com.kt.swe.DAO;

public class Boards{
	private int ContentAttributeNum;
	private String BoardAttributeNum;
	private String CreateDate;
	private String Creator;
	private	String CreatorID;
	private String ContentTitle;
	private String Content;
	private String IP;
	private int Hit;
	
	public int getContentAttributeNum(){
		return ContentAttributeNum;
	}
	public void setContentAttributeNum(int ContentAttributeNum){
		this.ContentAttributeNum = ContentAttributeNum;
	}
	public String getBoardAttributeNum(){
		return BoardAttributeNum;
	}
	public void setBoardAttributeNum(String BoardAttributeNum){
		this.BoardAttributeNum = BoardAttributeNum;
	}
	public String getCreateDate(){
		return CreateDate;
	}
	public void setCreateDate(String CreateDate){
		this.CreateDate = CreateDate;
	}
	public String getCreator(){
		return Creator;
	}
	public void setCreator(String Creator){
		this.Creator = Creator;
	}
	public String getContentTitle(){
		return ContentTitle;
	}
	public void setContentTitle(String ContentTitle){
		this.ContentTitle = ContentTitle;
	}
	public String getContent(){
		return Content;
	}
	public void setContent(String Content){
		this.Content = Content;
	}
	public String getIP(){
		return IP;
	}
	public void setIP(String IP){
		this.IP = IP;
	}
	public String getCreatorID(){
		return CreatorID;
	}
	public void setCreatorID(String CreatorID){
		this.CreatorID = CreatorID;
	}
	public int getHit(){
		return Hit;
	}
	public void setHit(int Hit){
		this.Hit = Hit;
	}
}
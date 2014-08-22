package com.kt.swe.DAO;

public class Logs{
	private String Date;
	private String ID;
	private int num;
	private String Attri;
	
	public String getDate(){
		return Date;
	}
	public void setDate(String Date){
		this.Date = Date;
	}
	
	public String getID(){
		return ID;
	}
	public void setID(String ID){
		this.ID = ID;
	}
	
	public int getnum(){
		return num;
	}
	public void setnum(int num){
		this.num = num;
	}
	
	public String getAttri(){
		return Attri;
	}
	public void setAttri(String Attri){
		this.Attri = Attri;
	}
}
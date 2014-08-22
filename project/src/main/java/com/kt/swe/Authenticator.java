/*
 * class : Authenticator
 * role : password check
 */
package com.kt.swe;

public class Authenticator{
	private String pwd;
	private String checkpwd;
	
	/* 
	 * function : check
	 * role : 비밀번호가 맞는지를 체크한 후에 결과를 리턴함
	 * return type : boolean
	 */
	public boolean check(){
		return (pwd.equals(checkpwd));
	}
	
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	public void setCheckpwd(String checkpwd){
		this.checkpwd = checkpwd;
	}
	/* 생성자 */
	Authenticator(){
		this.pwd = "toor";
		this.checkpwd = "toor";
	}
	Authenticator(String pwd, String checkpwd){
		this.pwd = pwd;
		this.checkpwd = checkpwd;
	}
}
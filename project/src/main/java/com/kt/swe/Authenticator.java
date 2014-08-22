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
	 * role : ��й�ȣ�� �´����� üũ�� �Ŀ� ����� ������
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
	/* ������ */
	Authenticator(){
		this.pwd = "toor";
		this.checkpwd = "toor";
	}
	Authenticator(String pwd, String checkpwd){
		this.pwd = pwd;
		this.checkpwd = checkpwd;
	}
}
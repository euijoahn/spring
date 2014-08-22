package com.kt.swe;

public class Authenticator{
	private String pwd;
	private String checkpwd;
	
	public boolean check(){
		return (pwd.equals(checkpwd));
	}
	Authenticator(){
		this.pwd = "toor";
		this.checkpwd = "toor";
	}
	Authenticator(String pwd, String checkpwd){
		this.pwd = pwd;
		this.checkpwd = checkpwd;
	}
}
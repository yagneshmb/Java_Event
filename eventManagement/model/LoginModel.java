package com.eventManagement.model;

public class LoginModel {
	private String loginID;
	private String password;
	public String getLoginID() {
		return loginID;
	}
	public String getPassword() {
		return password;
	}
	public LoginModel(){
		this.loginID = "admin";
		this.password = "admin";
	}
	public boolean checkDetailCorrectness(String loginIDUserEntry, String loginPwdUserEntry){
	
		if((loginPwdUserEntry.compareTo(this.password)==0) && loginIDUserEntry.compareTo(loginID)==0){
			return true; 
		}
		else
			return false;
	}
	
	
}

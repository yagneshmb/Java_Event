package com.eventManagement.model.managers;

public class Manager {
	private String managerID;
	private String managerName;
	private String managerType;
	private String managerContactNo;
	private String loginID;
	private String loginPassword;
	public Manager(String managerName, String managerContactNo) {
		super();
		this.managerName = managerName;
		this.managerContactNo = managerContactNo;
	}
	public String getManagerName() {
		return managerName;
	}
	public String getManagerContactNo() {
		return managerContactNo;
	}
	
	
	

}

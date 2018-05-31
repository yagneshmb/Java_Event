package com.eventManagement.model.Music;

public class MusicManagement {
	private double pricePerProgram;
	private String singersGroupName;
	private int musicManagementID;
	public double getPricePerProgram() {
		return pricePerProgram;
	}
	public void setPricePerProgram(double pricePerProgram) {
		this.pricePerProgram = pricePerProgram;
	}
	public String getSingersGroupName() {
		return singersGroupName;
	}
	public void setSingersGroupName(String singersGroupName) {
		this.singersGroupName = singersGroupName;
	}
	public MusicManagement( double pricePerProgram, String singersGroupName) {
		super();
		
		this.pricePerProgram = pricePerProgram;
		this.singersGroupName = singersGroupName;
	}
	
	
	
}

package com.eventManagement.model.resources.DecorationManagement;

import java.util.ArrayList;

public class DecorationManagement {
	private int decorationID;
	private String packageName;
	private double pricePerPackage;
	public DecorationManagement(String packageName, double pricePerPackage) {
		super();
		this.packageName = packageName;
		this.pricePerPackage = pricePerPackage;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public double getPricePerPackage() {
		return pricePerPackage;
	}
	public void setPricePerPackage(double pricePerPackage) {
		this.pricePerPackage = pricePerPackage;
	}
	
	
	

}

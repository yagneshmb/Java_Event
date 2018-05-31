package com.eventManagement.model.communicationalActivities;

import java.util.ArrayList;

public class CommunicationMed {
	public CommunicationMed(String typeOfMedia, double pricePerUnit) {
		super();
		this.typeOfMedia = typeOfMedia;
		this.pricePerUnit = pricePerUnit;
	}
	private String CommunicationMedId;
	private String typeOfMedia;
	private double pricePerUnit;
	public String getTypeOfMedia() {
		return this.typeOfMedia;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	

}

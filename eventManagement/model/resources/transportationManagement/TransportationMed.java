package com.eventManagement.model.resources.transportationManagement;
import java.util.ArrayList;

public class TransportationMed {
	private int transportationMedID;
	private int maxGuestInAMed;
	private String typeOfTransportation;
 // for a foreign key of guest to connect with (guest and transportation:many to 1 relationship) 
	private double pricePerDayPerGuest;
	public TransportationMed( String typeOfTransportation,int maxGuestInAMed, double pricePerDayPerGuest) {
		super();
		this.maxGuestInAMed = maxGuestInAMed;
		this.typeOfTransportation = typeOfTransportation;
		this.pricePerDayPerGuest = pricePerDayPerGuest;
	}
	public int getMaxGuestInAMed() {
		return maxGuestInAMed;
	}
	public String getTypeOfTransportation() {
		return typeOfTransportation;
	}
	public double getPricePerDayPerGuest() {
		return pricePerDayPerGuest;
	}
	
	
}

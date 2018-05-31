package com.eventManagement.model.resources;

import java.util.ArrayList;

import com.eventManagement.model.Event;

public class Place {
	private int PlaceID;
	private String placeName;	
	private String timeOfOpen;
	private String timeOfClose;
	private double billPerDay;   //Assumption that the hall costing bill per day
	public String getPlaceName() {
		return placeName;
	}
	public String getTimeOfOpen() {
		return timeOfOpen;
	}
	public String getTimeOfClose() {
		return timeOfClose;
	}
	public double getBillPerDay() {
		return billPerDay;
	}
	public Place(String placeName, String timeOfOpen, String timeOfClose, double billPerDay) {
		super();
		this.placeName = placeName;
		this.timeOfOpen = timeOfOpen;
		this.timeOfClose = timeOfClose;
		this.billPerDay = billPerDay;
	}
	

	
	

}

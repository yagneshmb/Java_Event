package com.eventManagement.model;



public class Event {
	private int decorID;
	private String eventName;
	private static int eventID=0;
	private String dateOfEvent;
	private int totalDays;
	private int placeID;
	private int customerID;
	private int MusicManagementID;
	private int isEventDone;  //will be 1 if event done or will be 0 if event is not done
	public Event(String eventName, int eventID, String dateOfEvent, int totalDays) {
		super();
		this.eventName = eventName;
		this.dateOfEvent = dateOfEvent;
		this.totalDays = totalDays;
		//this.eventID++;
		eventID = this.eventID;
	}
	public String getEventName() {
		return eventName;
	}
	public static int getEventID() {
		return eventID;
	}
	public String getDateOfEvent() {
		return dateOfEvent;
	}
	public int getTotalDays() {
		return totalDays;
	}
	
	
	

}

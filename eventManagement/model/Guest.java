package com.eventManagement.model;

public class Guest {
	private int GuestID;
	private int CommunicationMedID;
	private int roomID;
	private int TransportationMedID;
	private String guestName;
	private String guestCNo;
	private String guestAddr;
	public Guest(String guestName, String guestCNo, String guestAddr) {
		super();
		this.guestName = guestName;
		this.guestCNo = guestCNo;
		this.guestAddr = guestAddr;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestCNo() {
		return guestCNo;
	}
	public void setGuestCNo(String guestCNo) {
		this.guestCNo = guestCNo;
	}
	public String getGuestAddr() {
		return guestAddr;
	}
	public void setGuestAddr(String guestAddr) {
		this.guestAddr = guestAddr;
	}
	

}

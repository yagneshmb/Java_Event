package com.eventManagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.eventManagement.view.GuestEntryView;

public class GuestEntryController {
	private GuestEntryView guestView;

	public GuestEntryController(GuestEntryView guestView) {
		super();
		this.guestView = guestView;
		this.guestView.addAddGuestBehaviour(new GuestListener());
		this.guestView.addGuestGoAheadBehaviour(new GuestListener());
	}
	public class GuestListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()){
			case "Go Ahead":
				System.out.println("a");
				guestView.setlblEventStatus("Event registration done!!! Congrats");
				
			}
			// TODO Auto-generated method stub
			
		}
		
	}
	
	

}

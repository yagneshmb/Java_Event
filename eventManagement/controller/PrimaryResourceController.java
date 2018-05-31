package com.eventManagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.eventManagement.view.GuestEntryView;
import com.eventManagement.view.PrimaryResourceDetailEntryView;
import com.eventManagement.view.TransportationManangementView;


import com.eventManagement.view.PrimaryResourceView;

public class PrimaryResourceController {
	private PrimaryResourceView primaryRView;

	public PrimaryResourceController(PrimaryResourceView primaryRView) {
		super();
		this.primaryRView = primaryRView;
		this.primaryRView.addDecorationListener(new PrimarySourceSelecterListener());
		this.primaryRView.addGuestAllocationListener(new PrimarySourceSelecterListener());
		this.primaryRView.addTransportationListener(new PrimarySourceSelecterListener());
		this.primaryRView.addInvitationListener(new PrimarySourceSelecterListener());
		this.primaryRView.addMusicListener(new PrimarySourceSelecterListener());
		this.primaryRView.addPlaceBookingListener(new PrimarySourceSelecterListener());
		this.primaryRView.addPRDoneBehaviour(new PrimarySourceSelecterListener());
	}
	public class PrimarySourceSelecterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="Done"){
			int dec=0, trans=0, place=0, invi=0, music=0, guestall=0;
			if(primaryRView.isDecorationSelected())
				dec = 1;

			if(primaryRView.isTransportationSelected())
				trans = 1;
			if(primaryRView.isMusicSelected())
				music = 1;
			if(primaryRView.isGuestAllocationSelected())
				guestall = 1;
			if(primaryRView.isPlaceBookingSelected())
				place = 1;
			if(primaryRView.isInvitationSelected())
				invi = 1;
			if(dec==1||music==1||place==1){
			PrimaryResourceDetailEntryView primarySourceDetailEntry = new PrimaryResourceDetailEntryView( dec,  trans, place, invi, music, guestall);
			PrimaryResourceEntryController primaryResourceDetailEntryController = new PrimaryResourceEntryController(primarySourceDetailEntry, trans, invi, dec, place, music);
			primaryRView.setVisible(false);
			primarySourceDetailEntry.setVisible(true);
			}
			else if((!(dec==1||music==1||place==1)) && ((trans==1)||(invi==1))){
				TransportationManangementView transportationView = new TransportationManangementView();
				TransportationController transportationController = new TransportationController(invi, transportationView);
				primaryRView.setVisible(false);
				transportationView.setVisible(true);
			}
			else if((!(dec==1||music==1||place==1)) && (!((trans==1)||(invi==1)))){
				GuestEntryView guestEntryView = new GuestEntryView();
				GuestEntryController guestEntryController = new GuestEntryController(guestEntryView);
				guestEntryView.setVisible(true);
				primaryRView.setVisible(false);
			}
			
			
			
		}
		
		}
		}
		

	
	
	
	
}


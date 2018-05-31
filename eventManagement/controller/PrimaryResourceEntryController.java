package com.eventManagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import com.eventManagement.view.TransportationManangementView;
import com.eventManagement.model.StorablePrimaryResources;
import com.eventManagement.model.Music.MusicManagement;
import com.eventManagement.model.resources.Place;
import com.eventManagement.model.resources.DecorationManagement.DecorationManagement;
import com.eventManagement.view.GuestEntryView;
import com.eventManagement.view.PrimaryResourceDetailEntryView;

public class PrimaryResourceEntryController {
	private PrimaryResourceDetailEntryView primaryResourceEntryView;
	private int trans, invi, dec, place, music;

	public PrimaryResourceEntryController(PrimaryResourceDetailEntryView primaryResourceEntryView, int trans, int invi, int dec, int place, int music) {
		super();
		this.primaryResourceEntryView = primaryResourceEntryView;
		primaryResourceEntryView.addPREDoneBehaviour(new PREListener());
		this.trans = trans;
		this.invi=invi;
		this.music=music;
		this.dec=dec;
		this.place=place;
	}
	public class PREListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(trans);
			
				
				if(dec==1){
					try {
						StorablePrimaryResources.addPResource(new DecorationManagement(primaryResourceEntryView.getTxtPackageName(), primaryResourceEntryView.getTxtPricePerPackage()));
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if(music==1){
					System.out.println("music=1");
					try {
						StorablePrimaryResources.addPResource(new MusicManagement(primaryResourceEntryView.getTxtPriceForMusic(), primaryResourceEntryView.getTxtMusicalGroup()));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				if(place==1){
					try {
						StorablePrimaryResources.addPResource(new Place(primaryResourceEntryView.getTxtVenueName(), primaryResourceEntryView.getTxtOpeningTime(), primaryResourceEntryView.getTxtClosingTime(), primaryResourceEntryView.getTxtBillPerDay()));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				if(trans==1){
				TransportationManangementView transView = new TransportationManangementView();
				TransportationController transController = new TransportationController(invi, transView);
				transView.setVisible(true);
				primaryResourceEntryView.setVisible(false);
				}
				
			
			else{
				GuestEntryView guestView = new GuestEntryView();
				GuestEntryController guestEntryController = new GuestEntryController(guestView);
				guestView.setVisible(true);
				primaryResourceEntryView.setVisible(false);
			}
			// TODO Auto-generated method stub
			
		}
		
	}

}

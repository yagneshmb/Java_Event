package com.eventManagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.eventManagement.model.StorablePrimaryResources;
import com.eventManagement.model.communicationalActivities.CommunicationMed;
import com.eventManagement.model.resources.transportationManagement.TransportationMed;
import com.eventManagement.view.CommunicationMediumView;
import com.eventManagement.view.GuestEntryView;
import com.eventManagement.view.TransportationManangementView;

public class CommunicationMedController {
	private CommunicationMediumView communicationView;

	public CommunicationMedController(CommunicationMediumView communicationView) {
		super();
		this.communicationView = communicationView;
		this.communicationView.addCmnGoAheadBehaviour(new CmnListener());
		this.communicationView.addAddMoreBehaviour(new CmnListener());
		this.communicationView.addAddCmnMedBehaviour(new CmnListener());
	}
	public class CmnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()){
			case "Add Media":
				
				CommunicationMed tempCmn = new CommunicationMed(communicationView.getName(), communicationView.getCmnPricePerUnit());
				try {
					StorablePrimaryResources.addPResource(tempCmn);
					//StorableManagers.addManager(tempManager);
					CommunicationMediumView.setLblCmnRealEventName("Cmn Medium Registered! Add More if you wish");
					//subManagerEntryView.setAllNull();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
				break;
			case "Add More":
				communicationView.setAllNull();
				CommunicationMediumView.setLblCmnRealEventName("Enter Details");
				break;

			case "Go Ahead":
				GuestEntryView guestEntryView = new GuestEntryView();
				GuestEntryController guestController = new GuestEntryController(guestEntryView);
				guestEntryView.setVisible(true);
				communicationView.setVisible(false);
				
			
			}
			
		}
		
	}
	

}

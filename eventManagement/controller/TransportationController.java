package com.eventManagement.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.eventManagement.model.StorablePrimaryResources;
import com.eventManagement.model.managers.StorableManagers;
import com.eventManagement.model.managers.SubManager;
import com.eventManagement.model.resources.transportationManagement.TransportationMed;
import com.eventManagement.view.CommunicationMediumView;
import com.eventManagement.view.GuestEntryView;
import com.eventManagement.view.TransportationManangementView;

public class TransportationController {
	private int invi;
	private TransportationManangementView transportationManagementView;
	public TransportationController(int invi, TransportationManangementView transportationManagementView) {
		super();
		this.invi = invi;
		this.transportationManagementView = transportationManagementView;
		this.transportationManagementView.addAddMoreBehaviour(new transportationEntryListener());
		this.transportationManagementView.addTrGoAheadBehaviour(new transportationEntryListener());
		this.transportationManagementView.addVehicleBehaviour(new transportationEntryListener());
	}
	public class transportationEntryListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			switch(e.getActionCommand()){
			case "Add Vehicle":
				
				TransportationMed tempTransport = new TransportationMed(transportationManagementView.getName(), transportationManagementView.getMaxGuest(), transportationManagementView.getPricePerDay());
				try {
					StorablePrimaryResources.addPResource(new TransportationMed(tempTransport.getTypeOfTransportation(), tempTransport.getMaxGuestInAMed(), tempTransport.getPricePerDayPerGuest()));
					//StorableManagers.addManager(tempManager);
					TransportationManangementView.setVehicleStatus("Transportation Medium Registered! Add More if you wish");
					//subManagerEntryView.setAllNull();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
				break;
			case "Add More":
				transportationManagementView.setAllNull();
				transportationManagementView.setVehicleStatus("Enter Details");
				break;

			case "Go Ahead":
				if(invi==1){
					CommunicationMediumView CmnView = new CommunicationMediumView();
					CommunicationMedController CmnController = new CommunicationMedController(CmnView);
					transportationManagementView.setVisible(false);
					CmnView.setVisible(true);

				}
				else{
					
					GuestEntryView guestEntryView = new GuestEntryView();
					GuestEntryController guestController = new GuestEntryController(guestEntryView);
					guestEntryView.setVisible(true);
					transportationManagementView.setVisible(false);
				}
				break;
				// TODO Auto-generated method stub



			}

		}
	}
}

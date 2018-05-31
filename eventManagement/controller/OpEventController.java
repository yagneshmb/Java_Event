package com.eventManagement.controller;

import com.eventManagement.model.Customer;
import com.eventManagement.model.Event;
import com.eventManagement.view.*;

import java.awt.event.*;
public class OpEventController{
	//views
	//private EventEntry eventView;
	private OpEvent OpEventView;
	//model classes
	//Event eventModel;
	//Customer customerModel;
	public OpEventController(OpEvent opEventView) {
		super();
		//this.eventView = eventView;
		this.OpEventView = opEventView;
		this.OpEventView.setBtnCreateEventListener(new CreateEventHandler());
		//this.eventModel = eventModel;
		//this.customerModel = customerModel;
	}
	
	//class for eventHandle
	public class CreateEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent opE) {
			EventEntry eventEntryView = new EventEntry();
			eventEntryView.setVisible(true);
			EventEntryController opEventController = new EventEntryController(eventEntryView);
			OpEventView.setVisible(false);
						
			
		}
		
		
	}
	
	
	
	
	
	
	

}

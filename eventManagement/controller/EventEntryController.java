package com.eventManagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.eventManagement.model.Event;
import com.eventManagement.model.Customer; 

import com.eventManagement.model.StorableEventEntry;
import com.eventManagement.view.EventEntry;
import com.eventManagement.view.SubManagerEntryView;;
public class EventEntryController {
	private EventEntry eventEntryView;

	public EventEntryController(EventEntry eventEntryView) {
		super();
		this.eventEntryView = eventEntryView;
		eventEntryView.setRegisterEventBehaviour(new RegisterEventListener());
		eventEntryView.setGoAheadBehaviour(new GoAheadListener());
	}
	public class RegisterEventListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent registerEvent) {
			try {
				StorableEventEntry.addEvent(new Event( eventEntryView.getEventName(), Event.getEventID(), eventEntryView.getDateOfEvent(), eventEntryView.getTotalDays()), new Customer(eventEntryView.getCust_name(), eventEntryView.getCust_contactNo(), eventEntryView.getCust_addr(), eventEntryView.getCust_email_ID()));
				eventEntryView.setGoAheadDirector("Event registered! now Go Ahead");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}
	public class GoAheadListener implements ActionListener{
		public void actionPerformed(ActionEvent goAhead){
			
			SubManagerEntryView storableManagerView = new SubManagerEntryView(eventEntryView.getEventName());	
			storableManagerView.setVisible(true);
			storableManagerView.pack();
			SubManagerEntryController subManagerEntryController = new SubManagerEntryController(storableManagerView);
			
			eventEntryView.setVisible(false);
		}

	}

}

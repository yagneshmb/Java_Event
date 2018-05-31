package com.eventManagement.view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class OpEvent extends JFrame{
	private JButton btnCreateEvent;
	private JButton btnEditEvent;
	private JButton btnCalculateBill;
	private JButton btnCheckStatus;
	private JButton btnViewRecords;
	
	

	public OpEvent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnCreateEvent = new JButton("Create Event");
		btnCreateEvent.setBounds(52, 61, 118, 23);
		getContentPane().add(btnCreateEvent);
		
		btnEditEvent = new JButton("Edit Event");
		btnEditEvent.setBounds(244, 61, 89, 23);
		getContentPane().add(btnEditEvent);
		
		btnCalculateBill = new JButton("Calculate bill");
		btnCalculateBill.setBounds(62, 111, 124, 23);
		getContentPane().add(btnCalculateBill);
		
		btnCheckStatus = new JButton("Check Status");
		btnCheckStatus.setBounds(244, 111, 103, 23);
		getContentPane().add(btnCheckStatus);
		
		btnViewRecords = new JButton("View Records");
		btnViewRecords.setBounds(167, 175, 118, 23);
		getContentPane().add(btnViewRecords);
	}
	public void setBtnCreateEventListener(ActionListener listener){
		this.btnCreateEvent.addActionListener(listener);		
	}
	public void setBtnViewRecordsListener(ActionListener listener){
		this.btnViewRecords.addActionListener(listener);		
	}
	public void setBtnCheckStatusListener(ActionListener listener){
		this.btnCheckStatus.addActionListener(listener);		
	}
	public void setCalculateBillListener(ActionListener listener){
		this.btnCalculateBill.addActionListener(listener);		
	}
	public void setBtnEditEventListener(ActionListener listener){
		this.btnEditEvent.addActionListener(listener);		
	}

}

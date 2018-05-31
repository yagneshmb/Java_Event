package com.eventManagement.view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class PrimaryResourceView extends JFrame{
	private JLabel lblSlctPrmryRsrc;
	private JCheckBox chckbxDecoration;
	private JCheckBox chckbxMusic;
	private JCheckBox chckbxGuestAllocation;
	private JCheckBox chckbxTransportation;
	private JCheckBox chckbxInvitatonToGuests;
	private JButton btnDone;
	private JLabel lblInstruction ;
	private JCheckBox chckbxPlaceBooking;
	private JLabel lblEventName;
	private JLabel lblRealEventName;
	
	public void addDecorationListener(ActionListener listener){
		this.chckbxGuestAllocation.addActionListener(listener);
		
	}

	public void addGuestAllocationListener(ActionListener listener){
		this.chckbxGuestAllocation.addActionListener(listener);
	}
	public void addTransportationListener(ActionListener listener){
		this.chckbxTransportation.addActionListener(listener);
	}
	public void addInvitationListener(ActionListener listener){
		this.chckbxInvitatonToGuests.addActionListener(listener);
	}
	public void addMusicListener(ActionListener listener){
		this.chckbxMusic.addActionListener(listener);
	}
	public void addPlaceBookingListener(ActionListener listener){
		this.chckbxPlaceBooking.addActionListener(listener);
	}
	public boolean isTransportationSelected(){
		return this.chckbxTransportation.isSelected();
	}
	public boolean isMusicSelected(){
		return this.chckbxMusic.isSelected();
	}
	public boolean isInvitationSelected(){
		return this.chckbxInvitatonToGuests.isSelected();
	}
	public boolean isDecorationSelected(){
		return this.chckbxDecoration.isSelected();
	}
	public boolean isGuestAllocationSelected(){
		return this.chckbxGuestAllocation.isSelected();
	}
	public boolean isPlaceBookingSelected(){
		return this.chckbxPlaceBooking.isSelected();
	}
	public void addPRDoneBehaviour(ActionListener listener){
		this.btnDone.addActionListener(listener);
	}
	

	public PrimaryResourceView() {
		initialize();
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblSlctPrmryRsrc = new JLabel("Select Primary Resouces");
		lblSlctPrmryRsrc.setBounds(22, 24, 133, 14);
		getContentPane().add(lblSlctPrmryRsrc);
		
		chckbxDecoration = new JCheckBox("Decoration");
		chckbxDecoration.setBounds(22, 45, 97, 23);
		getContentPane().add(chckbxDecoration);
		
		chckbxTransportation = new JCheckBox("Transportation of Guests");
		chckbxTransportation.setBounds(22, 112, 170, 23);
		getContentPane().add(chckbxTransportation);
		
		chckbxGuestAllocation = new JCheckBox("Guest Allocation");
		chckbxGuestAllocation.setBounds(22, 79, 103, 23);
		getContentPane().add(chckbxGuestAllocation);
		
		chckbxInvitatonToGuests = new JCheckBox("Invitaton to Guests");
		chckbxInvitatonToGuests.setBounds(22, 152, 155, 23);
		getContentPane().add(chckbxInvitatonToGuests);
		
		btnDone = new JButton("Done");
		btnDone.setBounds(181, 210, 89, 23);
		getContentPane().add(btnDone);
		
		lblInstruction = new JLabel("");
		lblInstruction.setBounds(171, 182, 46, 14);
		getContentPane().add(lblInstruction);
		
		chckbxMusic = new JCheckBox("Music");
		chckbxMusic.setBounds(22, 178, 97, 23);
		getContentPane().add(chckbxMusic);
		
		chckbxPlaceBooking = new JCheckBox("Place Booking");
		chckbxPlaceBooking.setBounds(203, 45, 97, 23);
		getContentPane().add(chckbxPlaceBooking);
		
		lblEventName = new JLabel("Event Name:");
		lblEventName.setBounds(107, 11, 70, 14);
		getContentPane().add(lblEventName);
		
		lblRealEventName = new JLabel("New label");
		lblRealEventName.setBounds(186, 11, 46, 14);
		getContentPane().add(lblRealEventName);
	}
}

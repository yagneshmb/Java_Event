package com.eventManagement.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GuestEntryView extends JFrame{

	private JTextField txtGuestName;
	private JTextField txtGuestCNo;
	private JTextField txtGuestAddr;
	private JTextField txtCmnMedium;
	private JTextField txtTrMedium;
	private JLabel lblEventName;
	private static JLabel lblGRealEventName;
	private JLabel lblGuestName ;
	private JLabel lblGuestContactNo;
	private JLabel lblGuestAddress;
	private JTextPane txtpnFirstClickAdd ;
	private JButton btnAddGuest;
	private JButton btnAddMoreGuest;
	private JButton btnGuestGoAhead;
	private JLabel lblCommunicationMedium ;
	private JLabel lblTrMed;
	private JLabel lblGuestStatus;
	private JLabel lblEventstatus;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public void setlblEventStatus(String strng){
		this.lblEventstatus.setText(strng);
	}
	public GuestEntryView() {
		initialize();
	}
	public void addGuestGoAheadBehaviour(ActionListener listener){
		this.btnGuestGoAhead.addActionListener(listener);
	}
	public void addAddGuestBehaviour(ActionListener listener){
		this.btnAddGuest.addActionListener(listener);
	}
	public void addAddMoreBehaviour(ActionListener listener){
		this.btnAddMoreGuest.addActionListener(listener);
	}
	public String getTxtGuestName() {
		return this.txtGuestName.getText();
	}
	public String getTxtGuestCNo() {
		return this.txtGuestCNo.getText();
	}
	public String getTxtGuestAddr() {
		return this.txtGuestAddr.getText();
	}
	public String getTxtCmnMedium() {
		return this.txtCmnMedium.getText();
	}
	public String getTxtTrMedium() {
		return this.txtTrMedium.getText();
	}
	public static String getEventName()
	{
		return lblGRealEventName.getText();
	}



	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {

		this.setBounds(100, 100, 450, 366);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		lblEventName = new JLabel("Event Name:");
		lblEventName.setBounds(107, 11, 72, 14);
		this.getContentPane().add(lblEventName);

		lblGRealEventName = new JLabel("New label");
		lblGRealEventName.setBounds(180, 11, 46, 14);
		this.getContentPane().add(lblGRealEventName);

		lblGuestName = new JLabel("Guest Name:");
		lblGuestName.setBounds(22, 49, 72, 14);
		this.getContentPane().add(lblGuestName);

		txtGuestName = new JTextField();
		txtGuestName.setBounds(107, 46, 159, 20);
		this.getContentPane().add(txtGuestName);
		txtGuestName.setColumns(10);

		lblGuestContactNo = new JLabel("Guest Contact No:");
		lblGuestContactNo.setBounds(22, 74, 97, 14);
		this.getContentPane().add(lblGuestContactNo);

		txtGuestCNo = new JTextField();
		txtGuestCNo.setBounds(117, 71, 149, 20);
		this.getContentPane().add(txtGuestCNo);
		txtGuestCNo.setColumns(10);

		lblGuestAddress = new JLabel("Guest Address:");
		lblGuestAddress.setBounds(22, 99, 79, 14);
		this.getContentPane().add(lblGuestAddress);

		txtGuestAddr = new JTextField();
		txtGuestAddr.setBounds(107, 102, 159, 20);
		this.getContentPane().add(txtGuestAddr);
		txtGuestAddr.setColumns(10);

		txtpnFirstClickAdd = new JTextPane();
		txtpnFirstClickAdd.setText("First Click Add Guest and after adding click \"Add More\" if wish.If you don't wanna add more then click \"Go Ahead\"");
		txtpnFirstClickAdd.setForeground(Color.WHITE);
		txtpnFirstClickAdd.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtpnFirstClickAdd.setBackground(Color.BLACK);
		txtpnFirstClickAdd.setBounds(10, 225, 411, 57);
		this.getContentPane().add(txtpnFirstClickAdd);

		btnAddGuest = new JButton("Add Guest");
		btnAddGuest.setBounds(10, 293, 89, 23);
		this.getContentPane().add(btnAddGuest);

		btnAddMoreGuest = new JButton("Add More Guest");
		btnAddMoreGuest.setBounds(123, 293, 118, 23);
		this.getContentPane().add(btnAddMoreGuest);

		btnGuestGoAhead = new JButton("Go Ahead");
		btnGuestGoAhead.setBounds(265, 293, 89, 23);
		this.getContentPane().add(btnGuestGoAhead);

		lblCommunicationMedium = new JLabel("Communication Medium:");
		lblCommunicationMedium.setBounds(22, 133, 121, 14);
		this.getContentPane().add(lblCommunicationMedium);

		txtCmnMedium = new JTextField();
		txtCmnMedium.setToolTipText("Write correct name otherwise it will not be added to data");
		txtCmnMedium.setBounds(153, 130, 113, 20);
		this.getContentPane().add(txtCmnMedium);
		txtCmnMedium.setColumns(10);

		lblTrMed = new JLabel("Transportation Medium:");
		lblTrMed.setBounds(22, 164, 121, 14);
		this.getContentPane().add(lblTrMed);

		txtTrMedium = new JTextField();
		txtTrMedium.setBounds(153, 161, 121, 20);
		this.getContentPane().add(txtTrMedium);
		txtTrMedium.setColumns(10);

		lblGuestStatus = new JLabel("New label");
		lblGuestStatus.setBounds(10, 25, 315, 14);
		this.getContentPane().add(lblGuestStatus);
		
		lblEventstatus = new JLabel("EventStatus");
		lblEventstatus.setBounds(22, 189, 275, 14);
		getContentPane().add(lblEventstatus);
	}
	
}

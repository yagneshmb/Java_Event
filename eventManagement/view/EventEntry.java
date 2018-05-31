package com.eventManagement.view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JButton;

public class EventEntry extends JFrame{


	private static JTextField eventName;
	private JTextField dateOfEvent;
	private JTextField totalDays;
	private JLabel lblCustname;
	private JTextField cust_name;
	private JLabel lblcust_email_ID;
	private JTextField cust_email_ID;
	private JLabel lblCust_No;
	private JTextField cust_contactNo;
	private JLabel lblcust_Addr;
	private JTextField cust_addr;
	private JButton btnRegisterEvent;
	private JButton btnGoAhead;
	private JLabel goAheadInstructor;
	private JLabel goAheadDirector;

	/**
	 * Launch the application.
	 */
	

	public static String getEventName() {
		return eventName.getText();
	}

	public String getDateOfEvent() {
		return dateOfEvent.getText();
	}

	public int getTotalDays() {
		return Integer.parseInt(totalDays.getText());
	}

	public String getCust_name() {
		return cust_name.getText();
	}

	public String getCust_email_ID() {
		return cust_email_ID.getText();
	}

	public String getCust_contactNo() {
		return cust_contactNo.getText();
	}

	public String getCust_addr() {
		return cust_addr.getText();
	}
	
	public void setRegisterEventBehaviour(ActionListener listener){
		this.btnRegisterEvent.addActionListener(listener);
	}

	public void setGoAheadDirector(String goAheadDirector) {
		this.goAheadDirector.setText(goAheadDirector);
	}

	/**
	 * Create the application.
	 */
	public EventEntry() {
		initialize();
	}
	public void setGoAheadBehaviour(ActionListener listener) {
		this.btnGoAhead.addActionListener(listener);
		// TODO Auto-generated method stub

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblEventName = new JLabel("EventName");
		lblEventName.setToolTipText("");
		lblEventName.setBounds(10, 39, 66, 24);
		this.getContentPane().add(lblEventName);
		
		eventName = new JTextField();
		eventName.setBounds(104, 41, 86, 20);
		this.getContentPane().add(eventName);
		eventName.setColumns(10);
		
		JLabel lblDateOfEvent = new JLabel("Date Of Event");
		lblDateOfEvent.setBounds(10, 85, 91, 14);
		this.getContentPane().add(lblDateOfEvent);
		
		dateOfEvent = new JTextField();
		dateOfEvent.setBounds(104, 82, 86, 20);
		this.getContentPane().add(dateOfEvent);
		dateOfEvent.setColumns(10);
		
		JLabel lblTotalDays = new JLabel("Day Of Event");
		lblTotalDays.setBounds(10, 126, 66, 14);
		this.getContentPane().add(lblTotalDays);
		
		totalDays = new JTextField();
		totalDays.setBounds(104, 123, 86, 20);
		this.getContentPane().add(totalDays);
		totalDays.setColumns(10);
		
		lblCustname = new JLabel("CustName");
		lblCustname.setBounds(227, 44, 66, 14);
		this.getContentPane().add(lblCustname);
		
		cust_name = new JTextField();
		cust_name.setBounds(293, 41, 86, 20);
		this.getContentPane().add(cust_name);
		cust_name.setColumns(10);
		
		lblcust_email_ID = new JLabel("Email_ID");
		lblcust_email_ID.setBounds(227, 85, 46, 14);
		this.getContentPane().add(lblcust_email_ID);
		
		cust_email_ID = new JTextField();
		cust_email_ID.setBounds(293, 82, 86, 20);
		this.getContentPane().add(cust_email_ID);
		cust_email_ID.setColumns(10);
		
		lblCust_No = new JLabel("CNo");
		lblCust_No.setBounds(227, 126, 46, 14);
		this.getContentPane().add(lblCust_No);
		
		cust_contactNo = new JTextField();
		cust_contactNo.setBounds(293, 123, 86, 20);
		this.getContentPane().add(cust_contactNo);
		cust_contactNo.setColumns(10);
		
		lblcust_Addr = new JLabel("Address");
		lblcust_Addr.setBounds(227, 157, 46, 14);
		this.getContentPane().add(lblcust_Addr);
		
		cust_addr = new JTextField();
		cust_addr.setBounds(293, 154, 86, 20);
		this.getContentPane().add(cust_addr);
		cust_addr.setColumns(10);
		
		btnRegisterEvent = new JButton("Register Event");
		btnRegisterEvent.setBounds(71, 209, 132, 23);
		this.getContentPane().add(btnRegisterEvent);
		
		btnGoAhead = new JButton("Go Ahead");
		btnGoAhead.setBounds(251, 209, 89, 23);
		getContentPane().add(btnGoAhead);
		
		goAheadInstructor = new JLabel("Select Go Ahead only after registering the Event");
		goAheadInstructor.setBounds(68, 11, 253, 14);
		getContentPane().add(goAheadInstructor);
		
		goAheadDirector = new JLabel("New label");
		goAheadDirector.setBounds(56, 184, 237, 14);
		getContentPane().add(goAheadDirector);
	}
}

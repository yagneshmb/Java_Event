package com.eventManagement.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JCheckBox;

public class SubManagerView extends JFrame{

	private JTextField subManagerText;
	private JCheckBox chckbxEvent1;
	private JCheckBox chckbxEvent2;
	private JCheckBox chckbxEvent3;
	private JLabel lblOtherEvents;
	private JCheckBox chckbxOtherEvent1;
	private JCheckBox chckbxOtherEvent2;
	private JCheckBox chckbxOtherEvent3;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public SubManagerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel subManagerName = new JLabel("Name:");
		subManagerName.setBounds(10, 11, 46, 14);
		this.getContentPane().add(subManagerName);
		
		subManagerText = new JTextField();
		subManagerText.setBounds(50, 8, 86, 20);
		this.getContentPane().add(subManagerText);
		subManagerText.setColumns(10);
		
		chckbxEvent1 = new JCheckBox("Event 1");
		chckbxEvent1.setBounds(10, 47, 97, 23);
		this.getContentPane().add(chckbxEvent1);
		
		chckbxEvent2 = new JCheckBox("Event 2");
		chckbxEvent2.setBounds(10, 73, 97, 23);
		this.getContentPane().add(chckbxEvent2);
		
		chckbxEvent3 = new JCheckBox("Event 3");
		chckbxEvent3.setBounds(10, 99, 97, 23);
		this.getContentPane().add(chckbxEvent3);
		
		lblOtherEvents = new JLabel("Other Events");
		lblOtherEvents.setBounds(197, 11, 97, 14);
		this.getContentPane().add(lblOtherEvents);
		
		chckbxOtherEvent1 = new JCheckBox("OtherEvent1");
		chckbxOtherEvent1.setBounds(197, 30, 97, 23);
		this.getContentPane().add(chckbxOtherEvent1);
		
		chckbxOtherEvent2 = new JCheckBox("OtherEvent2");
		chckbxOtherEvent2.setBounds(197, 73, 97, 23);
		this.getContentPane().add(chckbxOtherEvent2);
		
		chckbxOtherEvent3 = new JCheckBox("OtherEvent3");
		chckbxOtherEvent3.setBounds(197, 122, 97, 23);
		this.getContentPane().add(chckbxOtherEvent3);
	}
}

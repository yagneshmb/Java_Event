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

public class TransportationManangementView extends JFrame{

	private JTextField txtMediumName;
	private JTextField txtPricePerDay;
	private JTextField txtMaxGuest;
	private JButton btnAddVehicle;
	private JButton btnTrAddMore;
	private JButton btnTrGoAhead ;
	private JTextPane textPane;
	private JLabel lblMaxGuest ;
	private JLabel lblPricePerDay;
	private JLabel lblMediumName;
	private JLabel lblTitle;
	private JLabel lblEventName;
	private JLabel lblRealEventName;
	private static JLabel lblVehicleStatus;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public void addTrGoAheadBehaviour(ActionListener listener){
		this.btnTrGoAhead.addActionListener(listener);
	}
	public void addVehicleBehaviour(ActionListener listener){
		this.btnAddVehicle.addActionListener(listener);
	}
	public void addAddMoreBehaviour(ActionListener listener){
		this.btnTrAddMore.addActionListener(listener);
	}
	public TransportationManangementView() {
		initialize();
	}
	public double getPricePerDay(){
		return Double.parseDouble(this.txtPricePerDay.getText());
	}
	public int getMaxGuest(){
		return Integer.parseInt(this.txtMaxGuest.getText());
	}
	public static void setVehicleStatus(String vehicleStatus){
		lblVehicleStatus.setText(vehicleStatus);
	}
	public void setAllNull(){
		this.txtMaxGuest.setText("");
		this.txtMediumName.setText("");
		this.txtPricePerDay.setText("");
	}
	public String getTransName(){
		return this.txtMediumName.getText();
	}
	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		lblTitle = new JLabel("Transportation Med Details");
		lblTitle.setBounds(10, 0, 145, 14);
		this.getContentPane().add(lblTitle);
		
		lblMediumName = new JLabel("Medium Name:");
		lblMediumName.setBounds(53, 50, 76, 14);
		this.getContentPane().add(lblMediumName);
		
		txtMediumName = new JTextField();
		txtMediumName.setBounds(139, 47, 106, 20);
		this.getContentPane().add(txtMediumName);
		txtMediumName.setColumns(10);
		
		lblPricePerDay = new JLabel("Price per Day:");
		lblPricePerDay.setBounds(53, 70, 76, 14);
		this.getContentPane().add(lblPricePerDay);
		
		txtPricePerDay = new JTextField();
		txtPricePerDay.setBounds(139, 67, 106, 20);
		this.getContentPane().add(txtPricePerDay);
		txtPricePerDay.setColumns(10);
		
		lblMaxGuest = new JLabel("Max Guests in a medium:");
		lblMaxGuest.setBounds(10, 95, 119, 14);
		this.getContentPane().add(lblMaxGuest);
		
		txtMaxGuest = new JTextField();
		txtMaxGuest.setBounds(139, 92, 106, 20);
		this.getContentPane().add(txtMaxGuest);
		txtMaxGuest.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setText("First Click Add Submanager and after adding click \"Add More\" if wish.If you don't wanna add more then click \"Go Ahead\"");
		textPane.setForeground(Color.WHITE);
		textPane.setFont(new Font("Consolas", Font.PLAIN, 14));
		textPane.setBackground(Color.BLACK);
		textPane.setBounds(10, 134, 411, 57);
		this.getContentPane().add(textPane);
		
		btnAddVehicle = new JButton("Add Vehicle");
		btnAddVehicle.setBounds(21, 212, 108, 23);
		this.getContentPane().add(btnAddVehicle);
		
		btnTrAddMore = new JButton("Add More");
		btnTrAddMore.setBounds(156, 212, 89, 23);
		this.getContentPane().add(btnTrAddMore);
		
		btnTrGoAhead = new JButton("Go Ahead");
		btnTrGoAhead.setBounds(287, 212, 89, 23);
		this.getContentPane().add(btnTrGoAhead);
		
		lblEventName = new JLabel("Event:");
		lblEventName.setBounds(188, 11, 46, 14);
		getContentPane().add(lblEventName);
		
		lblRealEventName = new JLabel("New label");
		lblRealEventName.setBounds(254, 11, 46, 14);
		getContentPane().add(lblRealEventName);
		
		lblVehicleStatus = new JLabel("New label");
		lblVehicleStatus.setBounds(20, 25, 235, 14);
		getContentPane().add(lblVehicleStatus);
	}

}

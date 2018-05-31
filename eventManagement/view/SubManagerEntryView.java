package com.eventManagement.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;

public class SubManagerEntryView extends JFrame{

	private JTextField cNoOfSubManagerTxtFld;
	private JTextField nameOfSubManagerTextFld;
	private  JLabel lblEventname;
	private static JLabel lblRealEventName;
	private JButton btnAddSubManager;
	private JLabel lblContactNo;
	private JLabel lblNameOfSubManager;
	private JTextPane txtpnAddS;
	private JButton btnAddMore;
	private JButton btnSubMGoAhead;
	private JLabel managerStatus;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public SubManagerEntryView(String eventName) {
		initialize(eventName);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void addSubMGoAheadBehaviour(ActionListener listener){
		this.btnSubMGoAhead.addActionListener(listener);
	}
	public void addAddSubManagerBehaviour(ActionListener listener){
		this.btnAddSubManager.addActionListener(listener);
	}
	public void addAddMoreBehaviour(ActionListener listener){
		this.btnAddMore.addActionListener(listener);
	}
	private void initialize(String eventName){
		this.setTitle("Worker Details");
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		lblNameOfSubManager = new JLabel("Name of SubManager");
		lblNameOfSubManager.setBounds(13, 64, 120, 14);
		this.getContentPane().add(lblNameOfSubManager);
		
		cNoOfSubManagerTxtFld = new JTextField();
		cNoOfSubManagerTxtFld.setBounds(143, 89, 86, 20);
		this.getContentPane().add(cNoOfSubManagerTxtFld);
		cNoOfSubManagerTxtFld.setColumns(10);
		
		lblContactNo = new JLabel("Contact No");
		lblContactNo.setBounds(28, 89, 105, 20);
		this.getContentPane().add(lblContactNo);
		
		nameOfSubManagerTextFld = new JTextField();
		nameOfSubManagerTextFld.setColumns(10);
		nameOfSubManagerTextFld.setBounds(143, 58, 86, 20);
		this.getContentPane().add(nameOfSubManagerTextFld);
		
		btnAddSubManager = new JButton("Add SubManager");
		btnAddSubManager.setBounds(13, 203, 120, 23);
		this.getContentPane().add(btnAddSubManager);
		
		lblEventname = new JLabel("EventName:");
		lblEventname.setBounds(28, 11, 68, 14);
		this.getContentPane().add(lblEventname);
		
		lblRealEventName = new JLabel(eventName);
		lblRealEventName.setBounds(106, 11, 86, 14);
		this.getContentPane().add(lblRealEventName);
		
		btnSubMGoAhead = new JButton("Go Ahead");
		btnSubMGoAhead.setBounds(273, 203, 89, 23);
		getContentPane().add(btnSubMGoAhead);
		
		this.txtpnAddS = new JTextPane();
		txtpnAddS.setBackground(Color.BLACK);
		txtpnAddS.setForeground(Color.WHITE);
		txtpnAddS.setText("First Click Add Submanager and after adding click \"Add More\" if wish.If you don't wanna add more then click \"Go Ahead\"");
		txtpnAddS.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtpnAddS.setBounds(13, 125, 411, 57);
		getContentPane().add(txtpnAddS);
		
		btnAddMore = new JButton("Add More");
		btnAddMore.setToolTipText("Always click after clicking \"Add SubManager\" otherwise the data will not be registered");
		btnAddMore.setBounds(159, 203, 89, 23);
		getContentPane().add(btnAddMore);
		
		managerStatus = new JLabel("Enter SubManagerDetails");
		managerStatus.setBounds(38, 36, 367, 14);
		getContentPane().add(managerStatus);
	}

	
	public void setManagerStatus(String mStatus){
		this.managerStatus.setText(mStatus);
	}

	public void setLblEventname(String lblEventname) {
		this.lblEventname.setText(lblEventname);
	}
	
	public void setAllNull(){
		this.cNoOfSubManagerTxtFld.setText("");
		this.nameOfSubManagerTextFld.setText("");
		this.managerStatus.setText("");
		
	}
	

	public String getcNoOfSubManagerTxtFld() {
		return this.cNoOfSubManagerTxtFld.getText();
	}

	public String getNameOfSubManagerTextFld() {
		return this.nameOfSubManagerTextFld.getText();
	}

	public String getLblContactNo() {
		return this.lblContactNo.getText();
	}

	public void setLblRealEventName(String lblRealEventName) {
		this.lblRealEventName.setText(lblRealEventName);
	}
	public static String getLblRealEventName() {
			return lblRealEventName.getText();
	}
}

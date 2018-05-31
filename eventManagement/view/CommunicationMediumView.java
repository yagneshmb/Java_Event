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

public class CommunicationMediumView extends JFrame{


	private JTextField txtCmnName;
	private JLabel lblEventName;
	private JLabel lblNewLabel;
	private static JLabel lblCmnRealEventName;
	private JLabel lblCtitle;
	private JLabel lblCommunicationName;
	private JTextPane txtpnFirstClickAdd;
	private JButton btnAddCmn;
	private JButton btnCmnAddMore ;
	private JButton btnCmnGoAhead ;
	private JLabel lblPricePerUnit;
	private JTextField txtPricePerUnit;

	public String getCmnName(){
		return txtCmnName.getText();
	}
	public double getCmnPricePerUnit(){
		return Double.parseDouble(txtPricePerUnit.getText());
	}
	public static void setLblCmnRealEventName(String lblCmnRealEventName1){
		lblCmnRealEventName.setText(lblCmnRealEventName1);
	}
	public CommunicationMediumView() {
		initialize();
	}
	

	public void addCmnGoAheadBehaviour(ActionListener listener){
		this.btnCmnGoAhead.addActionListener(listener);
	}
	public void addAddCmnMedBehaviour(ActionListener listener){
		this.btnAddCmn.addActionListener(listener);
	}
	public void addAddMoreBehaviour(ActionListener listener){
		this.btnCmnAddMore.addActionListener(listener);
	}
	public void setAllNull(){
		this.txtCmnName.setText("");
		this.txtPricePerUnit.setText("");
	}
	
	private void initialize() {

		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		lblEventName = new JLabel("Event Name:");
		lblEventName.setBounds(21, 11, 62, 14);
		this.getContentPane().add(lblEventName);

		lblCmnRealEventName = new JLabel("New label");
		lblCmnRealEventName.setBounds(93, 11, 46, 14);
		this.getContentPane().add(lblCmnRealEventName);

		lblCtitle = new JLabel("Communication Details");
		lblCtitle.setBounds(31, 36, 166, 14);
		this.getContentPane().add(lblCtitle);

		lblCommunicationName = new JLabel("Communication Name");
		lblCommunicationName.setBounds(21, 75, 102, 14);
		this.getContentPane().add(lblCommunicationName);

		txtCmnName = new JTextField();
		txtCmnName.setBounds(142, 72, 86, 20);
		this.getContentPane().add(txtCmnName);
		txtCmnName.setColumns(10);

		txtpnFirstClickAdd = new JTextPane();
		txtpnFirstClickAdd.setText("First Click Add Communication Media and after adding click \"Add More\" if wish.If you don't wanna add more then click \"Go Ahead\"");
		txtpnFirstClickAdd.setForeground(Color.WHITE);
		txtpnFirstClickAdd.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtpnFirstClickAdd.setBackground(Color.BLACK);
		txtpnFirstClickAdd.setBounds(10, 136, 411, 57);
		this.getContentPane().add(txtpnFirstClickAdd);

		btnAddCmn = new JButton("Add Communication");
		btnAddCmn.setBounds(21, 204, 133, 23);
		this.getContentPane().add(btnAddCmn);

		btnCmnAddMore = new JButton("Add More");
		btnCmnAddMore.setBounds(186, 204, 89, 23);
		this.getContentPane().add(btnCmnAddMore);

		btnCmnGoAhead = new JButton("Go Ahead");
		btnCmnGoAhead.setBounds(309, 204, 89, 23);
		this.getContentPane().add(btnCmnGoAhead);
		
		lblPricePerUnit = new JLabel("Price Per Unit");
		lblPricePerUnit.setBounds(37, 103, 102, 14);
		getContentPane().add(lblPricePerUnit);
		
		txtPricePerUnit = new JTextField();
		txtPricePerUnit.setBounds(142, 103, 86, 20);
		getContentPane().add(txtPricePerUnit);
		txtPricePerUnit.setColumns(10);
	}
}

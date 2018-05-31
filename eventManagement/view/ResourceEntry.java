package com.eventManagement.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class ResourceEntry extends JFrame{

	private JTextField txtResourceName;
	private JTextField txtPricePerQuantity;
	private JTextField txtQuantity;
	private JLabel lblEventName;
	private JLabel lblRealEventName;
	private JLabel lblResourceName;
	private JLabel lblPriceperquantity ;
	private JLabel lblQuantity;
	private JButton btnAddRResouce;
	private JButton btnGoRAhead;
	private JButton btnAddRMore;
	/**
	 * Launch the application.


	/**
	 * Create the application.
	 */
	public ResourceEntry() {
		initialize();
	}

	public String getTxtResourceName() {
		return this.txtResourceName.getText();
	}

	public double getTxtPricePerQuantity() {
		return Double.parseDouble(this.txtPricePerQuantity.getText());
	}

	public double getTxtQuantity() {
		return Double.parseDouble(this.txtQuantity.getText());
	}

	public JLabel getLblResourceName() {
		return lblResourceName;
	}

	public void setLblRealEventName(JLabel lblRealEventName) {
		this.lblRealEventName = lblRealEventName;
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		lblEventName = new JLabel("Event Name:");
		lblEventName.setBounds(26, 11, 81, 14);
		this.getContentPane().add(lblEventName);
		
		lblRealEventName = new JLabel("New label");
		lblRealEventName.setBounds(114, 11, 46, 14);
		this.getContentPane().add(lblRealEventName);
		
		lblResourceName = new JLabel("Resource Name:");
		lblResourceName.setBounds(26, 36, 81, 14);
		this.getContentPane().add(lblResourceName);
		
		txtResourceName = new JTextField();
		txtResourceName.setBounds(119, 36, 125, 20);
		this.getContentPane().add(txtResourceName);
		txtResourceName.setColumns(10);
		
		lblPriceperquantity = new JLabel("PricePerQuantity:");
		lblPriceperquantity.setBounds(26, 73, 93, 14);
		this.getContentPane().add(lblPriceperquantity);
		
		txtPricePerQuantity = new JTextField();
		txtPricePerQuantity.setBounds(119, 70, 125, 20);
		this.getContentPane().add(txtPricePerQuantity);
		txtPricePerQuantity.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("First Click Add Submanager and after adding click \"Add More\" if wish.If you don't wanna add more then click \"Go Ahead\"");
		textPane.setForeground(Color.WHITE);
		textPane.setFont(new Font("Consolas", Font.PLAIN, 14));
		textPane.setBackground(Color.BLACK);
		textPane.setBounds(10, 130, 411, 57);
		this.getContentPane().add(textPane);
		
		lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(26, 105, 46, 14);
		this.getContentPane().add(lblQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(119, 99, 125, 20);
		this.getContentPane().add(txtQuantity);
		txtQuantity.setColumns(10);
		
		btnAddRResouce = new JButton("Add Resouce");
		btnAddRResouce.setBounds(26, 198, 106, 23);
		this.getContentPane().add(btnAddRResouce);
		
		btnAddRMore = new JButton("Add More");
		btnAddRMore.setBounds(158, 198, 89, 23);
		this.getContentPane().add(btnAddRMore);
		
		btnGoRAhead = new JButton("Go Ahead");
		btnGoRAhead.setBounds(275, 198, 89, 23);
		this.getContentPane().add(btnGoRAhead);
	}

}

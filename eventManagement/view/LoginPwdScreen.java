package com.eventManagement.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class LoginPwdScreen extends JFrame{


	private JLabel loginID;
	private JLabel password;
	private JTextField loginIDUserEntry;
	private JPasswordField loginPwdUserEntry;
	private JButton btnLogin;
	private JLabel isLoginCorrect;
	private JLabel lblStsLogin;
	private JLabel lblStsStatus; 
	private JButton btnOk;
	public void intialize() {

		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		loginID = new JLabel("LoginID");
		loginID.setBounds(105, 68, 47, 20);
		this.getContentPane().add(loginID);

		loginIDUserEntry = new JTextField();
		loginIDUserEntry.setBounds(186, 68, 90, 20);
		this.getContentPane().add(loginIDUserEntry);

		password = new JLabel("Password");
		password.setBounds(106, 99, 46, 20);
		this.getContentPane().add(password);

		loginPwdUserEntry = new JPasswordField();
		loginPwdUserEntry.setBounds(186, 99, 88, 20);
		this.getContentPane().add(loginPwdUserEntry);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(140, 152, 89, 23);
		this.getContentPane().add(btnLogin);

		isLoginCorrect = new JLabel();
		isLoginCorrect.setBounds(244, 175, 64, 23);
		this.getContentPane().add(isLoginCorrect);

		lblStsLogin = new JLabel("Login");
		lblStsLogin.setBounds(140, 199, 46, 14);
		getContentPane().add(lblStsLogin);

		lblStsStatus = new JLabel("Status");
		lblStsStatus.setBounds(186, 199, 46, 14);
		getContentPane().add(lblStsStatus);

		btnOk = new JButton("Ok");
		btnOk.setBounds(150, 224, 64, 23);
		getContentPane().add(btnOk);
	}

	public String getLoginIDUserEntry() {
		return loginIDUserEntry.getText();
	}

	public String getLoginPwdUserEntry() {
		return loginPwdUserEntry.getText();
	}

	public void setLoginBehaviour(ActionListener listener){
		btnLogin.addActionListener(listener);
	}


	public void setIsLoginCorrect(String isLogCorrect) {

		this.isLoginCorrect.setText(isLogCorrect);
	}

	public LoginPwdScreen() {
		this.intialize();
	}
	public void setlblStsStatus(String loginStatus){
		this.lblStsStatus.setText(loginStatus);
	}
	public void setbtnOkBehaviour(ActionListener listener){
		this.btnOk.addActionListener(listener);
	}
	public String getIsLoginCorrect(){
		return this.isLoginCorrect.getText();
	}
	
}

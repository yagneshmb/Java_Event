package com.eventManagement.controller;
import com.eventManagement.model.LoginModel;
import com.eventManagement.view.*;

import java.awt.event.*;
public class LoginController {
	private LoginPwdScreen loginView; // view of login class
	private LoginModel  loginModel;  //model of login class



	public LoginController(LoginPwdScreen loginView, LoginModel loginModel) {
		//	super();
		this.loginView = loginView;
		this.loginModel = loginModel;

		loginView.setLoginBehaviour(new LoginListener());
		loginView.setbtnOkBehaviour(new OkListener());
	}

	public class LoginListener implements ActionListener{


		public void actionPerformed(ActionEvent loginBtnClick) {


			if(loginBtnClick.getActionCommand().equals("Login"))
			{				
				checkCredintials();	


			}

		}

		public void checkCredintials(){

			if(loginModel.checkDetailCorrectness(loginView.getLoginIDUserEntry(),loginView.getLoginPwdUserEntry())){
				loginView.setIsLoginCorrect("Correct");
				loginView.setlblStsStatus("Done");
			}
			else{
				loginView.setIsLoginCorrect("Not Correct");
				loginView.setlblStsStatus("Error");

			}
		}

	}
	public class OkListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Ok")){
				if(loginView.getIsLoginCorrect().equals("Correct")){
					OpEvent eventView = new OpEvent();
					
					eventView.setVisible(true);
					OpEventController opEventController = new OpEventController(eventView);
					loginView.setVisible(false);
					

				}

			}

		}

	}



}

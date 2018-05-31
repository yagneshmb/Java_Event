package com.eventManagement.controller;
import com.eventManagement.model.LoginModel;
import com.eventManagement.view.*;

public class MainController {
	public static void main(String[] args){
		LoginPwdScreen loginscrn = new LoginPwdScreen();
		loginscrn.pack();
		loginscrn.setVisible(true);
		LoginModel loginModel = new LoginModel();
		LoginController loginController = new LoginController(loginscrn, loginModel);
	}

}

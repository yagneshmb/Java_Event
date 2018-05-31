package com.eventManagement.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.eventManagement.model.managers.StorableManagers;
import com.eventManagement.model.managers.SubManager;
import com.eventManagement.view.PrimaryResourceView;
import com.eventManagement.view.SubManagerEntryView;

public class SubManagerEntryController {
	/*View*/
			private SubManagerEntryView subManagerEntryView;
	/*model*/
			private StorableManagers storableManagers;
			private SubManager subManager;
			public SubManagerEntryController(SubManagerEntryView subManagerEntryView) {
				super();
				this.subManagerEntryView = subManagerEntryView;
				subManagerEntryView.addAddMoreBehaviour(new SubManagerEntryViewListener());
				subManagerEntryView.addAddSubManagerBehaviour(new SubManagerEntryViewListener());
				subManagerEntryView.addSubMGoAheadBehaviour(new SubManagerEntryViewListener());
				
//				subManagerEntryView.add
			}
			
			public class SubManagerEntryViewListener implements ActionListener{
				public void actionPerformed(ActionEvent addSubManager){
					switch(addSubManager.getActionCommand()){
					case "Add SubManager":
						SubManager tempManager = new SubManager(subManagerEntryView.getNameOfSubManagerTextFld(), subManagerEntryView.getcNoOfSubManagerTxtFld());
						try {
							StorableManagers.addManager(tempManager);
							subManagerEntryView.setManagerStatus("SubManager Registered! Add More if you wish");
							//subManagerEntryView.setAllNull();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						break;
					case "Add More" :
						subManagerEntryView.setAllNull();
						subManagerEntryView.setManagerStatus("Enter Details");
//						SubManager tempManager1 = new SubManager(subManagerEntryView.getNameOfSubManagerTextFld(), subManagerEntryView.getcNoOfSubManagerTxtFld());
//						try {
//							StorableManagers.addManager(tempManager1);
//							subManagerEntryView.setManagerStatus("SubManager Registered! Add More if you wish");
//							subManagerEntryView.setAllNull();
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
						break;
					case "Go Ahead":
						PrimaryResourceView primaryResourceView = new PrimaryResourceView();
						PrimaryResourceController primaryResourceController = new PrimaryResourceController(primaryResourceView);
						primaryResourceView.setVisible(true);
						subManagerEntryView.setVisible(false);

						
						
						
					}
					
						
					
					
				}
			}
			
	

}

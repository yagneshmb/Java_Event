package com.eventManagement.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.eventManagement.connection.EventManagementConnection;

public class StorableEventEntry {	/**
	 * @param event
	 * @param customer
	 * @throws SQLException
	 * @throws Exception
	 */
	public static void addEvent(Event event, Customer customer) throws SQLException, Exception{
		int dupCustID = 0;
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		Statement stmt2 = conn.createStatement();
		String eventDataEntry, checkDup, lastRowSQLID, insertCustIDIfAllNullNoDup, insertCustIDNNNDupFound, insertCustTable, noDupEventEntry;
		//eventDataEntry = "insert into eventmanagement.event(eventName, dateOfEvent, totalDays) values("  + "'"+event.getEventName() +"','"+ event.getDateOfEvent() +"',"+ event.getTotalDays() + ")" ; 
		//stmt.execute(eventDataEntry);
		checkDup = "select * from eventmanagement.customer where cust_name = " + "'" +customer.getCust_name()+ "'"+ " and " + "cust_addr =" + "'"+ customer.getCust_addr()+ "'" +" and "+ "cust_contactNo =" + "'"+customer.getCust_contactNo() + "'"+ " and " + "cust_email_ID =" + "'"+ customer.getCust_email_ID()+ "'";
		ResultSet checkDupResult = stmt2.executeQuery(checkDup);
		if(checkDupResult.next()){
			dupCustID = checkDupResult.getInt("custID");
			System.out.println(dupCustID);
		}
		if(dupCustID==0){
			lastRowSQLID = "select * from eventmanagement.customer ORDER BY custID DESC LIMIT 1";
			ResultSet checkResult = stmt.executeQuery(lastRowSQLID);
			if(checkResult.next()){
				
					int lastRowID = checkResult.getInt("custID");
					insertCustIDNNNDupFound = "insert into eventmanagement.event(custID, eventName, dateOfEvent, totalDays) values (" + (lastRowID+1) + ",'"+event.getEventName() +"','"+ event.getDateOfEvent() +"',"+ event.getTotalDays() +")";
					stmt.execute(insertCustIDNNNDupFound);
					insertCustTable = "insert into eventmanagement.customer(custID, cust_name, cust_addr, cust_email_ID, cust_contactNo) values(" + (lastRowID+1) + ",'" + customer.getCust_name() + "','" + customer.getCust_addr() + "','" + customer.getCust_email_ID() + "','" + customer.getCust_contactNo() + "'" + ")";
					
					stmt2.execute(insertCustTable);
				
			}
			else{
				insertCustIDIfAllNullNoDup =  "insert into eventmanagement.event(custID, eventName, dateOfEvent, totalDays) values (1" + ",'"+event.getEventName() +"','"+ event.getDateOfEvent() +"',"+ event.getTotalDays() +")";
				stmt.execute(insertCustIDIfAllNullNoDup);
				insertCustTable = "insert into eventmanagement.customer(custID, cust_name, cust_addr, cust_email_ID, cust_contactNo) values(" + 1 + ",'" + customer.getCust_name() + "','" + customer.getCust_addr() + "','" + customer.getCust_email_ID() + "','" + customer.getCust_contactNo() + "'" + ")";
				stmt2.execute(insertCustTable);
				
			}
			
			//stmt.execute(sql3);
		}
		else{
			System.out.println("eske");
			System.out.println("dupCustID");
			 noDupEventEntry ="insert into eventmanagement.event(custID, eventName, dateOfEvent, totalDays) values (" + dupCustID + ",'"+event.getEventName() +"','"+ event.getDateOfEvent() +"',"+ event.getTotalDays() +")";
			 stmt.execute(noDupEventEntry);
		}
		
		
		
		
		
	}
	

}

package com.eventManagement.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.eventManagement.connection.EventManagementConnection;
import com.eventManagement.controller.SubManagerEntryController;
import com.eventManagement.model.Music.MusicManagement;
import com.eventManagement.model.communicationalActivities.CommunicationMed;
import com.eventManagement.model.managers.SubManager;
import com.eventManagement.model.resources.Place;
import com.eventManagement.model.resources.DecorationManagement.DecorationManagement;
import com.eventManagement.model.resources.transportationManagement.TransportationMed;
import com.eventManagement.view.EventEntry;
import com.eventManagement.view.PrimaryResourceDetailEntryView;
import com.eventManagement.view.SubManagerEntryView;

public class StorablePrimaryResources {
	public static void addPResource(MusicManagement music) throws Exception, SQLException{
		System.out.println("music store");
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String addMusicDetail, findEventID;
		findEventID = "select * from eventmanagement.event where eventName = " +  "'" + EventEntry.getEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		
		ResultSet finEvent = stmt.executeQuery(findEventID);
		if(finEvent.next()){
		//System.out.println(finEvent.next());
		int eventID = finEvent.getInt("eventID");
		
		addMusicDetail = "insert into eventmanagement.music( musicPricePerProgram,musicGroupName) values(" 
								+ music.getPricePerProgram() + ","
								+ "'" + music.getSingersGroupName() + "',"
								+
								")";
		stmt.execute(addMusicDetail);}
		else{
			System.out.println("No events");
		}
		
	}	
	//Static polymorphism
	public static void addPResource(TransportationMed trans) throws Exception, SQLException{
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String addTrans, findEventID;
		findEventID = "select * from eventmanagement.event where eventName = " +  "'" + EventEntry.getEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		ResultSet finEvent = stmt.executeQuery(findEventID);
		if(finEvent.next()){
		//System.out.println(finEvent.next());
		int eventID = finEvent.getInt("eventID");
		addTrans = "insert into eventmanagement.transportation( pricePerDay,maxGuest,transName) values(" 
								+ trans.getPricePerDayPerGuest() + ","
								+ "'" + trans.getMaxGuestInAMed() + "',"
								+ "'" + trans.getTypeOfTransportation() +"'"
								+ 
								")";
		stmt.execute(addTrans);
		}
		else{
			System.out.println("No events");
		}
	}	
	public static void addPResource(DecorationManagement decoration) throws ClassNotFoundException, SQLException{
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String addDec, findEventID;
		findEventID = "select * from eventmanagement.event where eventName = " +  "'" + EventEntry.getEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		ResultSet finEvent = stmt.executeQuery(findEventID);
		if(finEvent.next()){
		//System.out.println(finEvent.next());
		int eventID = finEvent.getInt("eventID");
		addDec = "insert into eventmanagement.decor( decPrice,decPackageName) values(" 
								+ decoration.getPricePerPackage() + ","
								+ "'" + decoration.getPackageName() + "'"
								+
								")";
		stmt.execute(addDec);}
		System.out.println("No events");
	}
	public static void addPResource(CommunicationMed Cmn) throws ClassNotFoundException, SQLException{
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String addCmn, findEventID;
		findEventID = "select * from eventmanagement.event where eventName = " +  "'" + EventEntry.getEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		ResultSet finEvent = stmt.executeQuery(findEventID);
		System.out.println(finEvent.next());
		int eventID = finEvent.getInt("eventID");
		addCmn = "insert into eventmanagement.communication( priceCmn,nameCmn) values(" 
								+ Cmn.getPricePerUnit()+ ","
								+ "'" + Cmn.getTypeOfMedia() + "'"
								+
								")";
		stmt.execute(addCmn);
	}
	public static void addPResource(Place place) throws Exception, SQLException{
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String addPlaceDetail, findEventID;
		findEventID = "select * from eventmanagement.event where eventName = " +  "'" + EventEntry.getEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		ResultSet finEvent = stmt.executeQuery(findEventID);
		System.out.println(finEvent.next());
		int eventID = finEvent.getInt("eventID");
		
		addPlaceDetail = "insert into eventmanagement.place( timeOfOpen,timeOfClose,billPerDay, placeName) values(" 
								+ "'" +place.getTimeOfOpen() + ","
								+ "'" + place.getTimeOfClose() + "',"
								 + place.getBillPerDay()+","
								 + "'" + place.getPlaceName() + "'"
								+ 
								")";
		stmt.execute(addPlaceDetail);
		
	}	

}

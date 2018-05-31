package com.eventManagement.model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.eventManagement.connection.EventManagementConnection;
import com.eventManagement.model.Music.MusicManagement;
import com.eventManagement.view.PrimaryResourceDetailEntryView;
public class StorableGuest {
	public static void addPResource(MusicManagement music) throws Exception, SQLException{
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String findEventID = "select * from eventmanagement.event where eventName = " +  "'" + PrimaryResourceDetailEntryView.getlblEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		ResultSet finEvent = stmt.executeQuery(findEventID);
		int eventID = finEvent.getInt("eventID");
		String addGuestDetail = "insert into eventmanagement.guest( guestName,guestAddr, guestCNo, guestCol) values(" 
				+ music.getPricePerProgram() + ","
				+ "'" + music.getSingersGroupName() + "',"
				+  eventID + 
				")";
}
}

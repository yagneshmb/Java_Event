package com.eventManagement.model.managers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.eventManagement.connection.EventManagementConnection;
import com.eventManagement.view.SubManagerEntryView;


public class StorableManagers {
	public static void addManager(SubManager subManager) throws Exception, SQLException{
		Connection conn = EventManagementConnection.getConnection();
		Statement stmt = conn.createStatement();
		String addSubManagerDetail, findEventID = null;
		findEventID = "select * from eventmanagement.event where eventName = " +  "'" + SubManagerEntryView.getLblRealEventName() + "'";
		//System.out.println(SubManagerEntryView.getLblRealEventName());
		ResultSet finEvent = stmt.executeQuery(findEventID);
		System.out.println(finEvent.next());
		int eventID = finEvent.getInt("eventID");
		addSubManagerDetail = "insert into eventmanagement.submanager(subManagerContactNo, subManagerName, eventID) values(" 
								+ "'" + subManager.getManagerContactNo() + "',"
								+ "'" + subManager.getManagerName() + "',"
								+  eventID + 
								")";
		stmt.execute(addSubManagerDetail);
		
	}

}

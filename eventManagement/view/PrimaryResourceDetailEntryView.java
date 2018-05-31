package com.eventManagement.view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PrimaryResourceDetailEntryView extends JFrame{

	private JTextField txtPackageName;
	private JTextField txtPricePerPackage;
	private JTextField txtMusicalGroup;
	private JTextField txtPriceForMusic;
	private JTextField txtVenueName;
	private JTextField txtOpeningTime;
	private JTextField txtClosingTime;
	private JTextField txtBillPerDay;
	private JLabel lblMusicDetails;
	private JLabel lblMusicalGroup;
	private JLabel lblDecPricePerPackage;
	private JLabel lblPriceForProgram;
	private JLabel lblEventVenueDetails;
	private JLabel lblVenueName;
	private JLabel lblOpeningTime;
	private JLabel lblClosingTime;
	private JLabel lblBillPerDay ;
	private JButton btnDone;
	private JLabel lblEvent;
	private static JLabel lblRealEventName;
	private JLabel lblDecorationDetails; 
	private JLabel lblDecPackagename;
	public void setAllNull(){
		this.txtBillPerDay.setText("");
		this.txtClosingTime.setText("");
		this.txtMusicalGroup.setText("");
		this.txtOpeningTime.setText("");
		this.txtPricePerPackage.setText("");
		this.txtPriceForMusic.setText("");
		this.txtPackageName.setText("");
		this.txtVenueName.setText("");
	}
	public void addPREDoneBehaviour(ActionListener listener){
		this.btnDone.addActionListener(listener);
	}
	public static String getlblEventName(){
		return lblRealEventName.getText();
	}
	
	public String getTxtPackageName() {
		return this.txtPackageName.getText();
	}

	public double getTxtPricePerPackage() {
		return Double.parseDouble(this.txtPricePerPackage.getText());
	}

	public String getTxtMusicalGroup() {
		return this.txtMusicalGroup.getText();
	}

	public double getTxtPriceForMusic() {
		return Double.parseDouble(this.txtPriceForMusic.getText());
	}

	public String getTxtVenueName() {
		return this.txtVenueName.getText();
	}

	public String getTxtOpeningTime() {
		return this.txtOpeningTime.getText();
	}

	public String getTxtClosingTime() {
		return this.txtClosingTime.getText();
	}

	public double getTxtBillPerDay() {
		return Double.parseDouble(this.txtBillPerDay.getText());
	}

	public PrimaryResourceDetailEntryView(int dec, int trans,int place,int invi,int music,int guestall) {
		initialize(dec,trans,place,invi,music,  guestall);
	}

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize(int dec, int trans,int place,int invi,int music,int guestall) {
	
		this.setBounds(100, 100, 522, 386);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		if(dec==1){
			lblDecorationDetails = new JLabel("Decoration Details");
			lblDecorationDetails.setBounds(43, 33, 104, 14);
			this.getContentPane().add(lblDecorationDetails);
			
			lblDecPackagename = new JLabel("PackageName");
			lblDecPackagename.setBounds(10, 58, 86, 14);
			this.getContentPane().add(lblDecPackagename);
			
			txtPackageName = new JTextField();
			txtPackageName.setBounds(106, 55, 86, 20);
			this.getContentPane().add(txtPackageName);
			txtPackageName.setColumns(10);
			
			lblDecPricePerPackage = new JLabel("Price Per Package");
			lblDecPricePerPackage.setBounds(10, 89, 86, 14);
			this.getContentPane().add(lblDecPricePerPackage);
			
			txtPricePerPackage = new JTextField();
			txtPricePerPackage.setColumns(10);
			txtPricePerPackage.setBounds(106, 86, 86, 20);
			this.getContentPane().add(txtPricePerPackage);
			
			
			
		}
		if(place==1){

			lblEventVenueDetails = new JLabel("Event Venue Details");
			lblEventVenueDetails.setBounds(278, 33, 123, 14);
			this.getContentPane().add(lblEventVenueDetails);
			
			lblVenueName = new JLabel("Venue Name");
			lblVenueName.setBounds(227, 72, 66, 14);
			this.getContentPane().add(lblVenueName);
			
			txtVenueName = new JTextField();
			txtVenueName.setBounds(315, 69, 86, 20);
			this.getContentPane().add(txtVenueName);
			txtVenueName.setColumns(10);
			
			lblOpeningTime = new JLabel("Opening Time");
			lblOpeningTime.setBounds(227, 101, 71, 14);
			this.getContentPane().add(lblOpeningTime);
			
			txtOpeningTime = new JTextField();
			txtOpeningTime.setBounds(315, 98, 86, 20);
			this.getContentPane().add(txtOpeningTime);
			txtOpeningTime.setColumns(10);
			
			lblClosingTime = new JLabel("Closing Time");
			lblClosingTime.setBounds(227, 126, 66, 14);
			this.getContentPane().add(lblClosingTime);
			
			txtClosingTime = new JTextField();
			txtClosingTime.setBounds(315, 123, 86, 20);
			this.getContentPane().add(txtClosingTime);
			txtClosingTime.setColumns(10);
			
			lblBillPerDay = new JLabel("Bill Per Day");
			lblBillPerDay.setBounds(239, 151, 66, 14);
			this.getContentPane().add(lblBillPerDay);
			
			txtBillPerDay = new JTextField();
			txtBillPerDay.setBounds(315, 148, 86, 20);
			this.getContentPane().add(txtBillPerDay);
			txtBillPerDay.setColumns(10);
			
		
			
			
		}
		if(music==1){
			
			lblMusicDetails = new JLabel("Music Details");
			lblMusicDetails.setBounds(60, 126, 66, 14);
			this.getContentPane().add(lblMusicDetails);
			
			lblMusicalGroup = new JLabel("Musical Group:");
			lblMusicalGroup.setBounds(10, 151, 86, 14);
			this.getContentPane().add(lblMusicalGroup);
			
			txtMusicalGroup = new JTextField();
			txtMusicalGroup.setBounds(117, 148, 86, 20);
			this.getContentPane().add(txtMusicalGroup);
			txtMusicalGroup.setColumns(10);
			
			lblPriceForProgram = new JLabel("Price for Program:");
			lblPriceForProgram.setBounds(10, 182, 104, 14);
			this.getContentPane().add(lblPriceForProgram);
			
			txtPriceForMusic = new JTextField();
			txtPriceForMusic.setBounds(117, 179, 86, 20);
			this.getContentPane().add(txtPriceForMusic);
			txtPriceForMusic.setColumns(10);
			
		
			
		}
		if(dec==1||place==1||music==1){
			btnDone = new JButton("Done");
			btnDone.setBounds(202, 210, 89, 23);
			this.getContentPane().add(btnDone);
			lblEvent = new JLabel("Event :");
			lblEvent.setBounds(60, 11, 46, 14);
			getContentPane().add(lblEvent);
			
			lblRealEventName = new JLabel();
			lblRealEventName.setBounds(106, 11, 46, 14);
			getContentPane().add(lblRealEventName);
			
		}
		
		
		
		
		
		
	}
}

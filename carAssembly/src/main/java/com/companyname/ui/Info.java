package com.companyname.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Info {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info window = new Info();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Info() {
		initialize();
		System.out.println( "Hello Words!" );
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println( "Hello Wordws!" );
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Jenkins Maven GitHub Eclipse");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		lblNewLabel.setBounds(60, 21, 414, 90);
		frame.getContentPane().add(lblNewLabel);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String s=dateFormat.format(date);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.PINK);
		textField_1.setColumns(10);
		textField_1.setBounds(330, 11, 172, 20);
		frame.getContentPane().add(textField_1);
		Calendar cal = Calendar.getInstance();
		String currentTime = cal.getTime().toString();
		textField_1.setText(currentTime);
		
		JLabel lblComputername = new JLabel("ComputerName");
		lblComputername.setBounds(60, 121, 90, 14);
		frame.getContentPane().add(lblComputername);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(324, 122, 115, 20);
		frame.getContentPane().add(textField_2);
		frame.setVisible(true);
		
		String hostname = "Unknown";

		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		    textField_2.setText(hostname);
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
	}
}

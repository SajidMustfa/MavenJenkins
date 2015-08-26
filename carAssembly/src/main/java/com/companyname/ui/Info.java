package com.companyname.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class Info {

	private JFrame frame;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Jenkins Maven GitHub Eclipse");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 82, 414, 90);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}

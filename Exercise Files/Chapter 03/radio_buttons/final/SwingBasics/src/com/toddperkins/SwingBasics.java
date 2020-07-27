package com.toddperkins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class SwingBasics {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingBasics window = new SwingBasics();
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
	public SwingBasics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnItem = new JRadioButton("Item 1");
		buttonGroup.add(rdbtnItem);
		rdbtnItem.setBounds(13, 15, 141, 23);
		frame.getContentPane().add(rdbtnItem);
		
		JRadioButton rdbtnItem_1 = new JRadioButton("Item 2");
		buttonGroup.add(rdbtnItem_1);
		rdbtnItem_1.setBounds(13, 45, 141, 23);
		frame.getContentPane().add(rdbtnItem_1);
		
		JRadioButton rdbtnItem_2 = new JRadioButton("Item 3");
		buttonGroup.add(rdbtnItem_2);
		rdbtnItem_2.setBounds(13, 80, 141, 23);
		frame.getContentPane().add(rdbtnItem_2);
	}

}

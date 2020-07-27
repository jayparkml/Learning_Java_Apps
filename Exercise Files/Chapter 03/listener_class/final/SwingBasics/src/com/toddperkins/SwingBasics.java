package com.toddperkins;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class SwingBasics {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel label = new JLabel("");

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
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn = (JRadioButton)e.getSource();
			label.setText(btn.getText());
		}
		
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
		
		RadioListener listener = new RadioListener();
		
		JRadioButton item1 = new JRadioButton("Item 1");
		buttonGroup.add(item1);
		item1.setBounds(13, 15, 141, 23);
		frame.getContentPane().add(item1);
		item1.addActionListener(listener);
		
		JRadioButton item2 = new JRadioButton("Item 2");
		buttonGroup.add(item2);
		item2.setBounds(13, 45, 141, 23);
		frame.getContentPane().add(item2);
		item2.addActionListener(listener);
		
		JRadioButton item3 = new JRadioButton("Item 3");
		buttonGroup.add(item3);
		item3.setBounds(13, 80, 141, 23);
		frame.getContentPane().add(item3);
		item3.addActionListener(listener);
		
		
		label.setBounds(19, 125, 153, 16);
		frame.getContentPane().add(label);
	}

}

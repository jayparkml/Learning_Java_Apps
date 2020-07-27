package com.toddperkins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingBasics {

	private JFrame frame;

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
		
		JLabel label = new JLabel("Off");
		label.setBounds(22, 46, 61, 16);
		frame.getContentPane().add(label);
		
		JCheckBox checkbox = new JCheckBox("Toggle On/Off");
		checkbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (checkbox.isSelected()) ? "On" : "Off";
				label.setText(text);
			}
		});
		checkbox.setBounds(12, 11, 128, 23);
		frame.getContentPane().add(checkbox);
		
		
	}
}

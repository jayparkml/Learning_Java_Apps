package com.toddperkins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
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
		
		JLabel label = new JLabel("New label");
		label.setBounds(18, 62, 61, 16);
		frame.getContentPane().add(label);
		
		JButton btnCreateLabel = new JButton("Delete Label");
		btnCreateLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.revalidate();
				frame.repaint();
				frame.getContentPane().remove(label);
				
			}
		});
		btnCreateLabel.setBounds(18, 11, 117, 29);
		frame.getContentPane().add(btnCreateLabel);
		
		
	}
}

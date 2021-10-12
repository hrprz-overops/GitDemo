package com.ExceptionOptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExceptionGUI implements ActionListener {

	// Build your window frame
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	
	private static JPanel panel;
	
	private static JLabel success;
	
	public static void windowFrame() {
		
		JFrame frame = new JFrame();
		frame.setSize(350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
		panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		createButtons();
		
		frame.setVisible(true);
		
	}
	
	// Throw exceptions
	@Override
	public void actionPerformed(ActionEvent e) {

		
		String button = e.getActionCommand();
		
		panel.validate();

		if(button.contains("Arithmetic")) { ThrowExceptions.ArithmeticEx(success); }
		else if(button.contains("NullPointer")) { ThrowExceptions.NullPointerEx(success); }  // throw new NullPointerException("NullPointerException was called!"); }
		else if(button.contains("IndexOutOfBounds")) { ThrowExceptions.IndexOutOfBoundsEx(success);	}
		else if(button.contains("NumberFormat")) { ThrowExceptions.NumberFormatEx(success);	}
		
	}
	
	// Lots of buttons
	private static void createButtons() {
		
		button1 = new JButton("ArithmeticException");
		button1.setBounds(70, 20, 200, 25);
		button1.addActionListener(new ExceptionGUI());
		panel.add(button1);

		button2 = new JButton("NullPointerException");
		button2.setBounds(70, 50, 200, 25);
		button2.addActionListener(new ExceptionGUI());
		panel.add(button2);
		
		button3 = new JButton("IndexOutOfBoundsException");
		button3.setBounds(70, 80, 200, 25);
		button3.addActionListener(new ExceptionGUI());
		panel.add(button3);
		
		button4 = new JButton("NumberFormatException");
		button4.setBounds(70, 110, 200, 25);
		button4.addActionListener(new ExceptionGUI());
		panel.add(button4);
		
		success = new JLabel("", JLabel.CENTER);
		success.setBounds(10, 150, 300, 25);
		panel.add(success);
	}

}

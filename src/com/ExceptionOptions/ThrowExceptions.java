package com.ExceptionOptions;

import javax.swing.JLabel;

public class ThrowExceptions {
	
	public static void ArithmeticEx(JLabel printMsg) {
		try {
			int a = 30, b = 0;
			
			// Divide by zero
			int c = a/b;
			
			System.out.println("Result = " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide a number by 0");
			printMsg.setText("ArithmeticException was thrown!");
		}
	}
	
	public static void NullPointerEx(JLabel printMsg) {
		try {
			int a[] = null;
			
			System.out.println("Array a location 0 = " + a[0]);
		}
		catch(NullPointerException e) {
			System.out.println("Cannot reference an array pointing to null");
			printMsg.setText("NullPointerException was thrown!");
		}
	}
	
	public static void IndexOutOfBoundsEx(JLabel printMsg) {
		try {
			String phrase = "This is a test!";
			
			char c = phrase.charAt(20);
			
			System.out.println("Result = " + c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot reference an index of an array that is out of bounds");
			printMsg.setText("ArrayIndexOutOfBoundsException was thrown!");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Cannot reference a character that is out of bounds");
			printMsg.setText("StringIndexOutOfBoundsException was thrown!");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Cannot reference an index that is out of bounds");
			printMsg.setText("IndexOutOfBoundsException was thrown!");
		}
	}
	
	public static void NumberFormatEx(JLabel printMsg) {
		try {
			int num = Integer.parseInt("akki");
			
			System.out.println("Result = " + num);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot enter String into an int variable");
			printMsg.setText("NumberFormatException was thrown!");
		}
	}

}

package com.mac.customExceptions;

import java.io.IOException;

public class Revision {
	public void print() throws UserNotFoundException  {
		System.out.println("Starting to print..");
		for (int i = 0; i < 5; i++) {
			if (i==3) {
				throw new UserNotFoundException();
			}
				
			System.out.println(i);
		}
	}
	
	public void nestedTryDemo() {
		int x = 1;
		try {
			System.out.println("in 1st try");
			try {
				System.out.println("in 2nd try");
			}catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			new Revision().print();
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			int res = 1/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

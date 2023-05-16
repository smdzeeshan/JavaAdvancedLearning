package com.mac.customExceptions;

public class FinallyDemo {
	public static void main(String[] args) {

		try {
			int res = 2 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " Calling system.exit()");
			System.exit(0);

		} finally {
			System.out.println("In finally block");
		}
	}
}

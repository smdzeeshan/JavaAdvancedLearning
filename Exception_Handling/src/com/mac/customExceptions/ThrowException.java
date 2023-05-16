package com.mac.customExceptions;

public class ThrowException {
	public static void main(String[] args) {
		try {
			fun();
		} catch (NullPointerException e) {
			System.out.println("Catching NullPointerException in main() method..");
		}
	}

	private static void fun() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Catching NullPointerException in fun() method... ");
			throw e;
		}
	}
}

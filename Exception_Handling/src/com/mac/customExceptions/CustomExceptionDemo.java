package com.mac.customExceptions;

import java.util.Scanner;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		int age = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter age : ");

			try {
				age = sc.nextInt();
			}

			catch (Exception e) {
				Scanner sc2 = new Scanner(System.in);
				System.out.print("Enter age : ");

			}

			try {
				ageValidator(age);
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	private static void ageValidator(int age) throws NullPointerException {

		if (age < 10) {
			throw new NullPointerException("Under age..");
		} else
			System.out.println("Good age..");
	}
}
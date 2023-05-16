package com.mac.customExceptions;

public class Throwable {
	public static void main(String[] args) {
		try {
			test(5, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {

		}

	}

	private static void test(int i, int j) {
		System.out.println(i / j);

	}
}

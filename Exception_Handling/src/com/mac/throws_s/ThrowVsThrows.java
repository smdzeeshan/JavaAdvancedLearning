package com.mac.throws_s;

public class ThrowVsThrows {
	public static void main(String[] args) {

		test();

	}

	private static void test() {

		/*
		 * try { System.out.println("Test is running.. "); int res = 5 / 0; } catch
		 * (Exception e) { System.out.println("Exception was caught = " + e); }
		 */

		int res = 5 / 1;
		throw new NullPointerException(" throwing new NullPointerException " + res);
	}
}

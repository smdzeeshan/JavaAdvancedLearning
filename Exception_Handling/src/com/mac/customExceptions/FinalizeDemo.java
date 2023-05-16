package com.mac.customExceptions;

public class FinalizeDemo {
	public static void main(String[] args) {

		FinalizeDemo finalizeDemo = new FinalizeDemo();
		System.out.println(finalizeDemo.hashCode());

		finalizeDemo = null;
		System.gc();

	}

	@Override
	protected void finalize() {
		System.out.println("I am finalizing..");
	}
}

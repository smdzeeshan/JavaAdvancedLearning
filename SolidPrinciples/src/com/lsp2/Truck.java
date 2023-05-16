package com.lsp2;

public class Truck extends Vehicle {

	public Truck(String color, String engine) {
		super("Orange", "Truck Engine");

	}

	@Override
	public void running() {
		System.out.println("my truck is running..");
	}

}

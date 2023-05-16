package com.lsp2;

public class Car extends Vehicle {

	public Car(String color, String engine) {
		super("white", "Car Engine");
	}

	@Override
	public void running() {
		System.out.println("my car is running..");
	}
}

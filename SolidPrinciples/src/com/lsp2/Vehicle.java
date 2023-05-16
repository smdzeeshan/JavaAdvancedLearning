package com.lsp2;

public class Vehicle {
	private String color;
	private String engine;

	public Vehicle(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}

	public void running() {
		System.out.println("my vehicle is running..");
	}
}

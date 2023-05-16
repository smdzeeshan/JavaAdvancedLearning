package com.lsp2;

public class ClientModule {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("white", "petrol");
		Garage garage = new Garage();
		garage.fix(vehicle);
	}
}

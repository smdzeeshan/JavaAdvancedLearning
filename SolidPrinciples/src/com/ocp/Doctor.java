package com.ocp;

public class Doctor extends Employee {

	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}

	private void prescribeMedicine() {
		System.out.println("Prescribe Medicine");
	}

	private void diagnosePatient() {
		System.out.println("Diagonising Patient");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatient();
	}
}

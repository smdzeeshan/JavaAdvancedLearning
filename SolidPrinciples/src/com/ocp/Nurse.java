package com.ocp;

public class Nurse extends Employee {

	public Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in action..");
	}

	private void checkVitalSigns() {
		System.out.println("Checking vital signs");
	}

	private void drawBlood() {
		System.out.println("Drawing blood");
	}

	private void cleanPatientArea() {
		System.out.println("Cleaning patient area");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();

	}

}

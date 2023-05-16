package com.ocp;

public class EmergencyRoomProcess {
	public static void main(String[] args) {

		HospitalManagement ERDirector = new HospitalManagement();
		Employee peggy = new Nurse(1, "Peggy", "emergency", true);

		ERDirector.callUpon(peggy);

		Employee susan = new Doctor(2, "Susan", "emergency", true);
		ERDirector.callUpon(susan);

	}
}

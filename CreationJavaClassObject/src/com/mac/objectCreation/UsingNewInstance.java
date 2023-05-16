package com.mac.objectCreation;

public class UsingNewInstance {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class cls = Class.forName("UsingNewInstance");
		UsingNewInstance usingNewInstance = (UsingNewInstance) cls.newInstance();
		System.out.println(usingNewInstance);
	}

}

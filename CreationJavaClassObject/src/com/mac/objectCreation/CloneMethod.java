package com.mac.objectCreation;

public class CloneMethod implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {

		CloneMethod method = new CloneMethod();
		System.out.println(method);
		System.out.println(method.clone());
	}
}
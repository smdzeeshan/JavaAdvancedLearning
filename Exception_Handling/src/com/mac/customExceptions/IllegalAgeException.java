package com.mac.customExceptions;

public class IllegalAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalAgeException(String message) {
		super(message);
	}
}

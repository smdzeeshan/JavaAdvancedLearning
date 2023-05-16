package com.mac.example1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo implements Serializable {
	public int a;
	public String b;

	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Demo object = new Demo(1, "geeksforgeeks");
		String filename = "file.ser";

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized..	");
		} catch (Exception e) {
			System.out.println("IOException is caught");
		}

		Demo object1 = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object1 = (Demo) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

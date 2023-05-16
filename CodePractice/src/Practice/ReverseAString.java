package Practice;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word to reverse");
		String name = scanner.nextLine();
		char[] nameArr = name.toCharArray();
		
		for (int i = nameArr.length-1; i >= 0; i--) {
			System.out.print(nameArr[i]);
			Thread.sleep(1000);
		}
		scanner.close();
		
	}
}

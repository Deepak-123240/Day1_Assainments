package Conditions;

import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);

		if (Character.isLetter(ch)) {
			ch = Character.toLowerCase(ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("'" + ch + "' is a vowel");
			} else {
				System.out.println("'" + ch + "' is a consonant");
			}
		} 
		else if (Character.isDigit(ch)) {
			System.out.println("'" + ch + "' is a digit");
		} 
		else {
			System.out.println("'" + ch + "' is a special character");
		}

		scanner.close();
	}

}



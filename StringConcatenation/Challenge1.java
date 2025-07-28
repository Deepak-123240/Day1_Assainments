package StringConcatenation;

import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your Last Name: ");
		String lastName = sc.nextLine();
		
		String concatinatedName = firstName + lastName;
		System.out.println("Hello :"+concatinatedName+" ! Welcome to the System");
		
	}

}

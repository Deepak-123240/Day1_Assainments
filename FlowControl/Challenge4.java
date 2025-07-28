package FlowControl;

import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// If-else ladder to categorize age groups
		if (age < 0) {
			System.out.println("Invalid age!");
		} else if (age <= 12) {
			System.out.println("Child");
		} else if (age <= 19) {
			System.out.println("Teenager");
		} else if (age <= 35) {
			System.out.println("Young Adult");
		} else if (age <= 55) {
			System.out.println("Middle-aged Adult");
		} else {
			System.out.println("Senior Citizen");
		}

		scanner.close();
	}

}


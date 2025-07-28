package FlowControl;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student's percentage (0-100): ");
		double percentage = scanner.nextDouble();

		// Validate input
		if (percentage < 0 || percentage > 100) {
			System.out.println("Invalid percentage! Please enter between 0 and 100.");
		} else {
			// Determine grade using if-else ladder
			char grade;

			if (percentage >= 90) {
				grade = 'A';
			} else if (percentage >= 80) {
				grade = 'B';
			} else if (percentage >= 70) {
				grade = 'C';
			} else if (percentage >= 60) {
				grade = 'D';
			} else if (percentage >= 40) {
				grade = 'E';
			} else {
				grade = 'F';
			}

			System.out.println("Grade: " + grade);
		}

		scanner.close();

	}

}


package Conditions;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// Voting eligibility (18+)
		boolean canVote = age >= 18;

		// Driving eligibility (16+ for learner's permit, 18+ for full license)
		String drivingStatus;
		if (age >= 18) {
			drivingStatus = "full driver's license";
		} else if (age >= 16) {
			drivingStatus = "learner's permit";
		} else {
			drivingStatus = "not eligible to drive";
		}

		// Job eligibility (14+ with restrictions, 18+ for full-time work)
		String jobStatus;
		if (age >= 18) {
			jobStatus = "eligible for full-time work";
		} else if (age >= 16) {
			jobStatus = "eligible for part-time work with restrictions";
		} else if (age >= 14) {
			jobStatus = "eligible for limited work with strict restrictions";
		} else {
			jobStatus = "not eligible for employment";
		}

		System.out.println("\nEligibility Results:");
		System.out.println("Voting: " + (canVote ? "Eligible" : "Not eligible"));
		System.out.println("Driving: " + drivingStatus);
		System.out.println("Employment: " + jobStatus);

		scanner.close();
	}

}



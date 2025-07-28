package Conditions;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter three angles of the triangle:");
		System.out.print("Angle 1: ");
		int angle1 = scanner.nextInt();

		System.out.print("Angle 2: ");
		int angle2 = scanner.nextInt();

		System.out.print("Angle 3: ");
		int angle3 = scanner.nextInt();

		// Check if all angles are positive and sum to 180
		if (angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1 + angle2 + angle3 == 180) {
			System.out.println("Valid triangle!");
		} else {
			System.out.println("Invalid triangle angles");
		}

		scanner.close();
	}

}



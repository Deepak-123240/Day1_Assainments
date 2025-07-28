package DateTimeAndObject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your birth date (YYYY-MM-DD):");
		String birthDateInput = scanner.nextLine();

		LocalDate birthDate = LocalDate.parse(birthDateInput);
		LocalDate currentDate = LocalDate.now();

		Period age = Period.between(birthDate, currentDate);

		System.out.printf("You are %d years, %d months, and %d days old%n",
				age.getYears(), age.getMonths(), age.getDays());

		scanner.close();
	}

}



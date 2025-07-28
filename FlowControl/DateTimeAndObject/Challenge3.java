package DateTimeAndObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Challenge3 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String formattedDate = currentDate.format(formatter);

		System.out.println("Current date (dd-MM-yyyy): " + formattedDate);
	}

}



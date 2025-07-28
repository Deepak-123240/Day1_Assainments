package DateTimeAndObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Challenge4 {
	public static void main(String[] args) {
		LocalDate date =  LocalDate.now();
		
		LocalDate futureDate = date.plusDays(5);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.println("Current Date: "+date.format(formatter));
		System.out.println("Date after adding 5 Days: "+futureDate.format(formatter));
	}

}



package Conditions;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = false;
        
        // Leap year logic
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        
        System.out.println(year + (isLeapYear ? " is" : " is not") + " a leap year");
        scanner.close();
	}

}



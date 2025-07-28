package Switch;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName = switch (dayNumber) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day number";
        };

        System.out.println("Day of week: " + dayName);
        scanner.close();
	}

}

package ENUM;

enum Day2 {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class Challenge3 {
	public static void main(String[] args) {
		System.out.println("Days of the Week:");

        // Iterate using for-each loop
        for (Day2 day : Day2.values()) {
            System.out.println(day);
        }
	}

}



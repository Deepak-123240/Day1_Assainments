package ENUM;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY
}
    
public class Challenge1 {
	public static void main(String[] args) {
		Day today = Day.SUNDAY;
        System.out.println("Today is: " + today);

        // Loop through all days
        for (Day d : Day.values()) {
            System.out.println(d);
        }
	}



}

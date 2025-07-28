package ENUM;

enum Day1 {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class Challenge2 {
	
	public static void main(String[] args) {
		Day1 today = Day1.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Midweek days.");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend! Time to relax.");
                break;
            default:
                System.out.println("Invalid day.");
        }
	}

}
	

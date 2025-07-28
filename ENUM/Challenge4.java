package ENUM;

enum Day4 {
    SUNDAY(true),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true);
	 private final boolean isWeekend;

	    // Constructor
	    Day4(boolean isWeekend) {
	        this.isWeekend = isWeekend;
	    }

	    // Getter
	    public boolean isWeekend() {
	        return isWeekend;
	    }
	}

public class Challenge4 {
	public static void main(String[] args) {
		for (Day4 day : Day4.values()) {
            System.out.println(day + " is weekend? " + day.isWeekend());
        }
	}


	
}
	



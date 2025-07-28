package DateTimeAndObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Challenge1 {

	public static void main(String[] args) {
		// Get current date and time
        LocalDateTime time = LocalDateTime.now();
        
        // Print in default format
        System.out.println("Current Date & Time (default): " + time);
        
        // Format the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
        String formattedDateTime = time.format(formatter);
        System.out.println("Current Date & Time (formatted): " + formattedDateTime);
	}


}

package StringConcatenation;

public class Challenge3 {
	public static void main(String[] args) {
		int rows = 5;  // Number of rows in the pattern
        String pattern = " ";
        
        for (int i = 1; i <= rows; i++) {
            // Add spaces
            for (int j = 1; j <= rows - i; j++) {
                pattern += " ";
            }
            
            // Add stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                pattern += "*";
            }
            
            // New line
            pattern += "\n";
        }
        
        System.out.println("Pyramid Pattern:\n" + pattern);
	}

}

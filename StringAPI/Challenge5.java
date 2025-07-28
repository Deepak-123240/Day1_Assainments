package StringAPI;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println("Original string: " + input);
        System.out.println("Cleaned string: " + cleaned);
        
        scanner.close();
	}

}

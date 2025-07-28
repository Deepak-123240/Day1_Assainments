package FlowControl;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "password123";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Nested if validation
        if (username.equals(CORRECT_USERNAME)) {
            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password!");
            }
        } else {
            System.out.println("Invalid username!");
        }
        
        scanner.close();
	}

}


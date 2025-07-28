package Switch;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. View Profile");
            System.out.println("2. Edit Settings");
            System.out.println("3. Check Notifications");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\nDisplaying Profile...");
                    // Add profile viewing logic here
                    break;
                    
                case 2:
                    System.out.println("\nOpening Settings...");
                    // Add settings logic here
                    break;
                    
                case 3:
                    System.out.println("\nYou have 3 new notifications");
                    // Add notifications logic here
                    break;
                    
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1-4");
            }
        } while (choice != 4);
        
        scanner.close();
	}

}

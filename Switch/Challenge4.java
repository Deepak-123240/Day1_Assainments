package Switch;

import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Food Menu:");
		        System.out.println("1. Pizza");
		        System.out.println("2. Burger");
		        System.out.println("3. Pasta");
		        System.out.println("4. Salad");
		        System.out.print("Enter your choice (1-4): ");
		        
		        int choice = scanner.nextInt();
		        
		        // Enhanced switch expression (Java 14+)
		        String message = switch (choice) {
		            case 1 -> {
		                System.out.println("Adding pizza to cart...");
		                yield "You ordered: Pizza ($8.99)";  // yield returns a value
		            }
		            case 2 -> "You ordered: Burger ($6.99)";
		            case 3 -> "You ordered: Pasta ($7.49)";
		            case 4 -> "You ordered: Salad ($5.99)";
		            default -> "Invalid choice! Please select 1-4";
		        };
		        
		        System.out.println(message);
		        scanner.close();
			}

}

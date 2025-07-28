package LoopAndBranching;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("----------------------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d × %d = %d\n", number, i, number * i);
        }
        
        scanner.close();
	}

}

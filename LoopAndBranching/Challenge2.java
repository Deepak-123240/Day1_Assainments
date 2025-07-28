package LoopAndBranching;

public class Challenge2 {
	public static void main(String[] args) {
		System.out.println("Finding first multiple of 7 between 1-50:");

		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				System.out.println("Found: " + i);
				break; // Exit loop immediately
			}
			System.out.println("Checking " + i);
		}



		System.out.println("\nPrinting odd numbers 1-20 (skip evens):");

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				continue; // Skip even numbers
			}
			 System.out.print(i + " ");
		}
	}

}

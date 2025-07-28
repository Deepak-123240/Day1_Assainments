package Operations;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first age: ");
		int age1 = scanner.nextInt();

		System.out.print("Enter second age: ");
		int age2 = scanner.nextInt();
		
		System.out.println("\nComparison Results:");
        System.out.println(age1 + " == " + age2 + ": " + (age1 == age2));
        System.out.println(age1 + " != " + age2 + ": " + (age1 != age2));
        System.out.println(age1 + " > " + age2 + ": " + (age1 > age2));
        System.out.println(age1 + " < " + age2 + ": " + (age1 < age2));
        System.out.println(age1 + " >= " + age2 + ": " + (age1 >= age2));
        System.out.println(age1 + " <= " + age2 + ": " + (age1 <= age2));
        
        scanner.close();
	}

}


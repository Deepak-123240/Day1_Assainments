package StringAPI;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        
        int vowelCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
        
        String text = "Hello World";
        long count = text.toLowerCase().chars()
                      .filter(c -> "aeiou".indexOf(c) != -1)
                      .count();
        System.out.println("Vowel count: " + (count));
	}

}

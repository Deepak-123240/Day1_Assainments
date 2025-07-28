package StringConcatenation;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your hobby: ");
        String hobby = sc.nextLine();
        System.out.println("I love " + hobby + "!\n" + 
                         "That's " + hobby.length() + " letters of fun!");
        sc.close();
	}

}

package LoopAndBranching;

public class Challenge5 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}

		System.out.println("Sum of even numbers (1-100): " + sum);
	}

}

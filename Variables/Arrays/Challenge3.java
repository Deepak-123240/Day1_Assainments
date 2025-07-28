package Arrays;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int n = sc.nextInt();

		System.out.println("Enter an Array Elements: ");
		double[] arr = new double[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextDouble();
		}
		
		double sum = 0;
		for(double s : arr) {
			sum += s;
		}
		double average = sum/arr.length;
        System.out.printf("Average: %.2f", average);
	}

}



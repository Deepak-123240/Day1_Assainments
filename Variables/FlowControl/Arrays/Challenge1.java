package Arrays;

import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter an Array Elements: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) min=arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println("Smallest Element is: "+min);
		System.out.println("Largest Element is: "+max);

	}

}

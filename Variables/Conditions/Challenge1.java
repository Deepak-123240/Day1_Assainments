package Conditions;

import java.util.Arrays;
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
		
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
        System.out.println("Reversed array: " + Arrays.toString(arr));

        //OR
        System.out.println("Reversed array: " );
        for(int x:arr) {
        	System.out.print(x+" ");
        }
	}

}



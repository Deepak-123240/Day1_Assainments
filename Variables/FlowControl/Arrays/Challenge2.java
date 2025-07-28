package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int n = sc.nextInt();

		System.out.println("Enter an Array Elements: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}

		//using inbuilt 
		Arrays.sort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));
		
		// Manual bubble sort (alternative)
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The Sorted elements: ");
        for(int a: arr) {
        	System.out.print(a+" ");
        }
	}

}



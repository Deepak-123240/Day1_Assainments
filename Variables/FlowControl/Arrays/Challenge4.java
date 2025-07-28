package Arrays;

import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int n = sc.nextInt();

		System.out.println("Enter an Array Elements: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}

		int target = 2;
        int count = 0;
        
        for (int num : arr) {
            if (num == target) count++;
        }
        
        System.out.println(target + " appears " + count + " times");
	}

}



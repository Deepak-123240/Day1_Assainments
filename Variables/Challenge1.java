package Variables;

public class Challenge1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		System.out.println("Before Swapping:  ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int temp = a;
		a = b;
		b= temp;
		
		System.out.println("\nAfter Swapping:  ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}

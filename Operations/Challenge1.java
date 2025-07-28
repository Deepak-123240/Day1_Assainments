package Operations;

public class Challenge1 {

	public static void main(String[] args) {
		int a = 15;
        int b = 4;
        
        // Addition
        System.out.println(a + " + " + b + " = " + (a + b));
        
        // Subtraction
        System.out.println(a + " - " + b + " = " + (a - b));
        
        // Multiplication
        System.out.println(a + " * " + b + " = " + (a * b));
        
        // Division (integer division)
        System.out.println(a + " / " + b + " = " + (a / b));
        
        // Modulus (remainder)
        System.out.println(a + " % " + b + " = " + (a % b));
        
        // Increment (post-increment)
        System.out.println("a++ = " + (a++) + " (now a = " + a + ")");
        
        // Decrement (pre-decrement)
        System.out.println("--b = " + (--b) + " (now b = " + b + ")");
	}

}

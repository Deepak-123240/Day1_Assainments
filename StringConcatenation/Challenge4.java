package StringConcatenation;

public class Challenge4 {
	public static void main(String[] args) {
		int a = 5;
        int b = 10;
        String text = "Result: ";
        
        // Case 1: Concatenation before addition
        String result1 = text + a + b;
        System.out.println("text + a + b = " + result1);
        
        // Case 2: Addition before concatenation
        String result2 = text + (a + b);
        System.out.println("text + (a + b) = " + result2);
        
        // Case 3: Mixed operations
        String result3 = a + b + text + a + b;
        System.out.println("a + b + text + a + b = " + result3);
	}

}

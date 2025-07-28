package StringAPI;

public class Challenge1 {

	public static void main(String[] args) {
		String text = "Hello, World!";
		
		char firstChar = text.charAt(0);
        char seventhChar = text.charAt(7);
        System.out.println("First character: " + firstChar);
        System.out.println("Seventh character: " + seventhChar);
        
        int length = text.length();
        System.out.println("String length: " + length);
        
        String firstWord = text.substring(0, 5);  // "Hello"
        String secondWord = text.substring(7);    // "World!"
        System.out.println("First word: " + firstWord);
        System.out.println("Second word: " + secondWord);
        
        System.out.println("\nPrinting each character:");
        for (int i = 0; i < text.length(); i++) {
            System.out.println("Character " + i + ": " + text.charAt(i));
        }
	}

}

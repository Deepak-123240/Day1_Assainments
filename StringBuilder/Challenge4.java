package StringBuilder;

public class Challenge4 {
	public static void main(String[] args) {
		 String sentence = "I programming every day";
	        int insertPosition = 2; 
	        String wordToInsert = "love";
	        
	        // Using StringBuilder to insert the word
	        StringBuilder sb = new StringBuilder(sentence);
	        sb.insert(insertPosition, wordToInsert + " ");
	        
	        System.out.println("Original: " + sentence);
	        System.out.println("Modified: " + sb.toString());
	}


}

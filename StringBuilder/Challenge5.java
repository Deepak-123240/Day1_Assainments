package StringBuilder;

public class Challenge5 {
	public static void main(String[] args) {
		String original = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original: " + original);
        
        StringBuilder sb = new StringBuilder(original);

//        sb.deleteCharAt(4);
//        System.out.println("After deleting character at 4: " + sb);
       
        sb.delete(10, 15);  // "brown" (positions 10-14)
        System.out.println("After deleting 'brown': " + sb);
        
        sb.delete(0, 4);
        System.out.println("After deleting first word: " + sb);
	}

}

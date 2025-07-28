package StringBuilder;

public class Challenge3 {
	public static void main(String[] args) {
		String original = "apple orange banana";
        System.out.println("Original: " + original);
        
        StringBuilder sb = new StringBuilder(original);
        
        sb.setCharAt(0, 'A');
        sb.setCharAt(6, 'O');
        sb.setCharAt(13, 'B');
        
//        int start = original.indexOf("orange");
//        int end = start + "orange".length();
//        sb.replace(start, end, "ORANGE");
        
        System.out.println("Modified: " + sb);
	}

}

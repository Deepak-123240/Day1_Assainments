package StringAPI;

public class Challenge3 {
	public static void main(String[] args) {
		String str = "MALAYALAM";
		
		
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();		
		if(str.equals(reversed)) {
			System.out.println(str+" is Pallindrome");
		}
		else {
			System.out.println(str+" is Not a Pallindrome");
		}
		
	}

}

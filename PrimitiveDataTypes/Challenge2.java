package PrimitiveDataTypes;

public class Challenge2 {
	public static void main(String[] args) {
		byte a = 120;
		byte b = 8;
		
		int sum = a+b;
		
		if(sum > Byte.MAX_VALUE || sum < Byte.MIN_VALUE) {
			System.out.println("OverFlow Occured");
			System.out.println(a + " + " + b + " = "+ sum+" limit exceeded");
		} else {
			System.out.println("No overflow occured: "+ a + " + " + b + " = "+ (byte)sum);
		}
	}

}

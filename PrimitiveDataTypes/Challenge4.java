package PrimitiveDataTypes;

public class Challenge4 {
public static void main(String[] args) {
		
//		int a = 0b1100;    
//      byte b = 0b1010;  
		//OR
		int a = 12;
		int b = 10;
        
        System.out.println("AND: " + (a & b));  // 8 (1000)
        System.out.println("OR:  " + (a | b));  // 14 (1110)
        System.out.println("XOR: " + (a ^ b)); // 6 (0110)
	}

}

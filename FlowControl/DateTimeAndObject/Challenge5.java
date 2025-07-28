package DateTimeAndObject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Challenge5 {
	public static void main(String[] args) {
		 double number = 123.456789;
	        
		 //without using BigDecimal
		 System.out.printf("The 2 digit Round up value of "+number+ " is : %.2f \n",number);
		 
		 // Using Bigdecimal
	        BigDecimal bd = new BigDecimal(number)
	                          .setScale(2, RoundingMode.HALF_UP);
	        
	        System.out.println("Original number: " + number);
	        System.out.println("Rounded number: " + bd);
	}

}



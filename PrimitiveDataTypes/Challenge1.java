package PrimitiveDataTypes;

public class Challenge1 {
public static void main(String[] args) {
		
		byte byteVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;
        char charVar;
        boolean booleanVar;
        
        
        byteVar = 0;        // will be initialized to 0
        shortVar = 0;       
        intVar = 0;         
        longVar = 0L;       
        floatVar = 0.0f;    
        doubleVar = 0.0;    
        charVar = '\u0000'; 
        booleanVar = false;
        
        
        System.out.println("Default values of primitive types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + (int)charVar + " (unicode value)"); 
        System.out.println("boolean: " + booleanVar);
	}


}

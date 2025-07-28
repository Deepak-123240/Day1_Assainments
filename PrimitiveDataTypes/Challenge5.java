package PrimitiveDataTypes;

import java.util.Scanner;

public class Challenge5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a byte :");
        byte b = scanner.nextByte();

        System.out.println("Enter a short :");
        short s = scanner.nextShort();

        System.out.println("Enter an int:");
        int i = scanner.nextInt();

        System.out.println("Enter a long:");
        long l = scanner.nextLong();

        System.out.println("Enter a float:");
        float f = scanner.nextFloat();

        System.out.println("Enter a double:");
        double d = scanner.nextDouble();

        System.out.println("Enter a boolean (true/false):");
        boolean bool = scanner.nextBoolean();

        System.out.println("Enter a character :");
        char c = scanner.next().charAt(0);

        System.out.println("\nFormatted Output:");
        System.out.printf("Byte: %d\n", b);
        System.out.printf("Short: %d\n", s);
        System.out.printf("Int: %d\n", i);
        System.out.printf("Long: %d\n", l);
        System.out.printf("Float: %.2f\n", f);
        System.out.printf("Double: %.3f\n", d);
        System.out.printf("Boolean: %b\n", bool);
        System.out.printf("Char: %c\n", c);
	}

}

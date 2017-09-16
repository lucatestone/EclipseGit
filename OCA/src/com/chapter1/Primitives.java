package com.chapter1;

public class Primitives {

	public static void main(String[] args) {
		
		boolean bo = true;
		byte by = 10;
		short sh = 123;
		int i = 312;
		long l = 1234L;
		float f = 123.4F;
		double d = 153.21;
		char c = 'a';

		//Beginning with a 0, octal
		int octal = 017;
		int hexadecimal = 0xFF;
		int binary = 0b10;
		
		System.out.println("Octal: " + octal);
		System.out.println("Hexadecimal: " + hexadecimal);
		System.out.println("Binary: " + binary);
		
		long oneMillion = 1_000_000;
		System.out.println("Un milione: " + oneMillion);
		
	}

}

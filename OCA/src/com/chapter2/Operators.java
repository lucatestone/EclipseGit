package com.chapter2;

public class Operators {

	public static void main(String[] args) {
		
		int counter = 0;
		System.out.println("Valore iniziale del counter: " + counter);
		
		System.out.println("counter++: " + counter++);
		
		System.out.println("Senza aver fatto modifiche il counter vale: " + counter);
		
		System.out.println("++counter: " + ++counter);
		
		System.out.println("++counter * counter++ " + ++counter * counter++);
		

		int x = 3;
		int z = 0;
		z += x;
		int y = ++x * 5 / --x + --x;
		
		boolean a = false || true ^ true;
		
		System.out.println(y);
		
		while(true) {
			System.out.println("CICIU");
		}
		
	}
	
	private void metodo(String input, final String ciao) {
		switch (input) {
		case "CIAO":
			System.out.println("CIAO");
			break;
		case "ciao":
			System.out.println("");
		default:
			break;
		}
	}

}

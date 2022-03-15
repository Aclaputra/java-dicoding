package com.codingtopia.javafundamental.perulangan;

public class ForBersarang {

	public static void main(String[] args) {
		int a = 5;
		for (int i = 0; i <= a; i++) {
//			System.out.println("Hello");
			for (int j = 0; j <= i; j++) {
//				System.out.print("Bersarang.");
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

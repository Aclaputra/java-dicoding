package com.codingtopia.javafundamental.operator.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Program penjumlahan sangat sederhana");
			System.out.print("Masukan Angka pertama : ");
			int value = scanner.nextInt();
			System.out.print("Masukkan Angka ke dua : ");
			int anotherValue = scanner.nextInt();
			int result = value + anotherValue;
			System.out.println("Hasilnya adalah : " + result);
		}
	}

}

package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {

	public static void main(String[] args) {
		// menggunakan HashSet
		Set<String> planets = new HashSet<>();
		planets.add("mercury"); //method add() untuk menambhkan objek ke Set
		planets.add("venus");
		planets.add("earth");
		planets.add("earth"); // menambahkan objek "earth" beberapa kali
		planets.add("earth");
		planets.add("mars"); // objek terus ditambahkan ke Set
		
		// method size() untuk mendapatkan ukuran Set
		System.out.println("Set planets awal: (size = " + planets.size() + ")");
		for (String planet : planets) System.out.println("\t " + planet);
		
		planets.remove("venus"); // method remove(0 utk mengeluarkan objek dari Set
		
		System.out.println("Set planets akhir: (size = "+ planets.size() + ")");
		for(Iterator<String> iterator = planets.iterator(); iterator.hasNext();) {
			// looping menggunakan Iterator
			System.out.println("\t " + iterator.next());
		}
	}

}

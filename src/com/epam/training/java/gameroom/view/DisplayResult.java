package com.epam.training.java.gameroom.view;

import java.util.ArrayList;
import java.util.Iterator;

import com.epam.training.java.gameroom.domain.Toy;

public class DisplayResult {
	public static void printArrayList(ArrayList<Toy> toys) throws DisplayException {
		if (toys == null) {
			throw new DisplayException("Null was sent in a printArrayList method!");
		}
		Iterator<Toy> it = toys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("");
	}
}

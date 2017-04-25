package com.epam.training.java.gameroom.service;

import java.util.ArrayList;

import com.epam.training.java.gameroom.dao.Catalog;
import com.epam.training.java.gameroom.domain.AgeToy;
import com.epam.training.java.gameroom.domain.Room;
import com.epam.training.java.gameroom.domain.Toy;

public class InitUtil {

	public static int random(int min, int max) {
		return min + (int) (Math.random() * (max - min));
	}

	public static boolean itemInArray(ArrayList<Toy> toys, Toy targetValue) {
		for (Toy toy : toys) {
			if (toy != null && toy.equals(targetValue))
				return true;
		}
		return false;
	}

	public static AgeToy ageCriteria(ArrayList<Toy> toys) throws GameRoomException {
		int ageThree = 0;
		int ageSix = 0;
		int ageNine = 0;

		if (toys == null) {
			throw new GameRoomException("Null was sent in a getAgeCriteria() method!");
		}

		for (Toy toy : toys) {
			if (toy != null) {
				if ((toy.getAge().equals(AgeToy.THREE))) {
					ageThree++;
				}
				if ((toy.getAge().equals(AgeToy.SIX))) {
					ageSix++;
				}
				if ((toy.getAge().equals(AgeToy.NINE))) {
					ageNine++;
				}
			}
		}

		AgeToy resultAge = AgeToy.THREE;
		if (ageSix < ageThree) {
			resultAge = AgeToy.SIX;
		}
		if (ageNine < ageSix) {
			resultAge = AgeToy.NINE;
		}

		return resultAge;
	}
	
	public static Toy getRandomToy(Room room) throws GameRoomException{
		if (room.getToys() == null) {
			throw new GameRoomException("Null was sent in a getRandomToy() method!");
		}
		ArrayList<Toy> catalog = new Catalog().getCatalog();
		int randomCatalogIndex = random(0, catalog.size() - 1);
		Toy randomCatalogToy = catalog.get(randomCatalogIndex);
		AgeToy ageCriteria = ageCriteria(room.getToys());
		if (!itemInArray(room.getToys(), randomCatalogToy) && (randomCatalogToy.getAge().equals(ageCriteria))) {
			return randomCatalogToy;
		} else {
			return null;
		}

	}
}

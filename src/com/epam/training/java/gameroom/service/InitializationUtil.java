package com.epam.training.java.gameroom.service;

import com.epam.training.java.gameroom.domain.AgeToy;
import com.epam.training.java.gameroom.domain.Toy;

public class InitializationUtil {
	
	public InitializationUtil(){
		
	}
	
	public static Toy[] notEmptyValue(Toy[] toys) throws GameRoomException {
		if (toys != null) {
			int count = 0;
			for (Toy toy : toys) {
				if (toy != null) {
					count++;
				}
			}
			Toy[] tmp = new Toy[count];
			for (int i = 0; i < toys.length; i++) {
				if (toys[i] != null) {
					tmp[i] = toys[i];
				}
			}
			toys = tmp;
		} else {
			throw new GameRoomException("Null was sent in a notEmptyValue() method!");
		}
		return toys;
	}

	public static int random(int min, int max) {
		return min + (int) (Math.random() * (max - min));
	}

	public static boolean itemInArray(Toy[] toys, Toy targetValue) {
		for (Toy toy : toys) {
			if (toy != null && toy.equals(targetValue))
				return true;
		}
		return false;
	}

	public static AgeToy ageCriteria(Toy[] toys) throws GameRoomException {
		int ageThree = 0;
		int ageSix = 0;
		int ageNine = 0;

		if (toys != null) {
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
		} else {
			throw new GameRoomException("Null was sent in a getAgeCriteria() method!");
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
}

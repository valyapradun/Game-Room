package com.epam.training.java.gameroom.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.epam.training.java.gameroom.domain.AgeToy;
import com.epam.training.java.gameroom.domain.SizeToy;
import com.epam.training.java.gameroom.domain.Toy;
import static com.epam.training.java.gameroom.service.InitializationUtil.*;

public class GameRoom {
	private Toy[] toys;
	private int count;
	private double cost;

	public GameRoom() {
	}


	public Toy[] initialization(int totalCount, double total—ost, ArrayList<Toy> catalog) throws GameRoomException {
		if ((totalCount != 0) || (total—ost != 0) || catalog != null) {
			this.count = totalCount;
			this.cost = total—ost;
			this.toys = new Toy[totalCount];
			double cost = 0;
			int count = 0;
			int attempts = 0;
			while ((count < totalCount) && ((total—ost - cost) > 0) && (attempts < (catalog.size() * 10))) {
				int randomCatalogIndex = random(0, catalog.size() - 1);
				Toy randomCatalogToy = catalog.get(randomCatalogIndex);
				String typeToy = randomCatalogToy.getClass().getName();
				AgeToy ageCriteria = ageCriteria(toys);
				if (!itemInArray(toys, randomCatalogToy)) {
					if ((randomCatalogToy.getAge().equals(ageCriteria))
							&& (randomCatalogToy.getClass().getName().equals(typeToy))) {
						if ((total—ost - cost) > randomCatalogToy.getPrice()) {
							toys[count] = randomCatalogToy;
							cost = cost + randomCatalogToy.getPrice();
							count = count + 1;
						}
					}
				}
				attempts++;
			}
			toys = notEmptyValue(toys);
		} else {
			throw new GameRoomException("Wrong arguments were sent in a initialization() method!");
		}
		return toys;
	}

	public void sortByPrice(Toy[] toys) throws GameRoomException {
		if (toys != null) {
			Comparator<Toy> comp = new Comparator<Toy>() {
				public int compare(Toy one, Toy two) {
					return ((Double) one.getPrice()).compareTo((Double) two.getPrice());
				}
			};
			Arrays.sort(toys, comp);
		} else {
			throw new GameRoomException("Null was sent in a sorting() method!");
		}
	}

	public ArrayList<Toy> searchToys(Toy[] toys) throws GameRoomException {
		ArrayList<Toy> resultToys = new ArrayList<Toy>();
		if (toys != null) {
			for (Toy toy : toys) {
				if ((toy.getAge().equals(AgeToy.SIX)) && (toy.getSize().equals(SizeToy.MEDIUM))) {
					resultToys.add(toy);
				}
			}
		} else {
			throw new GameRoomException("Null was sent in a search() method!");
		}
		return resultToys;
	}
}

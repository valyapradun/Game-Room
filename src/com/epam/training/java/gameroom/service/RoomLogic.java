package com.epam.training.java.gameroom.service;

import static com.epam.training.java.gameroom.service.InitUtil.getRandomToy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.epam.training.java.gameroom.dao.Catalog;
import com.epam.training.java.gameroom.domain.AgeToy;
import com.epam.training.java.gameroom.domain.Room;
import com.epam.training.java.gameroom.domain.SizeToy;
import com.epam.training.java.gameroom.domain.Toy;

public class RoomLogic {
	private ArrayList<Toy> catalog = new Catalog().getCatalog();

	private static Comparator<Toy> sortByPrice = new Comparator<Toy>() {
		public int compare(Toy one, Toy two) {
			return ((Double) one.getPrice()).compareTo((Double) two.getPrice());
		}
	};

	public Room initRoom(Room room) throws GameRoomException {
		if (room.getToys() == null) {
			throw new GameRoomException("Null was sent in a init() method!");
		}
		double price = 0;
		int size = 0;
		int attempts = 0;
		while ((size < room.getCount()) && (price <= room.getCost()) && (attempts < (catalog.size() * 10))) {
			Toy randomCatalogToy = getRandomToy(room);
			if (randomCatalogToy != null) {
				room.addToy(randomCatalogToy);
				price = price + randomCatalogToy.getPrice();
				size = room.getToys().size();
			}
			attempts++;
		}
		return room;
	}

	public void sortByPrice(Room room) throws GameRoomException {
		if (room.getToys() == null) {
			throw new GameRoomException("Null was sent in a sorting() method!");
		}
		Collections.sort(room.getToys(), sortByPrice);
	}

	public ArrayList<Toy> searchToys(Room room) throws GameRoomException {
		ArrayList<Toy> resultToys = new ArrayList<Toy>();
		if (room.getToys() == null) {
			throw new GameRoomException("Null was sent in a search() method!");
		}
		for (Toy toy : room.getToys()) {
			if ((toy.getAge().equals(AgeToy.SIX)) && (toy.getSize().equals(SizeToy.MEDIUM))) {
				resultToys.add(toy);
			}
		}
		return resultToys;
	}

}

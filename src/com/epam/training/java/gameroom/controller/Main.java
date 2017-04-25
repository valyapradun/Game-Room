package com.epam.training.java.gameroom.controller;

import com.epam.training.java.gameroom.domain.Room;
import com.epam.training.java.gameroom.service.GameRoomException;
import com.epam.training.java.gameroom.service.RoomLogic;
import com.epam.training.java.gameroom.view.DisplayException;
import com.epam.training.java.gameroom.view.DisplayResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private final static Logger log = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) {
		log.info("starting...");
		Room room = new Room(10, 400);
		try {
			RoomLogic service = new RoomLogic();
			service.initRoom(room);
			service.sortByPrice(room);
			DisplayResult.printArrayList(room.getToys());
			DisplayResult.printArrayList(service.searchToys(room));
		} catch (GameRoomException e) {
			log.error("Error: " + e.getMessage());
		} catch (DisplayException e) {
			log.error("Error: " + e.getMessage());
		}
		log.info("the end");
	}
}

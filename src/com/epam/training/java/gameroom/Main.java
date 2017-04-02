package com.epam.training.java.gameroom;

import com.epam.training.java.gameroom.controller.Util;
import com.epam.training.java.gameroom.controller.UtilException;
import com.epam.training.java.gameroom.domain.Toy;
import com.epam.training.java.gameroom.service.GameRoom;
import com.epam.training.java.gameroom.service.GameRoomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private final static Logger log = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) {
		log.info("starting...");
		GameRoom gr = new GameRoom();
		try {
			Toy[] toys = gr.initialization(10, 400, Util.createCatalog());
			gr.sortByPrice(toys);
			Util.printArray(toys);
			Util.printArrayList(gr.searchToys(toys));
		} catch (GameRoomException e) {
			log.error("Error: " + e.getMessage());
		} catch (UtilException e) {
			log.error("Error: " + e.getMessage());
		}
		log.info("the end");
	}
}

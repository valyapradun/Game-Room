package com.epam.training.java.gameroom.service;

public class GameRoomException extends Exception {

	private static final long serialVersionUID = -1841329285431969888L;

	public GameRoomException() {
		super();
	}

	public GameRoomException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public GameRoomException(String arg0) {
		super(arg0);
	}

	public GameRoomException(Throwable arg0) {
		super(arg0);
	}

}

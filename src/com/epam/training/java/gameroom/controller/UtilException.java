package com.epam.training.java.gameroom.controller;

public class UtilException extends Exception{
	private static final long serialVersionUID = 4030985096634088335L;

	public UtilException() {
		super();
	}

	public UtilException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UtilException(String arg0) {
		super(arg0);
	}

	public UtilException(Throwable arg0) {
		super(arg0);
	}
}

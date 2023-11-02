package com.estudo.exception;

public class GameException extends Exception {

	private static final long serialVersionUID = 7664344684843455357L;

	public GameException() {
		super();
	}

	public GameException(String message) {
		super(message);
	}

	public GameException(Throwable cause) {
		super(cause);
	}
}

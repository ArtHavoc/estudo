package com.estudo.exception;

public class GameItemException extends GameException {

	private static final long serialVersionUID = 7174344684843455117L;

	public GameItemException() {
		super();
	}

	public GameItemException(String message) {
		super(message);
	}

	public GameItemException(Throwable cause) {
		super(cause);
	}
}

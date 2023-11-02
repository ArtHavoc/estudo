package com.estudo.exception;

public class GameOverException extends GameException {

	private static final long serialVersionUID = 7174344684843455117L;

	public GameOverException() {
		super();
	}

	public GameOverException(String message) {
		super(message);
	}

	public GameOverException(Throwable cause) {
		super(cause);
	}
}

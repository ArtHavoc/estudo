package com.estudo.exception;

public class GameEndSuccessException extends GameException {

	private static final long serialVersionUID = -3590908012287185412L;

	public GameEndSuccessException() {
		super();
	}

	public GameEndSuccessException(String message) {
		super(message);
	}

	public GameEndSuccessException(Throwable cause) {
		super(cause);
	}
}

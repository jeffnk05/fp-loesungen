package io.fp.nextday;

public class DateException extends Exception {
	private static final long serialVersionUID = 1L;

	public DateException() {
		super("Fehlerhaftes Datum!");
	}

	public DateException(String errorDescription) {
		super(errorDescription);
	}

	public DateException(Throwable cause) {
		super(cause);
	}

	public DateException(String message, Throwable cause) {
		super(message, cause);
	}

	public DateException(String message, Throwable cause, boolean arg2, boolean arg3) {
		super(message, cause, arg2, arg3);
	}

}

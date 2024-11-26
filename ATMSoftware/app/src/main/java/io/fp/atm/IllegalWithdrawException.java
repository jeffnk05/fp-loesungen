package io.fp.atm;

public class IllegalWithdrawException extends Exception{

    public IllegalWithdrawException() {
    }

    public IllegalWithdrawException(String message) {
        super(message);
    }

    public IllegalWithdrawException(Throwable cause) {
        super(cause);
    }

    public IllegalWithdrawException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWithdrawException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

package jpabook.jpashop.exeption;

public class NotEnoughStokeException extends RuntimeException{
    public NotEnoughStokeException() {
        super();
    }

    public NotEnoughStokeException(String message) {
        super(message);
    }

    public NotEnoughStokeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStokeException(Throwable cause) {
        super(cause);
    }

    protected NotEnoughStokeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

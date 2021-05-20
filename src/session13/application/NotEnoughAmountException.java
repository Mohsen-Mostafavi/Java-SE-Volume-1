package session13.application;

// Application Exception / Custom Exception
public class NotEnoughAmountException extends Exception { // checked

    public NotEnoughAmountException() {
        super("Not enough amount");
    }

    public NotEnoughAmountException(String message) {
        super(message);
    }
 
}

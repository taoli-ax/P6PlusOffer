package day3.vendingmachine;

public class NotEnoughItemException extends RuntimeException {
    public NotEnoughItemException(String message) {
        super(message);
    }
}

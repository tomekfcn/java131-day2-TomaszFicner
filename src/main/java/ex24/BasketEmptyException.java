package ex24;

public class BasketEmptyException extends Exception {
    public BasketEmptyException() {
        super("koszyk pusty udanych zakupów");
    }

}

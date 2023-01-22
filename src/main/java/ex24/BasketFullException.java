package ex24;

public class BasketFullException extends Exception {
    BasketFullException(){
        super("Koszyk jest pełny");
    }
    public BasketFullException(String message){
        super(message);

    }
}

package ex24;

public class MainEx24 {
    public static void main(String[] args) {


        Basket basket = new Basket();
        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();

            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();

        }catch (BasketFullException|BasketEmptyException e){
            System.out.println("Wyjątek ojej");
            System.out.println(e.getMessage());
        }

    }
}

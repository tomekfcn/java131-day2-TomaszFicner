package ex24;

import java.util.List;

//Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku. Dodaj metodę addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1) oraz metodę removeFromBasket(), która usuwa element z koszyka (zmniejszając aktualny stan o 1).
//
//        Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0 lub dodania przy stanie 10, rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
public class Basket {
    private int itemCount = 0;

    public void addToBasket() throws BasketFullException {
        if(itemCount <= 10){
        itemCount++;}
        else {
           throw new BasketFullException("Wyjmij produkty z koszyka");
        }
    }


    public void removeFromBasket() throws BasketEmptyException {
        if(itemCount >=0){
        itemCount--;}else {
            throw new BasketEmptyException();
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemCount=" + itemCount +
                '}';
    }
}
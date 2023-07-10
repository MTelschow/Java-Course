package Exercises.Generics;

public class BagExample {
    public static void main(String[] args) {
        Bag<Integer> numberBasket = new Bag<>();
        numberBasket.addItem(3);
        numberBasket.addItem(4);
        numberBasket.removeItem(4);
        System.out.println(numberBasket.getItems());
    }
}

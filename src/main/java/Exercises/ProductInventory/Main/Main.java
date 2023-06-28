package Exercises.ProductInventory.Main;

import Exercises.ProductInventory.Inventory.Inventory;
import Exercises.ProductInventory.Inventory.Product;
import Exercises.ProductInventory.Inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product eggs = new Product();
        eggs.price = 0.99;
        eggs.productId = 21321;
        eggs.productName = "Eggs";

        Product milk = new Product();
        milk.price = 2.15;
        milk.productId = 18923;
        milk.productName = "Milk";

        Inventory eggInv = new Inventory();
        eggInv.product = eggs;
        eggInv.quantity = 6;

        Inventory milkInv = new Inventory();
        milkInv.product = milk;
        milkInv.quantity = 12;

        Warehouse nestle = new Warehouse();
        nestle.warehouseId = 12;
        nestle.warehouseName = "Nestle";



    }
}

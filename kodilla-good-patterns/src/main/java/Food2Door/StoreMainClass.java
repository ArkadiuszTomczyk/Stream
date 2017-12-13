package Food2Door;

import java.util.Random;

public class StoreMainClass {
    public static void main (String[] args) {
        Order order = new Order("Lays", 152);
        Random random = new Random();

        Supplier supplier = null;
        int supNumber = random.nextInt(3);
        switch (supNumber) {
            case 0: supplier = new GlutenFreeShop();
            break;
            case 1: supplier = new ExtraFoodShop();
            break;
            case  2: supplier = new  HealthyShop();
            break;
        }
        System.out.println("Sending order to: " + supplier.getSupplierName());
        if (supplier.process(order)) {
            System.out.println("Order processed");
        } else {
            System.out.println("Cannot process order");
        }
    }
}

package Food2Door;

import java.util.Random;
import java.util.function.Supplier;

public class ExtraFoodShop implements Supplier {
    @Override
    public String getSupplierName() {
        return "ExtraFoodS";
    }

    @Override
    public boolean process(Food2Door.Order order) {
        System.out.println("Processing order " + order.getProductName() + ", pcs: " + order.getProductQuantity());
        Random random = new Random();
        return random.nextBoolean();
    }
}

package Food2Door;

import java.util.Random;

public class HealthyShop implements Supplier {
    @Override
    public String getSupplierName() {
        return "Healthy Shop";
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Processing order " + order.getProductName() + ", pcs: " + order.getProductQuantity());
        Random random = new Random();
        return random.nextBoolean();
    }
}

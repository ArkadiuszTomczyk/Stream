package Food2Door;

public class Order {
    private String productName;
    private double productQuantity;

    public Order(String productName, double productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}

package Food2Door;

public interface Supplier {
    String getSupplierName();
    boolean process(Order order);
}

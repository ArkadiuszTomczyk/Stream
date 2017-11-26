package com.kodilla.stream.invoice.simple;

public class SimpleProduct {
    private  final String productName;
    private final double productPrice;

    public SimpleProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;

        SimpleProduct that = (SimpleProduct) o;

        if (Double.compare(that.getProductPrice(), getProductPrice()) != 0) return false;
        return getProductName() != null ? getProductName().equals(that.getProductName()) : that.getProductName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getProductName() != null ? getProductName().hashCode() : 0;
        temp = Double.doubleToLongBits(getProductPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

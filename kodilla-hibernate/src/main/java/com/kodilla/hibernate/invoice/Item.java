package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.Product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Entity
@Table(name = "ITEM")
public class Item {
    private Long id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Product product;
    private Invoice invoice;

    public Item() {
        }

    public Item(BigDecimal price, int quantity, Product product, Invoice invoice) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
        this.product = product;
        this.invoice = invoice;
    }
    @Id
    @GeneratedValue
//    @NotNull
    @Column(name = "ITEM_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    @NotNull
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    @NotNull
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}

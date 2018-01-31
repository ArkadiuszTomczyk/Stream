package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("pralka");
        Invoice invoice = new Invoice("1");
        Item item = new Item(new BigDecimal("120"), 2, product, invoice);
        product.getItems().add(item);
        invoice.getItems().add(item);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        itemDao.save(item);


        //Then
        Long id = invoice.getId();
        Invoice result = invoiceDao.findOne(id);
        Assert.assertEquals("1", result.getNumber());

        //Delete
        itemDao.delete(item.getId());
        invoiceDao.delete(id);
        productDao.delete(product.getId());

    }
}

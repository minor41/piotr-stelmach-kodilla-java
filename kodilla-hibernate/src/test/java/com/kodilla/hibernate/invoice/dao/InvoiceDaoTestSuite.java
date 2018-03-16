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

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("aaa");
        Product product2 = new Product("bbb");
        Product product3 = new Product("ccc");


        Item item1 = new Item(new BigDecimal(100), 3, new BigDecimal(300));
        Item item2 = new Item(new BigDecimal(200), 1, new BigDecimal(200));
        Item item3 = new Item(new BigDecimal(300), 5, new BigDecimal(1500));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        Invoice invoice1 = new Invoice("001");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Clean up
        productDao.delete(product1);
        productDao.delete(product2);
        productDao.delete(product3);
        invoiceDao.delete(invoice1);

    }
}
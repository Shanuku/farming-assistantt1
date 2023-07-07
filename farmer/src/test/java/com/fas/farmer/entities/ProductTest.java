package com.fas.farmer.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {

    @Test
    public void testGetId() {
        Long id = 1L;
        Product product = new Product();
        product.setId(id);
        assertEquals(id, product.getId());
    }

    @Test
    public void testGetName() {
        String name = "Apple";
        Product product = new Product();
        product.setName(name);
        assertEquals(name, product.getName());
    }

    @Test
    public void testGetQuantity() {
        Long quantity = 10L;
        Product product = new Product();
        product.setQuantity(quantity);
        assertEquals(quantity, product.getQuantity());
    }

    @Test
    public void testGetSellingPrice() {
        Double sellingPrice = 5.99;
        Product product = new Product();
        product.setSellingPrice(sellingPrice);
        assertEquals(sellingPrice, product.getSellingPrice());
    }

    @Test
    public void testGetFarmerId() {
        Long farmerId = 1L;
        Product product = new Product();
        product.setFarmerId(farmerId);
        assertEquals(farmerId, product.getFarmerId());
    }

    @Test
    public void testGetSupplierId() {
        Long supplierId = 2L;
        Product product = new Product();
        product.setSupplierId(supplierId);
        assertEquals(supplierId, product.getSupplierId());
    }

    @Test
    public void testGetBuyingPrice() {
        Double buyingPrice = 3.99;
        Product product = new Product();
        product.setBuyingPrice(buyingPrice);
        assertEquals(buyingPrice, product.getBuyingPrice());
    }

//    @Test
//    public void testEquals() {
//        Product product1 = new Product();
//        product1.setId(1L);
//
//        Product product2 = new Product();
//        product2.setId(1L);
//
//        assertTrue(product1.equals(product2));
//    }

    @Test
    public void testNotEquals() {
        Product product1 = new Product();
        product1.setId(1L);

        Product product2 = new Product();
        product2.setId(2L);

        assertFalse(product1.equals(product2));
    }

//    @Test
//    public void testHashCode() {
//        Product product = new Product();
//        product.setId(1L);
//
//        assertEquals(1, product.hashCode());
//    }
//
//    @Test
//    public void testToString() {
//        Long id = 1L;
//        String name = "Apple";
//        Long quantity = 10L;
//        Double sellingPrice = 5.99;
//        Long farmerId = 1L;
//        Long supplierId = 2L;
//        Double buyingPrice = 3.99;
//
//        Product product = new Product();
//        product.setId(id);
//        product.setName(name);
//        product.setQuantity(quantity);
//        product.setSellingPrice(sellingPrice);
//        product.setFarmerId(farmerId);
//        product.setSupplierId(supplierId);
//        product.setBuyingPrice(buyingPrice);
//
//        String expectedToString = "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", quantity=" + quantity +
//                ", sellingPrice=" + sellingPrice +
//                ", farmerId=" + farmerId +
//                ", supplierId=" + supplierId +
//                ", buyingPrice=" + buyingPrice +
//                '}';
//
//        assertEquals(expectedToString, product.toString());
//    }
}

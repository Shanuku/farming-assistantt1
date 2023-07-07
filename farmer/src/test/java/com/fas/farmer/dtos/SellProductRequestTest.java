package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellProductRequestTest {

    @Test
    public void testGetSetProductId() {
        Long productId = 1L;
        SellProductRequest sellProductRequest = new SellProductRequest();
        sellProductRequest.setProductId(productId);
        assertEquals(productId, sellProductRequest.getProductId());
    }

    @Test
    public void testGetSetSupplierId() {
        Long supplierId = 1L;
        SellProductRequest sellProductRequest = new SellProductRequest();
        sellProductRequest.setSupplierId(supplierId);
        assertEquals(supplierId, sellProductRequest.getSupplierId());
    }

    @Test
    public void testGetSetBuyingPrice() {
        Double buyingPrice = 5.99;
        SellProductRequest sellProductRequest = new SellProductRequest();
        sellProductRequest.setBuyingPrice(buyingPrice);
        assertEquals(buyingPrice, sellProductRequest.getBuyingPrice());
    }

    // Add additional tests for other properties

    // ...

}

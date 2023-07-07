package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyRequestDetailsTest {

    @Test
    public void testGetSetId() {
        Long id = 1L;
        BuyRequestDetails details = new BuyRequestDetails();
        details.setId(id);
        assertEquals(id, details.getId());
    }

    @Test
    public void testGetSetAskedPrice() {
        Double askedPrice = 9.99;
        BuyRequestDetails details = new BuyRequestDetails();
        details.setAskedPrice(askedPrice);
        assertEquals(askedPrice, details.getAskedPrice());
    }

    @Test
    public void testGetSetRequestStatus() {
        String requestStatus = "Pending";
        BuyRequestDetails details = new BuyRequestDetails();
        details.setRequestStatus(requestStatus);
        assertEquals(requestStatus, details.getRequestStatus());
    }

    // Add similar tests for other properties

    // ...

}

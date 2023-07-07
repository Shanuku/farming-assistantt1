package com.fas.supplier.entities;

import com.fas.supplier.constants.RequestStatus;
import com.fas.supplier.entities.BuyRequest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuyRequestTest {

    @Test
    public void testGettersAndSetters() {
        BuyRequest buyRequest = new BuyRequest();
        buyRequest.setId(1L);
        buyRequest.setProductId(2L);
        buyRequest.setSupplierId(3L);
        buyRequest.setAskedPrice(10.0);
        buyRequest.setRequestStatus(RequestStatus.PENDING);

        assertEquals(1L, buyRequest.getId());
        assertEquals(2L, buyRequest.getProductId());
        assertEquals(3L, buyRequest.getSupplierId());
        assertEquals(10.0, buyRequest.getAskedPrice());
        assertEquals(RequestStatus.PENDING, buyRequest.getRequestStatus());
    }

//    @Test
//    public void testConstructor() {
//        Long id = 1L;
//        Long productId = 2L;
//        Long supplierId = 3L;
//        Double askedPrice = 10.0;
//        RequestStatus requestStatus = RequestStatus.PENDING;
//
//        BuyRequest buyRequest = new BuyRequest(id, productId, supplierId, askedPrice, requestStatus);
//
//        assertEquals(id, buyRequest.getId());
//        assertEquals(productId, buyRequest.getProductId());
//        assertEquals(supplierId, buyRequest.getSupplierId());
//        assertEquals(askedPrice, buyRequest.getAskedPrice());
//        assertEquals(requestStatus, buyRequest.getRequestStatus());
//    }

//    @Test
//    public void testToString() {
//        BuyRequest buyRequest = new BuyRequest();
//        buyRequest.setId(1L);
//        buyRequest.setProductId(2L);
//        buyRequest.setSupplierId(3L);
//        buyRequest.setAskedPrice(10.0);
//        buyRequest.setRequestStatus(RequestStatus.PENDING);
//
//        String expectedString = "BuyRequest{id=1, productId=2, supplierId=3, askedPrice=10.0, requestStatus=PENDING}";
//        assertEquals(expectedString, buyRequest.toString());
//    }

    // Additional test methods for other scenarios

    // ...
}

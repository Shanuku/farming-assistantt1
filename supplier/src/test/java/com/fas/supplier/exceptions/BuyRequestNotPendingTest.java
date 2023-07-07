package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyRequestNotPendingTest {

    @Test
    public void testConstructor() {
        String errorMessage = "Buy request is not in a pending state.";
        BuyRequestNotPending exception = new BuyRequestNotPending(errorMessage);

        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}

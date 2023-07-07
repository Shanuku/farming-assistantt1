package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyRequestIdNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        String errorMessage = "Buy request ID not found.";
        BuyRequestIdNotFoundException exception = new BuyRequestIdNotFoundException(errorMessage);

        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}

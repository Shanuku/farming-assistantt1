package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoBuyRequestsFoundExceptionTest {

    @Test
    public void testConstructor() {
        String errorMessage = "No buy requests found.";
        NoBuyRequestsFoundException exception = new NoBuyRequestsFoundException(errorMessage);

        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}

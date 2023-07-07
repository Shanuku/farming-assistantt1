package com.fas.farmer.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmerLoggedOutExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Farmer logged out.";
        FarmerLoggedOutException exception = new FarmerLoggedOutException(message);
        assertEquals(message, exception.getMessage());
    }
}

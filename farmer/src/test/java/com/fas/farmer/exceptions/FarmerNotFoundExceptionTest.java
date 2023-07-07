package com.fas.farmer.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmerNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Farmer not found.";
        FarmerNotFoundException exception = new FarmerNotFoundException(message);
        assertEquals(message, exception.getMessage());
    }
}

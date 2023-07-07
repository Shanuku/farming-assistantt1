package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FarmerNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        String errorMessage = "Farmer not found.";
        FarmerNotFoundException exception = new FarmerNotFoundException(errorMessage);

        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}

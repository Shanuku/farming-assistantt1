package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupplierLoggedOutExceptionTest {

    @Test
    public void testConstructor() {
        String expectedMsg = "Supplier has been logged out.";
        SupplierLoggedOutException exception = new SupplierLoggedOutException(expectedMsg);
        assertEquals(expectedMsg, exception.getMessage());
    }

    @Test
    public void testConstructorWithCustomMessage() {
        String customMsg = "Custom message for SupplierLoggedOutException";
        SupplierLoggedOutException exception = new SupplierLoggedOutException(customMsg);
        assertEquals(customMsg, exception.getMessage());
    }
}

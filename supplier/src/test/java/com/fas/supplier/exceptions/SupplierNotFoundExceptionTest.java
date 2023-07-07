package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupplierNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        String expectedMsg = "Supplier not found.";
        SupplierNotFoundException exception = new SupplierNotFoundException(expectedMsg);
        assertEquals(expectedMsg, exception.getMessage());
    }

    @Test
    public void testConstructorWithCustomMessage() {
        String customMsg = "Custom message for SupplierNotFoundException";
        SupplierNotFoundException exception = new SupplierNotFoundException(customMsg);
        assertEquals(customMsg, exception.getMessage());
    }
}

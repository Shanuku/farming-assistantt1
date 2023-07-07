package com.fas.farmer.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Product not found.";
        ProductNotFoundException exception = new ProductNotFoundException(message);
        assertEquals(message, exception.getMessage());
    }
}

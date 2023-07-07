package com.fas.farmer.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvalidUserTypeExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Invalid user type.";
        InvalidUserTypeException exception = new InvalidUserTypeException(message);
        assertEquals(message, exception.getMessage());
    }
}

package com.fas.admin.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsernameAlreadyExistsExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Username already exists.";
        UsernameAlreadyExistsException exception = new UsernameAlreadyExistsException(message);
        assertEquals(message, exception.getMessage());
    }
}

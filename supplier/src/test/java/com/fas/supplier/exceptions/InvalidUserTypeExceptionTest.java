package com.fas.supplier.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvalidUserTypeExceptionTest {

    @Test
    public void testConstructor() {
        String errorMessage = "Invalid user type category.";
        InvalidUserTypeException exception = new InvalidUserTypeException(errorMessage);

        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}

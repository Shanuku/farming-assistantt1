package com.fas.admin.exceptions;




        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvalidPasswordExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Invalid password.";
        InvalidPasswordException exception = new InvalidPasswordException(message);
        assertEquals(message, exception.getMessage());
    }
}


package com.fas.supplier.exceptions;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class ProductNotFoundExceptionTest {

    @Test
    public void testConstructor() {
        String errorMessage = "Product not found.";
        ProductNotFoundException exception = new ProductNotFoundException(errorMessage);

        Assertions.assertEquals(errorMessage, exception.getMessage());
    }
}

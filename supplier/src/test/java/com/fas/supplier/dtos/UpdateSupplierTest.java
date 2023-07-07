package com.fas.supplier.dtos;

import com.fas.supplier.dtos.UpdateSupplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateSupplierTest {

    @Test
    public void testGettersAndSetters() {
        UpdateSupplier updateSupplier = new UpdateSupplier();
        updateSupplier.setUsername("supplier123");
        updateSupplier.setFirstName("John");
        updateSupplier.setLastName("Doe");
        updateSupplier.setPincode(123456L);
        updateSupplier.setPhnNumber("123-456-7890");

        assertEquals("supplier123", updateSupplier.getUsername());
        assertEquals("John", updateSupplier.getFirstName());
        assertEquals("Doe", updateSupplier.getLastName());
        assertEquals(123456L, updateSupplier.getPincode());
        assertEquals("123-456-7890", updateSupplier.getPhnNumber());
    }

    // Additional test methods for other scenarios

    // ...
}

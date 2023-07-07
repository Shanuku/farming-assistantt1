package com.fas.supplier.entities;

import com.fas.supplier.entities.Supplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SupplierTest {

    @Test
    public void testGettersAndSetters() {
        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setUsername("supplier123");
        supplier.setFirstName("John");
        supplier.setLastName("Doe");
        supplier.setPincode(123456L);
        supplier.setPhnNumber("1234567890");

        assertEquals(1L, supplier.getId());
        assertEquals("supplier123", supplier.getUsername());
        assertEquals("John", supplier.getFirstName());
        assertEquals("Doe", supplier.getLastName());
        assertEquals(123456L, supplier.getPincode());
        assertEquals("1234567890", supplier.getPhnNumber());
    }

//    @Test
//    public void testConstructor() {
//        String username = "supplier123";
//        String firstName = "John";
//        String lastName = "Doe";
//        Long pincode = 123456L;
//        String phnNumber = "1234567890";
//
//        Supplier supplier = new Supplier(username, firstName, lastName, pincode, phnNumber);
//
//        assertNotNull(supplier.getId());
//        assertEquals(username, supplier.getUsername());
//        assertEquals(firstName, supplier.getFirstName());
//        assertEquals(lastName, supplier.getLastName());
//        assertEquals(pincode, supplier.getPincode());
//        assertEquals(phnNumber, supplier.getPhnNumber());
//    }

    @Test
    public void testToString() {
        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setUsername("supplier123");
        supplier.setFirstName("John");
        supplier.setLastName("Doe");
        supplier.setPincode(123456L);
        supplier.setPhnNumber("1234567890");

        String expectedString = "Supplier{id=1, username='supplier123', firstName='John', lastName='Doe', pincode=123456, phnNumber='1234567890'}";
        assertEquals(expectedString, supplier.toString());
    }

    // Additional test methods for other scenarios

    // ...
}

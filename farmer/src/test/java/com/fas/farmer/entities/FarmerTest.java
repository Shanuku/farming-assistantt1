package com.fas.farmer.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FarmerTest {

    @Test
    public void testGetId() {
        Long id = 1L;
        Farmer farmer = new Farmer();
        farmer.setId(id);
        assertEquals(id, farmer.getId());
    }

    @Test
    public void testGetUsername() {
        String username = "john123";
        Farmer farmer = new Farmer();
        farmer.setUsername(username);
        assertEquals(username, farmer.getUsername());
    }

    @Test
    public void testGetFirstName() {
        String firstName = "John";
        Farmer farmer = new Farmer();
        farmer.setFirstName(firstName);
        assertEquals(firstName, farmer.getFirstName());
    }

    @Test
    public void testGetLastName() {
        String lastName = "Doe";
        Farmer farmer = new Farmer();
        farmer.setLastName(lastName);
        assertEquals(lastName, farmer.getLastName());
    }

    @Test
    public void testGetPincode() {
        Long pincode = 123456L;
        Farmer farmer = new Farmer();
        farmer.setPincode(pincode);
        assertEquals(pincode, farmer.getPincode());
    }

    @Test
    public void testGetPhnNumber() {
        String phnNumber = "1234567890";
        Farmer farmer = new Farmer();
        farmer.setPhnNumber(phnNumber);
        assertEquals(phnNumber, farmer.getPhnNumber());
    }

    @Test
    public void testEquals() {
        Farmer farmer1 = new Farmer("john123", "John", "Doe", 123456L, "1234567890");
        farmer1.setId(1L);

        Farmer farmer2 = new Farmer("john123", "John", "Doe", 123456L, "1234567890");
        farmer2.setId(1L);

        assertTrue(farmer1.equals(farmer2));
    }

    @Test
    public void testNotEquals() {
        Farmer farmer1 = new Farmer("john123", "John", "Doe", 123456L, "1234567890");
        farmer1.setId(1L);

        Farmer farmer2 = new Farmer("jane456", "Jane", "Smith", 789012L, "9876543210");
        farmer2.setId(2L);

        assertFalse(farmer1.equals(farmer2));
    }

//    @Test
//    public void testHashCode() {
//        Farmer farmer = new Farmer("john123", "John", "Doe", 123456L, "1234567890");
//        farmer.setId(1L);
//
//        assertEquals(1, farmer.hashCode());
//    }

    @Test
    public void testToString() {
        Long id = 1L;
        String username = "john123";
        String firstName = "John";
        String lastName = "Doe";
        Long pincode = 123456L;
        String phnNumber = "1234567890";

        Farmer farmer = new Farmer(username, firstName, lastName, pincode, phnNumber);
        farmer.setId(id);

        String expectedToString = "Farmer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pincode=" + pincode +
                ", phnNumber='" + phnNumber + '\'' +
                '}';

        assertEquals(expectedToString, farmer.toString());
    }
}

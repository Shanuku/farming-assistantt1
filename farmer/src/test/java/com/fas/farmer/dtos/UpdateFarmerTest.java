package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UpdateFarmerTest {

    @Test
    public void testGetSetId() {
        Long id = 1L;
        UpdateFarmer updateFarmer = new UpdateFarmer();
        updateFarmer.setId(id);
        assertEquals(id, updateFarmer.getId());
    }

    @Test
    public void testGetSetUsername() {
        String username = "john123";
        UpdateFarmer updateFarmer = new UpdateFarmer();
        updateFarmer.setUsername(username);
        assertEquals(username, updateFarmer.getUsername());
    }

    @Test
    public void testGetSetFirstName() {
        String firstName = "John";
        UpdateFarmer updateFarmer = new UpdateFarmer();
        updateFarmer.setFirstName(firstName);
        assertEquals(firstName, updateFarmer.getFirstName());
    }

    @Test
    public void testGetSetLastName() {
        String lastName = "Doe";
        UpdateFarmer updateFarmer = new UpdateFarmer();
        updateFarmer.setLastName(lastName);
        assertEquals(lastName, updateFarmer.getLastName());
    }

    @Test
    public void testGetSetPincode() {
        Long pincode = 123456L;
        UpdateFarmer updateFarmer = new UpdateFarmer();
        updateFarmer.setPincode(pincode);
        assertEquals(pincode, updateFarmer.getPincode());
    }

    @Test
    public void testGetSetPhnNumber() {
        String phnNumber = "1234567890";
        UpdateFarmer updateFarmer = new UpdateFarmer();
        updateFarmer.setPhnNumber(phnNumber);
        assertEquals(phnNumber, updateFarmer.getPhnNumber());
    }

    // Add additional tests for validation constraints

    // ...

}

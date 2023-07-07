package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddComplaintRequestTest {

    @org.junit.Test
    public void testGetSetFarmerId() {
        Long farmerId = 1L;
        AddComplaintRequest request = new AddComplaintRequest();
        request.setFarmerId(farmerId);
        assertEquals(farmerId, request.getFarmerId());
    }

    @Test
    public void testGetSetComplaintDescription() {
        String complaintDescription = "Test complaint";
        AddComplaintRequest request = new AddComplaintRequest();
        request.setComplaintDescription(complaintDescription);
        assertEquals(complaintDescription, request.getComplaintDescription());
    }
}

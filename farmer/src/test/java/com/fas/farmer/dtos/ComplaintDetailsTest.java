package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplaintDetailsTest {

    @Test
    public void testGetSetId() {
        Long id = 12345L;
        ComplaintDetails complaintDetails = new ComplaintDetails();
        complaintDetails.setId(id);
        assertEquals(id, complaintDetails.getId());
    }

    @Test
    public void testGetSetRequest() {
        String request = "This is a complaint.";
        ComplaintDetails complaintDetails = new ComplaintDetails();
        complaintDetails.setRequest(request);
        assertEquals(request, complaintDetails.getRequest());
    }

    // Add additional tests for other properties or validations

    // ...

}

package com.fas.farmer.constants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequestStatusTest {

    @Test
    public void testEnumValues() {
        assertEquals(RequestStatus.PENDING, RequestStatus.valueOf("PENDING"));
        assertEquals(RequestStatus.APPROVED, RequestStatus.valueOf("APPROVED"));
        assertEquals(RequestStatus.REJECTED, RequestStatus.valueOf("REJECTED"));
    }
}

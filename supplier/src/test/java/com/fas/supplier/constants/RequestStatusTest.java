package com.fas.supplier.constants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RequestStatusTest {

    @Test
    void testEnumValues() {
        assertEquals("PENDING", RequestStatus.PENDING.name());
        assertEquals("APPROVED", RequestStatus.APPROVED.name());
        assertEquals("REJECTED", RequestStatus.REJECTED.name());
    }
}

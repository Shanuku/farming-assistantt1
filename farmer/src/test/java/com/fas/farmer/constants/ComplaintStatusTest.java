package com.fas.farmer.constants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplaintStatusTest {

    @Test
    public void testEnumValues() {
        assertEquals(ComplaintStatus.UNRESOLVED, ComplaintStatus.valueOf("UNRESOLVED"));
        assertEquals(ComplaintStatus.RESOLVED, ComplaintStatus.valueOf("RESOLVED"));
    }
}

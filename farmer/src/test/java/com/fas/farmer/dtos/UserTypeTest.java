package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTypeTest {

    @Test
    public void testEnumValues() {
        assertEquals(UserType.FARMER, UserType.valueOf("FARMER"));
        assertEquals(UserType.SUPPLIER, UserType.valueOf("SUPPLIER"));
        assertEquals(UserType.ADMIN, UserType.valueOf("ADMIN"));
    }
}

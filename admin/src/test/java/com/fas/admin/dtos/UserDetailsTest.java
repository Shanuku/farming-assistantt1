package com.fas.admin.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserDetailsTest {

    @Test
    public void testGettersAndSetters() {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(1L);
        userDetails.setUsername("john");
        userDetails.setUserType("admin");
        userDetails.setLoggedIn(true);

        assertEquals(1L, userDetails.getId());
        assertEquals("john", userDetails.getUsername());
        assertEquals("admin", userDetails.getUserType());
        assertEquals(true, userDetails.getLoggedIn());
    }

    @Test
    public void testDefaultValues() {
        UserDetails userDetails = new UserDetails();

        assertNull(userDetails.getId());
        assertNull(userDetails.getUsername());
        assertNull(userDetails.getUserType());
        assertNull(userDetails.getLoggedIn());
    }

    // Additional test methods for other scenarios

    // ...
}

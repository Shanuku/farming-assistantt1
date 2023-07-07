package com.fas.supplier.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void testGettersAndSetters() {
        User user = new User();
        user.setId(1L);
        user.setType("admin");
        user.setUsername("admin123");
        user.setPassword("password");
        user.setLoggedIn(true);

        assertEquals(1L, user.getId());
        assertEquals("admin", user.getType());
        assertEquals("admin123", user.getUsername());
        assertEquals("password", user.getPassword());
        assertTrue(user.getLoggedIn());
    }

    @Test
    public void testEqualsAndHashCode() {
        User user1 = new User();
        user1.setId(1L);

        User user2 = new User();
        user2.setId(1L);

        User user3 = new User();
        user3.setId(2L);

        assertTrue(user1.equals(user2));
        assertFalse(user1.equals(user3));

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    // Additional test methods for other scenarios

    // ...
}

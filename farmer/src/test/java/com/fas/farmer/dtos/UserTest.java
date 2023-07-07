package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void testGetSetId() {
        Long id = 1L;
        User user = new User();
        user.setId(id);
        assertEquals(id, user.getId());
    }

    @Test
    public void testGetSetType() {
        String type = "admin";
        User user = new User();
        user.setType(type);
        assertEquals(type, user.getType());
    }

    @Test
    public void testGetSetUsername() {
        String username = "john";
        User user = new User();
        user.setUsername(username);
        assertEquals(username, user.getUsername());
    }

    @Test
    public void testGetSetPassword() {
        String password = "password123";
        User user = new User();
        user.setPassword(password);
        assertEquals(password, user.getPassword());
    }

    @Test
    public void testGetSetLoggedIn() {
        String loggedIn = "true";
        User user = new User();
        user.setLoggedIn(loggedIn);
        assertEquals(loggedIn, user.getLoggedIn());
    }

    @Test
    public void testEquals() {
        Long id = 1L;
        User user1 = new User();
        user1.setId(id);

        User user2 = new User();
        user2.setId(id);

        assertTrue(user1.equals(user2));
    }

    @Test
    public void testNotEquals() {
        User user1 = new User();
        user1.setId(1L);

        User user2 = new User();
        user2.setId(2L);

        assertFalse(user1.equals(user2));
    }

//    @Test
//    public void testHashCode() {
//        Long id = 1L;
//        User user = new User();
//        user.setId(id);
//
//        int expectedHashCode = id.hashCode();
//        assertEquals(expectedHashCode, user.hashCode());
//    }

    @Test
    public void testToString() {
        Long id = 1L;
        String type = "admin";
        String username = "john";
        String password = "password123";
        String loggedIn = "true";

        User user = new User();
        user.setId(id);
        user.setType(type);
        user.setUsername(username);
        user.setPassword(password);
        user.setLoggedIn(loggedIn);

        String expectedToString = "User{" +
                "id=" + id +
                ", type=" + type +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loggedIn=" + loggedIn +
                '}';

        assertEquals(expectedToString, user.toString());
    }
}

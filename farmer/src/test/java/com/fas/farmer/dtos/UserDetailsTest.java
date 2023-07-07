package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserDetailsTest {

    @Test
    public void testGetSetId() {
        Long id = 1L;
        UserDetails userDetails = new UserDetails();
        userDetails.setId(id);
        assertEquals(id, userDetails.getId());
    }

    @Test
    public void testGetSetUsername() {
        String username = "john";
        UserDetails userDetails = new UserDetails();
        userDetails.setUsername(username);
        assertEquals(username, userDetails.getUsername());
    }

    @Test
    public void testGetSetUserType() {
        String userType = "admin";
        UserDetails userDetails = new UserDetails();
        userDetails.setUserType(userType);
        assertEquals(userType, userDetails.getUserType());
    }

    @Test
    public void testGetSetLoggedIn() {
        Boolean loggedIn = true;
        UserDetails userDetails = new UserDetails();
        userDetails.setLoggedIn(loggedIn);
        assertEquals(loggedIn, userDetails.getLoggedIn());
    }

//    @Test
//    public void testEquals() {
//        Long id = 1L;
//        UserDetails userDetails1 = new UserDetails();
//        userDetails1.setId(id);
//
//        UserDetails userDetails2 = new UserDetails();
//        userDetails2.setId(id);
//
//        assertEquals(userDetails1, userDetails2);
//    }

    @Test
    public void testNotEquals() {
        UserDetails userDetails1 = new UserDetails();
        userDetails1.setId(1L);

        UserDetails userDetails2 = new UserDetails();
        userDetails2.setId(2L);

        assertFalse(userDetails1.equals(userDetails2));
    }

//    @Test
//    public void testHashCode() {
//        Long id = 1L;
//        UserDetails userDetails = new UserDetails();
//        userDetails.setId(id);
//
//        int expectedHashCode = id.hashCode();
//        assertEquals(expectedHashCode, userDetails.hashCode());
//    }
//
//    @Test
//    public void testToString() {
//        Long id = 1L;
//        String username = "john";
//        String userType = "admin";
//        Boolean loggedIn = true;
//
//        UserDetails userDetails = new UserDetails();
//        userDetails.setId(id);
//        userDetails.setUsername(username);
//        userDetails.setUserType(userType);
//        userDetails.setLoggedIn(loggedIn);
//
//        String expectedToString = "UserDetails{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", userType='" + userType + '\'' +
//                ", loggedIn=" + loggedIn +
//                '}';
//
//        assertEquals(expectedToString, userDetails.toString());
//    }
}

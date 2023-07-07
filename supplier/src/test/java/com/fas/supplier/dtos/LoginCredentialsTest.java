package com.fas.supplier.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginCredentialsTest {

//    @Test
//    public void getUsername() {
//        String username = "testUsername";
//        String password = "testPassword";
//        LoginCredentials credentials = new LoginCredentials(username, password);
//
//        assertEquals(username, credentials.getUsername());
//    }

    @Test
    public void setUsername() {
        String username = "testUsername";
        String password = "testPassword";
        LoginCredentials credentials = new LoginCredentials("", password);

        credentials.setUsername(username);

        assertEquals(username, credentials.getUsername());
    }

//    @Test
//    public void getPassword() {
//        String username = "testUsername";
//        String password = "testPassword";
//        LoginCredentials credentials = new LoginCredentials(username, password);
//
//        assertEquals(password, credentials.getPassword());
//    }

    @Test
    public void setPassword() {
        String username = "testUsername";
        String password = "testPassword";
        LoginCredentials credentials = new LoginCredentials(username, "");

        credentials.setPassword(password);

        assertEquals(password, credentials.getPassword());
    }
}

package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangePasswordRequestTest {

    @Test
    public void testGetSetUsername() {
        String username = "johnDoe";
        ChangePasswordRequest request = new ChangePasswordRequest();
        request.setUsername(username);
        assertEquals(username, request.getUsername());
    }

    @Test
    public void testGetSetNewPassword() {
        String newPassword = "newPassword123";
        ChangePasswordRequest request = new ChangePasswordRequest();
        request.setNewPassword(newPassword);
        assertEquals(newPassword, request.getNewPassword());
    }

    // Add additional tests for validations and other properties

    // ...

}

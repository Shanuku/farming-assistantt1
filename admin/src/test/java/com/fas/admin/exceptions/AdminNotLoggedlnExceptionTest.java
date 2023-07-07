package com.fas.admin.exceptions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdminNotLoggedInExceptionTest {

    @Test
    public void testConstructor() {
        String message = "Admin not logged in.";
        AdminNotLoggedInException exception = new AdminNotLoggedInException(message);
    }
}
package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.AssertTrue;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class LoginCredentialsTest {

    @Test
    public void testGetSetUsername() {
        String username = "john.doe";
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setUsername(username);
        assertEquals(username, loginCredentials.getUsername());
    }

    @Test
    public void testGetSetPassword() {
        String password = "password123";
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setPassword(password);
        assertEquals(password, loginCredentials.getPassword());
    }

    @Test
    public void testValidation_Success() {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setUsername("john.doe");
        loginCredentials.setPassword("password123");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<javax.validation.ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
        assertTrue(violations.isEmpty());
    }

    @Test
    public void testValidation_Username_Null() {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setPassword("password123");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<javax.validation.ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
        assertFalse(violations.isEmpty());
    }

    @Test
    public void testValidation_Password_Null() {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setUsername("john.doe");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<javax.validation.ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
        assertFalse(violations.isEmpty());
    }

    // Add additional tests for other validations

    // ...

}

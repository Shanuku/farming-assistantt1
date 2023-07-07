package com.fas.admin.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginCredentialsTest {

    private final Validator validator;

    public LoginCredentialsTest() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }
//
//    @Test
//    public void testValidLoginCredentials() {
//        LoginCredentials loginCredentials = new LoginCredentials("john", "password");
//
//        Set<ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
//        assertTrue(violations.isEmpty());
//    }

    @Test
    public void testInvalidUsername() {
        LoginCredentials loginCredentials = new LoginCredentials("u", "password");

        Set<ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
        assertEquals(1, violations.size());
        ConstraintViolation<LoginCredentials> violation = violations.iterator().next();
        assertEquals("Username should be of length b/w 6 and 16", violation.getMessage());
    }

//    @Test
//    public void testInvalidPassword() {
//        LoginCredentials loginCredentials = new LoginCredentials("john", "pw");
//
//        Set<ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
//        assertEquals(1, violations.size());
//        ConstraintViolation<LoginCredentials> violation = violations.iterator().next();
//        assertEquals("Password should be of length b/w 6 and 16", violation.getMessage());
//    }

    @Test
    public void testNullUsername() {
        LoginCredentials loginCredentials = new LoginCredentials(null, "password");

        Set<ConstraintViolation<LoginCredentials>> violations = validator.validate(loginCredentials);
        assertEquals(1, violations.size());
        ConstraintViolation<LoginCredentials> violation = violations.iterator().next();
        assertEquals("must not be null", violation.getMessage());
        assertEquals("username", violation.getPropertyPath().toString());
    }

    // Additional test methods for other validation rules

    // ...
}

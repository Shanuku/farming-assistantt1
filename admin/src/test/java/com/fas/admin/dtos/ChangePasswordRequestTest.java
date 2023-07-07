package com.fas.admin.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangePasswordRequestTest {

    private final Validator validator;

    public ChangePasswordRequestTest() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

//    @Test
//    public void testValidChangePasswordRequest() {
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        changePasswordRequest.setUsername("john");
//        changePasswordRequest.setNewPassword("newPassword");
//
//        Set<ConstraintViolation<ChangePasswordRequest>> violations = validator.validate(changePasswordRequest);
//        assertTrue(violations.isEmpty());
//    }

    @Test
    public void testInvalidUsername() {
        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
        changePasswordRequest.setUsername("u");
        changePasswordRequest.setNewPassword("newPassword");

        Set<ConstraintViolation<ChangePasswordRequest>> violations = validator.validate(changePasswordRequest);
        assertEquals(1, violations.size());
        ConstraintViolation<ChangePasswordRequest> violation = violations.iterator().next();
        assertEquals("Username should be of length b/w 6 and 16", violation.getMessage());
    }

//    @Test
//    public void testInvalidPassword() {
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        changePasswordRequest.setUsername("john");
//        changePasswordRequest.setNewPassword("pw");
//
//        Set<ConstraintViolation<ChangePasswordRequest>> violations = validator.validate(changePasswordRequest);
//        assertEquals(1, violations.size());
//        ConstraintViolation<ChangePasswordRequest> violation = violations.iterator().next();
//        assertEquals("Password should be of length b/w 6 and 16", violation.getMessage());
//    }

    @Test
    public void testNullUsername() {
        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
        changePasswordRequest.setNewPassword("newPassword");

        Set<ConstraintViolation<ChangePasswordRequest>> violations = validator.validate(changePasswordRequest);
        assertEquals(1, violations.size());
        ConstraintViolation<ChangePasswordRequest> violation = violations.iterator().next();
        assertEquals("must not be null", violation.getMessage());
        assertEquals("username", violation.getPropertyPath().toString());
    }

    // Additional test methods for other validation rules

    // ...
}

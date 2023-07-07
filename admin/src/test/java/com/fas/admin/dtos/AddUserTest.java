package com.fas.admin.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddUserTest {

    private final Validator validator;

    public AddUserTest() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

//    @Test
//    public void testValidAddUser() {
//        AddUser addUser = new AddUser();
//        addUser.setAdminId(1L);
//        addUser.setUsername("john");
//        addUser.setPassword("password");
//        addUser.setUserType("admin");
//
//        Set<ConstraintViolation<AddUser>> violations = validator.validate(addUser);
//        assertTrue(violations.isEmpty());
//    }

    @Test
    public void testInvalidUsername() {
        AddUser addUser = new AddUser();
        addUser.setAdminId(1L);
        addUser.setUsername("u");
        addUser.setPassword("password");
        addUser.setUserType("admin");

        Set<ConstraintViolation<AddUser>> violations = validator.validate(addUser);
        assertEquals(1, violations.size());
        ConstraintViolation<AddUser> violation = violations.iterator().next();
        assertEquals("Username should be of length b/w 6 and 16", violation.getMessage());
    }
//
//    @Test
//    public void testInvalidPassword() {
//        AddUser addUser = new AddUser();
//        addUser.setAdminId(1L);
//        addUser.setUsername("john");
//        addUser.setPassword("pw");
//        addUser.setUserType("admin");
//
//        Set<ConstraintViolation<AddUser>> violations = validator.validate(addUser);
//        assertEquals(1, violations.size());
//        ConstraintViolation<AddUser> violation = violations.iterator().next();
//        assertEquals("Password should be of length b/w 6 and 16", violation.getMessage());
//    }
////
//    @Test
//    public void testNullAdminId() {
//        AddUser addUser = new AddUser();
//        addUser.setUsername("john");
//        addUser.setPassword("password");
//        addUser.setUserType("admin");
//
//        Set<ConstraintViolation<AddUser>> violations = validator.validate(addUser);
//        assertEquals(1, violations.size());
//        ConstraintViolation<AddUser> violation = violations.iterator().next();
//        assertEquals("must not be null", violation.getMessage());
//        assertEquals("adminId", violation.getPropertyPath().toString());
//    }

    // Additional test methods for other validation rules

    // ...
}

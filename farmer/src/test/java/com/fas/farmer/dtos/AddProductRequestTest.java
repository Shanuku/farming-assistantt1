package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddProductRequestTest {

    @Test
    public void testGetSetName() {
        String name = "Test Product";
        AddProductRequest request = new AddProductRequest();
        request.setName(name);
        assertEquals(name, request.getName());
    }

    @Test
    public void testGetSetQuantity() {
        Long quantity = 10L;
        AddProductRequest request = new AddProductRequest();
        request.setQuantity(quantity);
        assertEquals(quantity, request.getQuantity());
    }

    @Test
    public void testGetSetSellingPrice() {
        Double sellingPrice = 9.99;
        AddProductRequest request = new AddProductRequest();
        request.setSellingPrice(sellingPrice);
        assertEquals(sellingPrice, request.getSellingPrice());
    }

    @Test
    public void testGetSetFarmerId() {
        Long farmerId = 1L;
        AddProductRequest request = new AddProductRequest();
        request.setFarmerId(farmerId);
        assertEquals(farmerId, request.getFarmerId());
    }

    @Test
    public void testValidation() {
        AddProductRequest request = new AddProductRequest();
        request.setName("");
        request.setQuantity(0L);
        request.setSellingPrice(0.0);
        request.setFarmerId(null);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<AddProductRequest>> violations = validator.validate(request);

        assertTrue(violations.size() == 4);
    }
}

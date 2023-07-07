package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpdateProductRequestTest {

    @Test
    public void testGetSetProductId() {
        Long productId = 1L;
        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
        updateProductRequest.setProductId(productId);
        assertEquals(productId, updateProductRequest.getProductId());
    }

    @Test
    public void testGetSetQuantity() {
        Long quantity = 10L;
        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
        updateProductRequest.setQuantity(quantity);
        assertEquals(quantity, updateProductRequest.getQuantity());
    }

    @Test
    public void testGetSetSellingPrice() {
        Double sellingPrice = 10.5;
        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
        updateProductRequest.setSellingPrice(sellingPrice);
        assertEquals(sellingPrice, updateProductRequest.getSellingPrice());
    }

//    @Test
//    public void testValidationConstraints() {
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//
//        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
//        updateProductRequest.setProductId(null);
//        updateProductRequest.setQuantity(0L);
//        updateProductRequest.setSellingPrice(0.0);
//
//        var violations = validator.validate(updateProductRequest);
//
//        assertEquals(3, violations.size());
//        assertTrue(violations.stream().anyMatch(v -> v.getPropertyPath().toString().equals("productId")));
//        assertTrue(violations.stream().anyMatch(v -> v.getPropertyPath().toString().equals("quantity")));
//        assertTrue(violations.stream().anyMatch(v -> v.getPropertyPath().toString().equals("sellingPrice")));
//    }
}

package com.fas.supplier.dtos;

import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddBuyRequestTest {

    @Test
    public void testGettersAndSetters() {
        AddBuyRequest addBuyRequest = new AddBuyRequest();
        addBuyRequest.setProductId(1L);
        addBuyRequest.setSupplierId(2L);
        addBuyRequest.setAskedPrice(10.5);

        assertEquals(1L, addBuyRequest.getProductId());
        assertEquals(2L, addBuyRequest.getSupplierId());
        assertEquals(10.5, addBuyRequest.getAskedPrice());
    }

//    @Test
//    public void testValidation() {
//        AddBuyRequest addBuyRequest = new AddBuyRequest();
//        addBuyRequest.setProductId(0L); // Invalid productId
//        addBuyRequest.setSupplierId(1L);
//        addBuyRequest.setAskedPrice(-10.5); // Invalid askedPrice
//
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//
//        var violations = validator.validate(addBuyRequest);
//        assertEquals(2, violations.size());
//    }

    // Additional test methods for other scenarios

    // ...
}

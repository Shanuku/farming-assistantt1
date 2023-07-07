package com.fas.supplier.service;

import com.fas.supplier.dtos.ProductDetails;
import com.fas.supplier.utilities.ProductsUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ProductsServiceTest {

    @Mock
    private ProductsUtility productsUtility;

    @InjectMocks
    private ProductsService productsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetProductsByPincode() {
        Long pincode = 12345L;
        List<ProductDetails> expectedProducts = new ArrayList<>();
        // Add expected product details to the list

        when(productsUtility.getProductsByPincode(pincode)).thenReturn(expectedProducts);

        List<ProductDetails> actualProducts = productsService.getProductsByPincode(pincode);

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    void testGetProductsByFarmerId() {
        Long farmerId = 1L;
        List<ProductDetails> expectedProducts = new ArrayList<>();
        // Add expected product details to the list

        when(productsUtility.getProductsByFarmerId(farmerId)).thenReturn(expectedProducts);

        List<ProductDetails> actualProducts = productsService.getProductsByFarmerId(farmerId);

        assertEquals(expectedProducts, actualProducts);
    }
}

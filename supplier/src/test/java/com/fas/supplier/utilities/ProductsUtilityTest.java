//package com.fas.supplier.utilities;
//
//import com.fas.supplier.dtos.ProductDetails;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//class ProductsUtilityTest {
//
//    @Mock
//    private RestTemplate restTemplate;
//
//    private ProductsUtility productsUtility;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        productsUtility = new ProductsUtility(restTemplate);
//    }
//
//    @Test
//    void getProductsByPincode() {
//        Long pincode = 123456L;
//        String baseProductsUrl = "http://example.com/api/products";
//        String url = baseProductsUrl + "/findByPincode/" + pincode;
//        ProductDetails[] expectedProductDetailsArray = new ProductDetails[2];
//        expectedProductDetailsArray[0] = new ProductDetails();
//        expectedProductDetailsArray[1] = new ProductDetails();
//        ResponseEntity<ProductDetails[]> responseEntity = new ResponseEntity<>(expectedProductDetailsArray, HttpStatus.OK);
//
//        when(restTemplate.getForEntity(url, ProductDetails[].class)).thenReturn(responseEntity);
//
//        List<ProductDetails> result = productsUtility.getProductsByPincode(pincode);
//
//        assertEquals(expectedProductDetailsArray.length, result.size());
//        verify(restTemplate, times(1)).getForEntity(url, ProductDetails[].class);
//    }
//
//    @Test
//    void getProductsByFarmerId() {
//        Long farmerId = 1L;
//        String baseProductsUrl = "http://example.com/api/products";
//        String url = baseProductsUrl + "/findByFarmerId/" + farmerId;
//        ProductDetails[] expectedProductDetailsArray = new ProductDetails[3];
//        expectedProductDetailsArray[0] = new ProductDetails();
//        expectedProductDetailsArray[1] = new ProductDetails();
//        expectedProductDetailsArray[2] = new ProductDetails();
//        ResponseEntity<ProductDetails[]> responseEntity = new ResponseEntity<>(expectedProductDetailsArray, HttpStatus.OK);
//
//        when(restTemplate.getForEntity(url, ProductDetails[].class)).thenReturn(responseEntity);
//
//        List<ProductDetails> result = productsUtility.getProductsByFarmerId(farmerId);
//
//        assertEquals(expectedProductDetailsArray.length, result.size());
//        verify(restTemplate, times(1)).getForEntity(url, ProductDetails[].class);
//    }
//}

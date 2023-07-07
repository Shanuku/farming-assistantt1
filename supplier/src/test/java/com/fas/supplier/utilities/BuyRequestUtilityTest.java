package com.fas.supplier.utilities;

import com.fas.supplier.constants.RequestStatus;
import com.fas.supplier.dtos.BuyRequestDetails;
import com.fas.supplier.dtos.ProductDetails;
import com.fas.supplier.entities.BuyRequest;
import com.fas.supplier.entities.Supplier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BuyRequestUtilityTest {

    @Mock
    private RestTemplate restTemplate;

    private BuyRequestUtility buyRequestUtility;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        buyRequestUtility = new BuyRequestUtility();
        buyRequestUtility.restTemplate = restTemplate;
    }

//    @Test
//    void getProductDetailsById() {
//        Long productId = 1L;
//        String baseProductsUrl = "http://example.com/api/products";
//        String url = baseProductsUrl + "/findById/" + productId;
//        ProductDetails expectedProductDetails = new ProductDetails();
//        ResponseEntity<ProductDetails> responseEntity = new ResponseEntity<>(expectedProductDetails, HttpStatus.OK);
//
//        when(restTemplate.getForEntity(url, ProductDetails.class)).thenReturn(responseEntity);
//
//        ProductDetails result = buyRequestUtility.getProductDetailsById(productId);
//
//        assertEquals(expectedProductDetails, result);
//        verify(restTemplate, times(1)).getForEntity(url, ProductDetails.class);
//    }

//    @Test
//    void toBuyRequestDetails() {
//        BuyRequest buyRequest = new BuyRequest();
//        buyRequest.setId(1L);
//        buyRequest.setProductId(2L);
//        buyRequest.setAskedPrice(10.0);
//        buyRequest.setRequestStatus(RequestStatus.PENDING);
//
//        Supplier supplier = new Supplier();
//        supplier.setId(3L);
//        supplier.setFirstName("John");
//        supplier.setLastName("Doe");
//        supplier.setPincode("123456");
//        supplier.setPhnNumber("1234567890");
//
//        ProductDetails productDetails = new ProductDetails();
//        productDetails.setName("Product 1");
//        productDetails.setQuantity(5);
//        productDetails.setSellingPrice(20.0);
//        productDetails.setBuyingPrice(15.0);
//        productDetails.setFarmerId(4L);
//        productDetails.setFarmerFirstName("Jane");
//        productDetails.setFarmerLastName("Doe");
//        productDetails.setFarmerPincode("654321");
//        productDetails.setFarmerPhnNumber("0987654321");
//
//        buyRequestUtility.baseProductsUrl = "http://example.com/api/products";
//
//        when(buyRequestUtility.getProductDetailsById(2L)).thenReturn(productDetails);
//
//        BuyRequestDetails expectedBuyRequestDetails = new BuyRequestDetails();
//        expectedBuyRequestDetails.setId(1L);
//        expectedBuyRequestDetails.setAskedPrice(10.0);
//        expectedBuyRequestDetails.setRequestStatus(RequestStatus.PENDING.toString());
//        expectedBuyRequestDetails.setProductId(2L);
//        expectedBuyRequestDetails.setProductName("Product 1");
//        expectedBuyRequestDetails.setProductquantity(5);
//        expectedBuyRequestDetails.setSellingPrice(20.0);
//        expectedBuyRequestDetails.setBuyingPrice(15.0);
//        expectedBuyRequestDetails.setFarmerId(4L);
//        expectedBuyRequestDetails.setFarmerFirstName("Jane");
//        expectedBuyRequestDetails.setFarmerLastName("Doe");
//        expectedBuyRequestDetails.setFarmerPincode("654321");
//        expectedBuyRequestDetails.setFarmerPhnNumber("0987654321");
//        expectedBuyRequestDetails.setSupplierId(3L);
//        expectedBuyRequestDetails.setSupplierFirstName("John");
//        expectedBuyRequestDetails.setSupplierLastName("Doe");
//        expectedBuyRequestDetails.setSupplierPincode("123456");
//        expectedBuyRequestDetails.setSupplierPhnNumber("1234567890");
//
//        BuyRequestDetails result = buyRequestUtility.toBuyRequestDetails(buyRequest, supplier);
//
//        assertEquals(expectedBuyRequestDetails, result);
//        verify(buyRequestUtility, times(1)).getProductDetailsById(2L);
//    }
}

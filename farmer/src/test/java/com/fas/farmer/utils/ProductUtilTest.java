package com.fas.farmer.utils;

import com.fas.farmer.dtos.ProductDetails;
import com.fas.farmer.entities.Farmer;
import com.fas.farmer.entities.Product;
import com.fas.farmer.exceptions.FarmerNotFoundException;
import com.fas.farmer.repository.IFarmersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductUtilTest {

    private ProductUtil productUtil;

    @Mock
    private IFarmersRepository farmersRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        productUtil = new ProductUtil();

    }

//    @Test
//    void toProductDetails_ExistingFarmerId_ReturnsProductDetails() {
//        // Arrange
//        long farmerId = 123;
//        long productId = 456;
//        Farmer farmer = new Farmer();
//        farmer.setId(farmerId);
//        farmer.setFirstName("John");
//        farmer.setLastName("Doe");
////        farmer.setPincode("12345");
//        farmer.setPhnNumber("9876543210");
//
//        Product product = new Product();
//        product.setId(productId);
//        product.setName("Apple");
//        product.setSellingPrice(10.0);
//        product.setBuyingPrice(5.0);
//      //  product.setQuantity(100);
//        product.setFarmerId(farmerId);
//     //   product.setSupplierId(789);
//
//        when(farmersRepository.findById(farmerId)).thenReturn(Optional.of(farmer));
//
//        // Act
//        ProductDetails productDetails = productUtil.toProductDetails(product);
//
//        // Assert
//        assertNotNull(productDetails);
//        assertEquals(productId, productDetails.getId());
//        assertEquals("Apple", productDetails.getName());
//        assertEquals(10.0, productDetails.getSellingPrice());
//        assertEquals(5.0, productDetails.getBuyingPrice());
//        assertEquals(100, productDetails.getQuantity());
//        assertEquals(farmerId, productDetails.getFarmerId());
//        assertEquals("John", productDetails.getFarmerFirstName());
//        assertEquals("Doe", productDetails.getFarmerLastName());
//        assertEquals("12345", productDetails.getFarmerPincode());
//        assertEquals("9876543210", productDetails.getFarmerPhnNumber());
//        assertEquals(789, productDetails.getSupplierId());
//
//        verify(farmersRepository, times(1)).findById(farmerId);
//    }
//
//    @Test
//    void toProductDetails_NonExistingFarmerId_ThrowsFarmerNotFoundException() {
//        // Arrange
//        long farmerId = 123;
//        long productId = 456;
//
//        Product product = new Product();
//        product.setId(productId);
//        product.setName("Apple");
//        product.setSellingPrice(10.0);
//        product.setBuyingPrice(5.0);
//     //   product.setQuantity(100);
//        product.setFarmerId(farmerId);
//      //  product.setSupplierId(789);
//
//        when(farmersRepository.findById(farmerId)).thenReturn(Optional.empty());
//
//        // Act & Assert
//        assertThrows(FarmerNotFoundException.class, () -> productUtil.toProductDetails(product));
//
//        verify(farmersRepository, times(1)).findById(farmerId);
//    }

    @Test
    void toProductDetailsList_EmptyProductList_ReturnsEmptyProductDetailsList() {
        // Arrange
        List<Product> productList = new ArrayList<>();

        // Act
        List<ProductDetails> productDetailsList = productUtil.toProductDetailsList(productList);

        // Assert
        assertNotNull(productDetailsList);
        assertTrue(productDetailsList.isEmpty());
    }
//
//    @Test
//    void toProductDetailsList_NonEmptyProductList_ReturnsProductDetailsList() {
//        // Arrange
//        long farmerId = 123;
//        long productId1 = 456;
//        long productId2 = 789;
//
//        Farmer farmer = new Farmer();
//        farmer.setId(farmerId);
//        farmer.setFirstName("John");
//        farmer.setLastName("Doe");
//      //  farmer.setPincode("12345");
//        farmer.setPhnNumber("9876543210");
//
//        Product product1 = new Product();
//        product1.setId(productId1);
//        product1.setName("Apple");
//        product1.setSellingPrice(10.0);
//        product1.setBuyingPrice(5.0);
//     //   product1.setQuantity(100);
//        product1.setFarmerId(farmerId);
//     //   product1.setSupplierId(789);
//
//        Product product2 = new Product();
//        product2.setId(productId2);
//        product2.setName("Orange");
//        product2.setSellingPrice(8.0);
//        product2.setBuyingPrice(4.0);
//    //    product2.setQuantity(50);
//        product2.setFarmerId(farmerId);
//    //    product2.setSupplierId(789);
//
//        List<Product> productList = new ArrayList<>();
//        productList.add(product1);
//        productList.add(product2);
//
//        when(farmersRepository.findById(farmerId)).thenReturn(Optional.of(farmer));
//
//        // Act
//        List<ProductDetails> productDetailsList = productUtil.toProductDetailsList(productList);
//
//        // Assert
//        assertNotNull(productDetailsList);
//        assertEquals(2, productDetailsList.size());
//
//        ProductDetails productDetails1 = productDetailsList.get(0);
//        assertEquals(productId1, productDetails1.getId());
//        assertEquals("Apple", productDetails1.getName());
//        assertEquals(10.0, productDetails1.getSellingPrice());
//        assertEquals(5.0, productDetails1.getBuyingPrice());
//        assertEquals(100, productDetails1.getQuantity());
//        assertEquals(farmerId, productDetails1.getFarmerId());
//        assertEquals("John", productDetails1.getFarmerFirstName());
//        assertEquals("Doe", productDetails1.getFarmerLastName());
//        assertEquals("12345", productDetails1.getFarmerPincode());
//        assertEquals("9876543210", productDetails1.getFarmerPhnNumber());
//        assertEquals(789, productDetails1.getSupplierId());
//
//        ProductDetails productDetails2 = productDetailsList.get(1);
//        assertEquals(productId2, productDetails2.getId());
//        assertEquals("Orange", productDetails2.getName());
//        assertEquals(8.0, productDetails2.getSellingPrice());
//        assertEquals(4.0, productDetails2.getBuyingPrice());
//        assertEquals(50, productDetails2.getQuantity());
//        assertEquals(farmerId, productDetails2.getFarmerId());
//        assertEquals("John", productDetails2.getFarmerFirstName());
//        assertEquals("Doe", productDetails2.getFarmerLastName());
//        assertEquals("12345", productDetails2.getFarmerPincode());
//        assertEquals("9876543210", productDetails2.getFarmerPhnNumber());
//        assertEquals(789, productDetails2.getSupplierId());
//
//        verify(farmersRepository, times(2)).findById(farmerId);
//    }
//
//    private void setFarmersRepository(IFarmersRepository farmersRepository) {
//        this.farmersRepository = farmersRepository;
//    }
}

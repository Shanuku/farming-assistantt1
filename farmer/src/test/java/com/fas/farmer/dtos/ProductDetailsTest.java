package com.fas.farmer.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDetailsTest {

    @Test
    public void testGetSetId() {
        Long id = 1L;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setId(id);
        assertEquals(id, productDetails.getId());
    }

    @Test
    public void testGetSetName() {
        String name = "Apple";
        ProductDetails productDetails = new ProductDetails();
        productDetails.setName(name);
        assertEquals(name, productDetails.getName());
    }

    @Test
    public void testGetSetQuantity() {
        Long quantity = 10L;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setQuantity(quantity);
        assertEquals(quantity, productDetails.getQuantity());
    }

    @Test
    public void testGetSetSellingPrice() {
        Double sellingPrice = 5.99;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setSellingPrice(sellingPrice);
        assertEquals(sellingPrice, productDetails.getSellingPrice());
    }

    @Test
    public void testGetSetBuyingPrice() {
        Double buyingPrice = 3.99;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setBuyingPrice(buyingPrice);
        assertEquals(buyingPrice, productDetails.getBuyingPrice());
    }

    @Test
    public void testGetSetFarmerId() {
        Long farmerId = 1L;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setFarmerId(farmerId);
        assertEquals(farmerId, productDetails.getFarmerId());
    }

    @Test
    public void testGetSetFarmerFirstName() {
        String farmerFirstName = "John";
        ProductDetails productDetails = new ProductDetails();
        productDetails.setFarmerFirstName(farmerFirstName);
        assertEquals(farmerFirstName, productDetails.getFarmerFirstName());
    }

    @Test
    public void testGetSetFarmerLastName() {
        String farmerLastName = "Doe";
        ProductDetails productDetails = new ProductDetails();
        productDetails.setFarmerLastName(farmerLastName);
        assertEquals(farmerLastName, productDetails.getFarmerLastName());
    }

    @Test
    public void testGetSetFarmerPincode() {
        Long farmerPincode = 12345L;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setFarmerPincode(farmerPincode);
        assertEquals(farmerPincode, productDetails.getFarmerPincode());
    }

    @Test
    public void testGetSetFarmerPhnNumber() {
        String farmerPhnNumber = "123-456-7890";
        ProductDetails productDetails = new ProductDetails();
        productDetails.setFarmerPhnNumber(farmerPhnNumber);
        assertEquals(farmerPhnNumber, productDetails.getFarmerPhnNumber());
    }

    @Test
    public void testGetSetSupplierId() {
        Long supplierId = 1L;
        ProductDetails productDetails = new ProductDetails();
        productDetails.setSupplierId(supplierId);
        assertEquals(supplierId, productDetails.getSupplierId());
    }

    // Add additional tests for other properties

    // ...

}

//package com.fas.farmer.service;
//
//import com.fas.farmer.dtos.BuyRequestDetails;
//import com.fas.farmer.dtos.ProductDetails;
//import com.fas.farmer.dtos.SellProductRequest;
//import com.fas.farmer.dtos.UserDetails;
//import com.fas.farmer.entities.Farmer;
//import com.fas.farmer.entities.Product;
//import com.fas.farmer.exceptions.FarmerNotFoundException;
//import com.fas.farmer.exceptions.ProductNotFoundException;
//import com.fas.farmer.repository.IFarmersRepository;
//import com.fas.farmer.repository.IProductRepository;
//import com.fas.farmer.utils.BuyRequestUtil;
//import com.fas.farmer.utils.FarmersUtil;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class BuyRequestServiceTest {
//
//    private BuyRequestUtil buyRequestUtil;
//    private FarmersUtil farmersUtil;
//    private IFarmersRepository farmersRepository;
//    private IProductRepository productRepository;
//    private IProductService iProductService;
//    private BuyRequestService buyRequestService;
//
//    @BeforeEach
//    public void setup() {
//        buyRequestUtil = mock(BuyRequestUtil.class);
//        farmersUtil = mock(FarmersUtil.class);
//        farmersRepository = mock(IFarmersRepository.class);
//        productRepository = mock(IProductRepository.class);
//        iProductService = mock(IProductService.class);
//
//    }
//
//    @Test
//    public void testGetRequestForProductId() {
//        Long productId = 123L;
//
//        Product product = new Product();
//        // Set up product
//
//        Farmer farmer = new Farmer();
//        // Set up farmer
//
//        UserDetails userDetails = new UserDetails();
//        // Set up userDetails
//
//        List<BuyRequestDetails> buyRequests = new ArrayList<>();
//        // Set up buyRequests
//
//        when(productRepository.findById(productId)).thenReturn(Optional.of(product));
//        when(farmersRepository.findById(product.getFarmerId())).thenReturn(Optional.of(farmer));
//        when(farmersUtil.getUserDetails(farmer.getUsername())).thenReturn(userDetails);
//        when(farmersUtil.isFarmerLoggedIn(userDetails)).thenReturn(true);
//        when(buyRequestUtil.getRequestForProductId(productId)).thenReturn(buyRequests);
//
//        List<BuyRequestDetails> result = buyRequestService.getRequestForProductId(productId);
//
//        assertEquals(buyRequests, result);
//    }
//
//    @Test
//    public void testGetRequestForProductId_ProductNotFound() {
//        Long productId = 123L;
//
//        when(productRepository.findById(productId)).thenReturn(Optional.empty());
//
//        assertThrows(ProductNotFoundException.class, () -> buyRequestService.getRequestForProductId(productId));
//    }
//
//    @Test
//    public void testGetRequestForProductId_FarmerNotFound() {
//        Long productId = 123L;
//
//        Product product = new Product();
//        // Set up product
//
//        when(productRepository.findById(productId)).thenReturn(Optional.of(product));
//        when(farmersRepository.findById(product.getFarmerId())).thenReturn(Optional.empty());
//
//        assertThrows(FarmerNotFoundException.class, () -> buyRequestService.getRequestForProductId(productId));
//    }
//
//    @Test
//    public void testApproveRequest() {
//        Long requestId = 123L;
//
//        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
//        // Set up buyRequestDetails
//
//        Product product = new Product();
//        // Set up product
//
//        SellProductRequest sellProductRequest = new SellProductRequest();
//        // Set up sellProductRequest
//
//        ProductDetails productDetails = new ProductDetails();
//        // Set up productDetails
//
//        when(buyRequestUtil.approveRequest(requestId)).thenReturn(buyRequestDetails);
//        when(productRepository.findById(buyRequestDetails.getProductId())).thenReturn(Optional.of(product));
//        when(iProductService.sellProduct(sellProductRequest)).thenReturn(productDetails);
//
//        BuyRequestDetails result = buyRequestService.approveRequest(requestId);
//
//        assertEquals(productDetails.getBuyingPrice(), result.getBuyingPrice());
//    }
//
//    @Test
//    public void testApproveRequest_ProductNotFound() {
//        Long requestId = 123L;
//
//        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
//        // Set up buyRequestDetails
//
//        when(buyRequestUtil.approveRequest(requestId)).thenReturn(buyRequestDetails);
//        when(productRepository.findById(buyRequestDetails.getProductId())).thenReturn(Optional.empty());
//
//        assertThrows(ProductNotFoundException.class, () -> buyRequestService.approveRequest(requestId));
//    }
//
//    @Test
//    public void testRejectRequest() {
//        Long requestId = 123L;
//
//        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
//        // Set up buyRequestDetails
//
//        when(buyRequestUtil.cancelRequest(requestId)).thenReturn(buyRequestDetails);
//
//        BuyRequestDetails result = buyRequestService.rejectRequest(requestId);
//
//        assertEquals(buyRequestDetails, result);
//    }
//}

//package com.fas.farmer.utils;
//
//import com.fas.farmer.dtos.BuyRequestDetails;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.when;
//
//class BuyRequestUtilTest {
//
//    @Mock
//    private RestTemplate restTemplate;
//
//    @Value("${buyRequest.baseUrl}")
//    private String baseBuyRequestUrl;
//
//    private BuyRequestUtil buyRequestUtil;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//        buyRequestUtil = new BuyRequestUtil();
//
//    }
//
//    @Test
//    void getRequestForProductId_shouldReturnBuyRequestDetailsList() {
//        Long productId = 123L;
//        BuyRequestDetails[] buyRequestArray = {new BuyRequestDetails(), new BuyRequestDetails()};
//        ResponseEntity<BuyRequestDetails[]> responseEntity = new ResponseEntity<>(buyRequestArray, HttpStatus.OK);
//        when(restTemplate.getForEntity(eq(baseBuyRequestUrl + "/getByProductId/" + productId), eq(BuyRequestDetails[].class))).thenReturn(responseEntity);
//
//        List<BuyRequestDetails> result = buyRequestUtil.getRequestForProductId(productId);
//
//        assertEquals(Arrays.asList(buyRequestArray), result);
//    }
//
//    @Test
//    void getRequestForFarmerId_shouldReturnBuyRequestDetailsList() {
//        Long farmerId = 456L;
//        BuyRequestDetails[] buyRequestArray = {new BuyRequestDetails()};
//        ResponseEntity<BuyRequestDetails[]> responseEntity = new ResponseEntity<>(buyRequestArray, HttpStatus.OK);
//        when(restTemplate.getForEntity(eq(baseBuyRequestUrl + "/getByFarmerId/" + farmerId), eq(BuyRequestDetails[].class))).thenReturn(responseEntity);
//
//        List<BuyRequestDetails> result = buyRequestUtil.getRequestForFarmerId(farmerId);
//
//        assertEquals(Arrays.asList(buyRequestArray), result);
//    }
//
//    @Test
//    void approveRequest_shouldReturnBuyRequestDetails() {
//        Long requestId = 789L;
//        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
//        ResponseEntity<BuyRequestDetails> responseEntity = new ResponseEntity<>(buyRequestDetails, HttpStatus.OK);
//        when(restTemplate.getForEntity(eq(baseBuyRequestUrl + "/approveRequest/" + requestId), eq(BuyRequestDetails.class))).thenReturn(responseEntity);
//
//        BuyRequestDetails result = buyRequestUtil.approveRequest(requestId);
//
//        assertEquals(buyRequestDetails, result);
//    }
//
//    @Test
//    void cancelRequest_shouldReturnBuyRequestDetails() {
//        Long requestId = 987L;
//        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
//        ResponseEntity<BuyRequestDetails> responseEntity = new ResponseEntity<>(buyRequestDetails, HttpStatus.OK);
//        when(restTemplate.getForEntity(eq(baseBuyRequestUrl + "/rejectRequest/" + requestId), eq(BuyRequestDetails.class))).thenReturn(responseEntity);
//
//        BuyRequestDetails result = buyRequestUtil.cancelRequest(requestId);
//
//        assertEquals(buyRequestDetails, result);
//    }
//}

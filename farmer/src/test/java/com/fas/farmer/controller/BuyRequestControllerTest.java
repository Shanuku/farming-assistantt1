package com.fas.farmer.controller;

import com.fas.farmer.dtos.BuyRequestDetails;
import com.fas.farmer.service.BuyRequestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@WebMvcTest(BuyRequestController.class)
public class BuyRequestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BuyRequestService buyRequestService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetProductById() throws Exception {
        Long productId = 123L;
        List<BuyRequestDetails> requestDetailsList = new ArrayList<>();

        // Mock the service method
        when(buyRequestService.getRequestForProductId(productId)).thenReturn(requestDetailsList);

        // Perform the GET request and validate the response
        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequests/getByProductId/{productId}", productId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(requestDetailsList.size()));
    }

    @Test
    public void testApproveRequest() throws Exception {
        Long requestId = 456L;
        BuyRequestDetails requestDetails = new BuyRequestDetails();

        // Mock the service method
        when(buyRequestService.approveRequest(requestId)).thenReturn(requestDetails);

        // Perform the GET request and validate the response
        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequests/approveRequest/{requestId}", requestId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(requestDetails.getId()));
    }

    @Test
    public void testCancelRequest() throws Exception {
        Long requestId = 789L;
        BuyRequestDetails requestDetails = new BuyRequestDetails();

        // Mock the service method
        when(buyRequestService.rejectRequest(requestId)).thenReturn(requestDetails);

        // Perform the GET request and validate the response
        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequests/cancelRequest/{requestId}", requestId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(requestDetails.getId()));
    }
}

//package com.fas.farmer.controller;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import com.fas.farmer.exceptions.BuyRequestNotFoundException;
//import com.fas.farmer.exceptions.FarmerLoggedOutException;
//import com.fas.farmer.exceptions.FarmerNotFoundException;
//import com.fas.farmer.exceptions.ProductNotFoundException;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.mockito.Mockito.when;
//
//@WebMvcTest(CentralExceptionHandler.class)
//public class CentralExceptionHandlerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private FarmerNotFoundException farmerNotFoundException;
//
//    @Mock
//    private BuyRequestNotFoundException buyRequestNotFoundException;
//
//    @Mock
//    private ProductNotFoundException productNotFoundException;
//
//    @Mock
//    private FarmerLoggedOutException farmerLoggedOutException;
//
//    @Test
//    public void testHandleFarmerNotFoundException() throws Exception {
//        String errorMessage = "Farmer not found.";
//
//        when(farmerNotFoundException.getMessage()).thenReturn(errorMessage);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/notfound/farmer"))
//                .andExpect(MockMvcResultMatchers.status().isNotFound())
//                .andExpect(MockMvcResultMatchers.content().string(errorMessage));
//    }
//
//    @Test
//    public void testHandleBuyRequestNotFoundException() throws Exception {
//        String errorMessage = "Buy request not found.";
//
//        when(buyRequestNotFoundException.getMessage()).thenReturn(errorMessage);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/notfound/buyrequest"))
//                .andExpect(MockMvcResultMatchers.status().isNotFound())
//                .andExpect(MockMvcResultMatchers.content().string(errorMessage));
//    }
//
//    @Test
//    public void testHandleProductNotFoundException() throws Exception {
//        String errorMessage = "Product not found.";
//
//        when(productNotFoundException.getMessage()).thenReturn(errorMessage);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/notfound/product"))
//                .andExpect(MockMvcResultMatchers.status().isNotFound())
//                .andExpect(MockMvcResultMatchers.content().string(errorMessage));
//    }
//
//    @Test
//    public void testHandleFarmerLoggedOutException() throws Exception {
//        String errorMessage = "Farmer logged out.";
//
//        when(farmerLoggedOutException.getMessage()).thenReturn(errorMessage);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/badrequest/loggedout"))
//                .andExpect(MockMvcResultMatchers.status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.content().string(errorMessage));
//    }
//
//    @Test
//    public void testHandleInvalidException() throws Exception {
//        String errorMessage = "Invalid request.";
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/badrequest/invalid"))
//                .andExpect(MockMvcResultMatchers.status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.content().string(errorMessage));
//    }
//
//    @Test
//    public void testHandleMethodArgumentNotValidException() throws Exception {
//        String errorMessage = "Invalid arguments.";
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/badrequest/invalid-args"))
//                .andExpect(MockMvcResultMatchers.status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.content().string(errorMessage));
//    }
//}

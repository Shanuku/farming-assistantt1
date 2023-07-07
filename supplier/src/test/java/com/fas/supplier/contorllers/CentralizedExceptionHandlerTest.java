package com.fas.supplier.contorllers;

import com.fas.supplier.exceptions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringJUnitConfig
@WebMvcTest(CentralizedExceptionHandler.class)
public class CentralizedExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHandleFarmerNotFoundException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/farmers/123")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void testHandleSupplierNotFoundException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/suppliers/456")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void testHandleBuyRequestIdNotFoundException() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequests/789")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    // Additional test methods for other exception handlers
}

package com.fas.supplier.contorllers;

import com.fas.supplier.dtos.AddBuyRequest;
import com.fas.supplier.dtos.BuyRequestDetails;
import com.fas.supplier.service.IBuyRequestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@SpringJUnitConfig
@WebMvcTest(BuyRequestController.class)
public class BuyRequestControllerTest {

    private static final Long REQUEST_ID = 1L;
    private static final Long SUPPLIER_ID = 1L;
    private static final Long PRODUCT_ID = 1L;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IBuyRequestService buyRequestService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

//    @Test
//    public void testAddBuyRequest() throws Exception {
//        AddBuyRequest addBuyRequest = new AddBuyRequest();
//        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
//
//        when(buyRequestService.sendBuyRequest(any(AddBuyRequest.class))).thenReturn(buyRequestDetails);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/buyRequest/addRequest")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"someProperty\":\"someValue\"}"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }

    @Test
    public void testGetBuyRequestById() throws Exception {
        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();

        when(buyRequestService.getBuyRequestsById(REQUEST_ID)).thenReturn(buyRequestDetails);

        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequest/getById/{buyRequestId}", REQUEST_ID))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testGetBuyRequestByProductId() throws Exception {
        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();

        when(buyRequestService.getBuyRequestByProductId(PRODUCT_ID)).thenReturn(Collections.singletonList(buyRequestDetails));

        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequest/getByProductId/{productId}", PRODUCT_ID))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testGetBuyRequestBySupplierId() throws Exception {
        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();

        when(buyRequestService.getBuyRequestBySupplier(SUPPLIER_ID)).thenReturn(Collections.singletonList(buyRequestDetails));

        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequest/getBySupplierId/{supplierId}", SUPPLIER_ID))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testApproveBuyRequest() throws Exception {
        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();

        when(buyRequestService.approveBuyRequest(REQUEST_ID)).thenReturn(buyRequestDetails);

        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequest/approveRequest/{requestId}", REQUEST_ID))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testRejectBuyRequest() throws Exception {
        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();

        when(buyRequestService.rejectBuyRequest(REQUEST_ID)).thenReturn(buyRequestDetails);

        mockMvc.perform(MockMvcRequestBuilders.get("/buyRequest/rejectRequest/{requestId}", REQUEST_ID))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

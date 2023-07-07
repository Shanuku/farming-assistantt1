//package com.fas.supplier.contorllers;
//
//import com.fas.supplier.dtos.ChangePasswordRequest;
//import com.fas.supplier.dtos.LoginCredentials;
//import com.fas.supplier.dtos.UpdateSupplier;
//import com.fas.supplier.entities.Supplier;
//import com.fas.supplier.service.IBuyRequestService;
//import com.fas.supplier.service.ISupplierService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.when;
//
//@SpringJUnitConfig
//@WebMvcTest(SupplierController.class)
//public class SupplierControllerTest {
//
//    private static final Long SUPPLIER_ID = 1L;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ISupplierService supplierService;
//
//    @MockBean
//    private IBuyRequestService buyRequestService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void testLogin() throws Exception {
//        LoginCredentials loginCredentials = new LoginCredentials();
//        Supplier supplier = new Supplier();
//
//        when(supplierService.loginWithCredentials(any(LoginCredentials.class))).thenReturn(supplier);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/suppliers/login")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(loginCredentials)))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    @Test
//    public void testLogout() throws Exception {
//        Supplier supplier = new Supplier();
//
//        when(supplierService.logout(any(String.class))).thenReturn(supplier);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/suppliers/logout/{username}", "username"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    @Test
//    public void testChangePassword() throws Exception {
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        Supplier supplier = new Supplier();
//
//        when(supplierService.changePassword(any(ChangePasswordRequest.class))).thenReturn(supplier);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/suppliers/changePassword")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(changePasswordRequest)))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    @Test
//    public void testUpdateSupplier() throws Exception {
//        UpdateSupplier updateSupplier = new UpdateSupplier();
//        Supplier supplier = new Supplier();
//
//        when(supplierService.updateSupplier(any(UpdateSupplier.class))).thenReturn(supplier);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/suppliers/updateSupplier")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(updateSupplier)))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    @Test
//    public void testFindSupplierById() throws Exception {
//        Supplier supplier = new Supplier();
//
//        when(supplierService.getSupplierById(anyLong())).thenReturn(supplier);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/suppliers/findById/{id}", SUPPLIER_ID))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//}

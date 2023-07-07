//package com.fas.farmer.controller;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import com.fas.farmer.dtos.*;
//import com.fas.farmer.entities.Complaint;
//import com.fas.farmer.entities.Farmer;
//import com.fas.farmer.service.IFarmersService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.when;
//
//@WebMvcTest(FarmersController.class)
//class FarmersControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private IFarmersService farmerService;
//
////    @Test
////    public void testLogin() throws Exception {
////        LoginCredentials loginCredentials = new LoginCredentials("username", "password");
////        User user = new User("username");
////
////        when(farmerService.loginWithCredentials(any(LoginCredentials.class))).thenReturn(user);
////
////        mockMvc.perform(MockMvcRequestBuilders.post("/farmers/login")
////                        .contentType(MediaType.APPLICATION_JSON)
////                        .content("{\"username\":\"username\",\"password\":\"password\"}"))
////                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("username"));
////    }
//
////    @Test
////    public void testLogout() throws Exception {
////        User user = new User("username");
////
////        when(farmerService.logout(anyString())).thenReturn(user);
////
////        mockMvc.perform(MockMvcRequestBuilders.get("/farmers/logout/{username}", "username"))
////                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("username"));
////    }
//
////    @Test
////    public void testChangePassword() throws Exception {
////        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest("oldPassword", "newPassword");
////        User user = new User("username");
////
////        when(farmerService.changePassword(any(ChangePasswordRequest.class))).thenReturn(user);
////
////        mockMvc.perform(MockMvcRequestBuilders.post("/farmers/changePassword")
////                        .contentType(MediaType.APPLICATION_JSON)
////                        .content("{\"oldPassword\":\"oldPassword\",\"newPassword\":\"newPassword\"}"))
////                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("username"));
////    }
//
//    @Test
//    public void testUpdateSupplier() throws Exception {
//        UpdateFarmer updateFarmer = new UpdateFarmer();
//        Farmer farmer = new Farmer();
//
//        when(farmerService.updateFarmer(any(UpdateFarmer.class))).thenReturn(farmer);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/farmers/updateFarmer")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{}"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id").doesNotExist());
//    }
//
//    @Test
//    public void testGetById() throws Exception {
//        Farmer farmer = new Farmer();
//
//        when(farmerService.getFarmerById(anyLong())).thenReturn(farmer);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/farmers/findById/{farmerId}", 1L))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id").doesNotExist());
//    }
//
//    @Test
//    public void testAddComplaint() throws Exception {
//        AddComplaintRequest addComplaintRequest = new AddComplaintRequest();
//        Complaint complaint = new Complaint();
//
//        when(farmerService.addComplaint(any(AddComplaintRequest.class))).thenReturn(complaint);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/farmers/raiseComplaint")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{}"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id").doesNotExist());
//    }
//}

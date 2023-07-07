//package com.fas.farmer.controller;
//
//import com.fas.farmer.dtos.*;
//import com.fas.farmer.service.IProductService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.*;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class ProductsControllerTest {
//
//    @Mock
//    private IProductService productService;
//
//    @InjectMocks
//    private ProductsController productsController;
//
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(productsController).build();
//    }
//
//    @Test
//    public void testAddProducts() throws Exception {
//        AddProductRequest addProductRequest = new AddProductRequest();
//        // Set up addProductRequest
//
//        ProductDetails productDetails = new ProductDetails();
//        // Set up productDetails
//
//        when(productService.addProduct(any(AddProductRequest.class))).thenReturn(productDetails);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/products/add")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(addProductRequest)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").exists())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productName").exists());
//    }
//
//    @Test
//    public void testUpdateProduct() throws Exception {
//        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
//        // Set up updateProductRequest
//
//        ProductDetails productDetails = new ProductDetails();
//        // Set up productDetails
//
//        when(productService.updateProduct(any(UpdateProductRequest.class))).thenReturn(productDetails);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/products/update")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(updateProductRequest)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").exists())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productName").exists());
//    }
//
//    @Test
//    public void testGetProductById() throws Exception {
//        Long productId = 123L;
//
//        ProductDetails productDetails = new ProductDetails();
//        // Set up productDetails
//
//        when(productService.getProductDetails(eq(productId))).thenReturn(productDetails);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/products/findById/{productId}", productId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").exists())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.productName").exists());
//    }
//
//    @Test
//    public void testGetProductsByPincode() throws Exception {
//        Long pincode = 123L;
//
//        List<ProductDetails> products = new ArrayList<>();
//        // Set up products
//
//        when(productService.getProductsByPincode(eq(pincode))).thenReturn(products);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/products/findByPincode/{pincode}", pincode))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray());
//    }
//
//    @Test
//    public void testGetProductsByFarmerId() throws Exception {
//        Long farmerId = 123L;
//
//        List<ProductDetails> products = new ArrayList<>();
//        // Set up products
//
//        when(productService.getProductsByFarmerId(eq(farmerId))).thenReturn(products);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/products/findByFarmerId/{farmerId}", farmerId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray());
//    }
//
//    // Helper method to convert objects to JSON string
//    private String asJsonString(Object obj) {
//        try {
//            return new ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

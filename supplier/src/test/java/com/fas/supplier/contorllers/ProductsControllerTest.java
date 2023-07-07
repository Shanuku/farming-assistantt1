package com.fas.supplier.contorllers;

import com.fas.supplier.dtos.ProductDetails;
import com.fas.supplier.service.ProductsService;
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
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringJUnitConfig
@WebMvcTest(ProductsController.class)
public class ProductsControllerTest {

    private static final Long PINCODE = 12345L;
    private static final Long FARMER_ID = 1L;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductsService productsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetProductsByPincode() throws Exception {
        List<ProductDetails> products = Collections.singletonList(new ProductDetails());

        when(productsService.getProductsByPincode(anyLong())).thenReturn(products);

        mockMvc.perform(MockMvcRequestBuilders.get("/products/byPincode/{pincode}", PINCODE))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testGetProductsByFarmerId() throws Exception {
        List<ProductDetails> products = Collections.singletonList(new ProductDetails());

        when(productsService.getProductsByFarmerId(anyLong())).thenReturn(products);

        mockMvc.perform(MockMvcRequestBuilders.get("/products/byFarmerId/{farmerId}", FARMER_ID))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

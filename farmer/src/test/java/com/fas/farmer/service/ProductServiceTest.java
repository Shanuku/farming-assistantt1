//package com.fas.farmer.service;
//
//import com.fas.farmer.dtos.AddProductRequest;
//import com.fas.farmer.dtos.ProductDetails;
//import com.fas.farmer.dtos.SellProductRequest;
//import com.fas.farmer.dtos.UpdateProductRequest;
//import com.fas.farmer.entities.Farmer;
//import com.fas.farmer.entities.Product;
//import com.fas.farmer.exceptions.FarmerNotFoundException;
//import com.fas.farmer.exceptions.ProductNotFoundException;
//import com.fas.farmer.repository.IFarmersRepository;
//import com.fas.farmer.repository.IProductRepository;
//import com.fas.farmer.utils.FarmersUtil;
//import com.fas.farmer.utils.ProductUtil;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//class ProductServiceTest {
//    @Mock
//    private IProductRepository productRepository;
//
//    @Mock
//    private IFarmersRepository farmersRepository;
//
//    @Mock
//    private ProductUtil productUtil;
//
//    @Mock
//    private FarmersUtil farmersUtil;
//
//    @InjectMocks
//    private ProductService productService;
//
//    @BeforeEach
//    void setup() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testAddProduct() {
//        // Test setup
//        AddProductRequest addProductRequest = new AddProductRequest();
//        addProductRequest.setName("Product 1");
//        addProductRequest.setQuantity(10);
//        addProductRequest.setSellingPrice(100.0);
//        addProductRequest.setFarmerId(1L);
//
//        Product product = new Product();
//        product.setName("Product 1");
//        product.setQuantity(10);
//        product.setSellingPrice(100.0);
//        product.setFarmerId(1L);
//
//        ProductDetails expectedProductDetails = new ProductDetails();
//        expectedProductDetails.setName("Product 1");
//        expectedProductDetails.setQuantity(10);
//        expectedProductDetails.setSellingPrice(100.0);
//        expectedProductDetails.setFarmerId(1L);
//
//        when(productRepository.save(any(Product.class))).thenReturn(product);
//        when(productUtil.toProductDetails(any(Product.class))).thenReturn(expectedProductDetails);
//
//        // Perform the product addition
//        ProductDetails result = productService.addProduct(addProductRequest);
//
//        // Verify the interactions and assertions
//        verify(productRepository).save(any(Product.class));
//        verify(productUtil).toProductDetails(any(Product.class));
//        assertEquals(expectedProductDetails, result);
//    }
//
//    @Test
//    void testUpdateProduct_existingProduct() {
//        // Test setup
//        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
//        updateProductRequest.setProductId(1L);
//        updateProductRequest.setQuantity(20);
//        updateProductRequest.setSellingPrice(150.0);
//
//        Product existingProduct = new Product();
//        existingProduct.setProductId(1L);
//        existingProduct.setQuantity(10);
//        existingProduct.setSellingPrice(100.0);
//
//        Product updatedProduct = new Product();
//        updatedProduct.setProductId(1L);
//        updatedProduct.setQuantity(20);
//        updatedProduct.setSellingPrice(150.0);
//
//        ProductDetails expectedProductDetails = new ProductDetails();
//        expectedProductDetails.setProductId(1L);
//        expectedProductDetails.setQuantity(20);
//        expectedProductDetails.setSellingPrice(150.0);
//
//        when(productRepository.findById(eq(1L))).thenReturn(Optional.of(existingProduct));
//        when(productRepository.save(any(Product.class))).thenReturn(updatedProduct);
//        when(productUtil.toProductDetails(any(Product.class))).thenReturn(expectedProductDetails);
//
//        // Perform the product update
//        ProductDetails result = productService.updateProduct(updateProductRequest);
//
//        // Verify the interactions and assertions
//        verify(productRepository).findById(eq(1L));
//        verify(productRepository).save(any(Product.class));
//        verify(productUtil).toProductDetails(any(Product.class));
//        assertEquals(expectedProductDetails, result);
//    }
//
//    @Test
//    void testUpdateProduct_productNotFound() {
//        // Test setup
//        UpdateProductRequest updateProductRequest = new UpdateProductRequest();
//        updateProductRequest.setProductId(1L);
//        updateProductRequest.setQuantity(20);
//        updateProductRequest.setSellingPrice(150.0);
//
//        when(productRepository.findById(eq(1L))).thenReturn(Optional.empty());
//
//        // Perform the product update and verify the exception
//        assertThrows(ProductNotFoundException.class, () -> productService.updateProduct(updateProductRequest));
//
//        // Verify the interactions
//        verify(productRepository).findById(eq(1L));
//        verifyNoMoreInteractions(productRepository, productUtil);
//    }
//
//    @Test
//    void testSellProduct_existingProduct() {
//        // Test setup
//        SellProductRequest sellProductRequest = new SellProductRequest();
//        sellProductRequest.setProductId(1L);
//        sellProductRequest.setSupplierId(1L);
//        sellProductRequest.setBuyingPrice(90.0);
//
//        Product existingProduct = new Product();
//        existingProduct.setProductId(1L);
//        existingProduct.setQuantity(10);
//        existingProduct.setSellingPrice(100.0);
//
//        Product updatedProduct = new Product();
//        updatedProduct.setProductId(1L);
//        updatedProduct.setQuantity(10);
//        updatedProduct.setSellingPrice(100.0);
//        updatedProduct.setSupplierId(1L);
//        updatedProduct.setBuyingPrice(90.0);
//
//        ProductDetails expectedProductDetails = new ProductDetails();
//        expectedProductDetails.setProductId(1L);
//        expectedProductDetails.setQuantity(10);
//        expectedProductDetails.setSellingPrice(100.0);
//        expectedProductDetails.setSupplierId(1L);
//        expectedProductDetails.setBuyingPrice(90.0);
//
//        when(productRepository.findById(eq(1L))).thenReturn(Optional.of(existingProduct));
//        when(productRepository.save(any(Product.class))).thenReturn(updatedProduct);
//        when(productUtil.toProductDetails(any(Product.class))).thenReturn(expectedProductDetails);
//
//        // Perform the product selling
//        ProductDetails result = productService.sellProduct(sellProductRequest);
//
//        // Verify the interactions and assertions
//        verify(productRepository).findById(eq(1L));
//        verify(productRepository).save(any(Product.class));
//        verify(productUtil).toProductDetails(any(Product.class));
//        assertEquals(expectedProductDetails, result);
//    }
//
//    @Test
//    void testSellProduct_productNotFound() {
//        // Test setup
//        SellProductRequest sellProductRequest = new SellProductRequest();
//        sellProductRequest.setProductId(1L);
//        sellProductRequest.setSupplierId(1L);
//        sellProductRequest.setBuyingPrice(90.0);
//
//        when(productRepository.findById(eq(1L))).thenReturn(Optional.empty());
//
//        // Perform the product selling and verify the exception
//        assertThrows(ProductNotFoundException.class, () -> productService.sellProduct(sellProductRequest));
//
//        // Verify the interactions
//        verify(productRepository).findById(eq(1L));
//        verifyNoMoreInteractions(productRepository, productUtil);
//    }
//
//    @Test
//    void testGetProductDetails_existingProduct() {
//        // Test setup
//        Product existingProduct = new Product();
//        existingProduct.setProductId(1L);
//        existingProduct.setQuantity(10);
//        existingProduct.setSellingPrice(100.0);
//
//        ProductDetails expectedProductDetails = new ProductDetails();
//        expectedProductDetails.setProductId(1L);
//        expectedProductDetails.setQuantity(10);
//        expectedProductDetails.setSellingPrice(100.0);
//
//        when(productRepository.findById(eq(1L))).thenReturn(Optional.of(existingProduct));
//        when(productUtil.toProductDetails(any(Product.class))).thenReturn(expectedProductDetails);
//
//        // Perform the retrieval of product details
//        ProductDetails result = productService.getProductDetails(1L);
//
//        // Verify the interactions and assertions
//        verify(productRepository).findById(eq(1L));
//        verify(productUtil).toProductDetails(any(Product.class));
//        assertEquals(expectedProductDetails, result);
//    }
//
//    @Test
//    void testGetProductDetails_productNotFound() {
//        // Test setup
//        when(productRepository.findById(eq(1L))).thenReturn(Optional.empty());
//
//        // Perform the retrieval of product details and verify the exception
//        assertThrows(ProductNotFoundException.class, () -> productService.getProductDetails(1L));
//
//        // Verify the interactions
//        verify(productRepository).findById(eq(1L));
//        verifyNoMoreInteractions(productRepository, productUtil);
//    }
//
//    @Test
//    void testGetProductsByPincode() {
//        // Test setup
//        Long pincode = 12345L;
//
//        List<Product> productList = new ArrayList<>();
//        productList.add(createProduct(1L, "Product 1", 10, 100.0, 12344L));
//        productList.add(createProduct(2L, "Product 2", 20, 200.0, 12345L));
//        productList.add(createProduct(3L, "Product 3", 30, 300.0, 12346L));
//
//        List<ProductDetails> expectedProductDetailsList = new ArrayList<>();
//        expectedProductDetailsList.add(createProductDetails(2L, "Product 2", 20, 200.0, 12345L));
//
//        when(productRepository.findAll()).thenReturn(productList);
//        when(productUtil.toProductDetailsList(anyList())).thenReturn(expectedProductDetailsList);
//
//        // Perform the retrieval of products by pincode
//        List<ProductDetails> result = productService.getProductsByPincode(pincode);
//
//        // Verify the interactions and assertions
//        verify(productRepository).findAll();
//        verify(productUtil).toProductDetailsList(anyList());
//        assertEquals(expectedProductDetailsList, result);
//    }
//
//    @Test
//    void testGetProductsByFarmerId_existingFarmer() {
//        // Test setup
//        Long farmerId = 1L;
//
//        Farmer farmer = new Farmer();
//        farmer.setFarmerId(farmerId);
//        farmer.setUsername("farmer1");
//
//        Product product1 = createProduct(1L, "Product 1", 10, 100.0, 12345L);
//        Product product2 = createProduct(2L, "Product 2", 20, 200.0, 12345L);
//        List<Product> productList = new ArrayList<>();
//        productList.add(product1);
//        productList.add(product2);
//
//        List<ProductDetails> expectedProductDetailsList = new ArrayList<>();
//        expectedProductDetailsList.add(createProductDetails(1L, "Product 1", 10, 100.0, 12345L));
//        expectedProductDetailsList.add(createProductDetails(2L, "Product 2", 20, 200.0, 12345L));
//
//        when(farmersRepository.findById(eq(farmerId))).thenReturn(Optional.of(farmer));
//        when(farmersUtil.getUserDetails(eq(farmer.getUsername()))).thenReturn(null);
//        when(productRepository.getProductsByFarmerId(eq(farmerId))).thenReturn(productList);
//        when(productUtil.toProductDetailsList(anyList())).thenReturn(expectedProductDetailsList);
//
//        // Perform the retrieval of products by farmer ID
//        List<ProductDetails> result = productService.getProductsByFarmerId(farmerId);
//
//        // Verify the interactions and assertions
//        verify(farmersRepository).findById(eq(farmerId));
//        verify(farmersUtil).getUserDetails(eq(farmer.getUsername()));
//        verify(productRepository).getProductsByFarmerId(eq(farmerId));
//        verify(productUtil).toProductDetailsList(anyList());
//        assertEquals(expectedProductDetailsList, result);
//    }
//
//    @Test
//    void testGetProductsByFarmerId_farmerNotFound() {
//        // Test setup
//        Long farmerId = 1L;
//
//        when(farmersRepository.findById(eq(farmerId))).thenReturn(Optional.empty());
//
//        // Perform the retrieval of products by farmer ID and verify the exception
//        assertThrows(FarmerNotFoundException.class, () -> productService.getProductsByFarmerId(farmerId));
//
//        // Verify the interactions
//        verify(farmersRepository).findById(eq(farmerId));
//        verifyNoMoreInteractions(farmersRepository, farmersUtil, productRepository, productUtil);
//    }
//
//    private Product createProduct(Long productId, String name, int quantity, double sellingPrice, Long farmerPincode) {
//        Product product = new Product();
//        product.setProductId(productId);
//        product.setName(name);
//        product.setQuantity(quantity);
//        product.setSellingPrice(sellingPrice);
//        product.setFarmerPincode(farmerPincode);
//        return product;
//    }
//
//    private ProductDetails createProductDetails(Long productId, String name, int quantity, double sellingPrice, Long farmerPincode) {
//        ProductDetails productDetails = new ProductDetails();
//        productDetails.setProductId(productId);
//        productDetails.setName(name);
//        productDetails.setQuantity(quantity);
//        productDetails.setSellingPrice(sellingPrice);
//        productDetails.setFarmerPincode(farmerPincode);
//        return productDetails;
//    }
//
//}
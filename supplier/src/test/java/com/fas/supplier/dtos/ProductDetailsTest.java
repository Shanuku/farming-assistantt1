import com.fas.supplier.dtos.ProductDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDetailsTest {

    @Test
    public void testGettersAndSetters() {
        ProductDetails productDetails = new ProductDetails();
        productDetails.setId(1L);
        productDetails.setName("Apple");
        productDetails.setQuantity(10L);
        productDetails.setSellingPrice(5.0);
        productDetails.setBuyingPrice(3.0);
        productDetails.setFarmerId(1L);
        productDetails.setFarmerFirstName("John");
        productDetails.setFarmerLastName("Doe");
        productDetails.setFarmerPincode(12345L);
        productDetails.setFarmerPhnNumber("123-456-7890");
        productDetails.setSupplierId(2L);

        assertEquals(1L, productDetails.getId());
        assertEquals("Apple", productDetails.getName());
        assertEquals(10L, productDetails.getQuantity());
        assertEquals(5.0, productDetails.getSellingPrice());
        assertEquals(3.0, productDetails.getBuyingPrice());
        assertEquals(1L, productDetails.getFarmerId());
        assertEquals("John", productDetails.getFarmerFirstName());
        assertEquals("Doe", productDetails.getFarmerLastName());
        assertEquals(12345L, productDetails.getFarmerPincode());
        assertEquals("123-456-7890", productDetails.getFarmerPhnNumber());
        assertEquals(2L, productDetails.getSupplierId());
    }

    // Additional test methods for other scenarios

    // ...
}

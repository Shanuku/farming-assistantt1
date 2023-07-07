import com.fas.supplier.dtos.BuyRequestDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyRequestDetailsTest {

    @Test
    public void testGettersAndSetters() {
        BuyRequestDetails buyRequestDetails = new BuyRequestDetails();
        buyRequestDetails.setId(1L);
        buyRequestDetails.setAskedPrice(10.5);
        buyRequestDetails.setRequestStatus("Pending");
        buyRequestDetails.setProductId(2L);
        buyRequestDetails.setProductName("Apple");
        buyRequestDetails.setProductquantity(100L);
        buyRequestDetails.setSellingPrice(15.0);
        buyRequestDetails.setBuyingPrice(12.0);
        buyRequestDetails.setFarmerId(3L);
        buyRequestDetails.setFarmerFirstName("John");
        buyRequestDetails.setFarmerLastName("Doe");
        buyRequestDetails.setFarmerPincode(12345L);
        buyRequestDetails.setFarmerPhnNumber("9876543210");
        buyRequestDetails.setSupplierId(4L);
        buyRequestDetails.setSupplierFirstName("Jane");
        buyRequestDetails.setSupplierLastName("Smith");
        buyRequestDetails.setSupplierPincode(67890L);
        buyRequestDetails.setSupplierPhnNumber("0123456789");

        assertEquals(1L, buyRequestDetails.getId());
        assertEquals(10.5, buyRequestDetails.getAskedPrice());
        assertEquals("Pending", buyRequestDetails.getRequestStatus());
        assertEquals(2L, buyRequestDetails.getProductId());
        assertEquals("Apple", buyRequestDetails.getProductName());
        assertEquals(100L, buyRequestDetails.getProductquantity());
        assertEquals(15.0, buyRequestDetails.getSellingPrice());
        assertEquals(12.0, buyRequestDetails.getBuyingPrice());
        assertEquals(3L, buyRequestDetails.getFarmerId());
        assertEquals("John", buyRequestDetails.getFarmerFirstName());
        assertEquals("Doe", buyRequestDetails.getFarmerLastName());
        assertEquals(12345L, buyRequestDetails.getFarmerPincode());
        assertEquals("9876543210", buyRequestDetails.getFarmerPhnNumber());
        assertEquals(4L, buyRequestDetails.getSupplierId());
        assertEquals("Jane", buyRequestDetails.getSupplierFirstName());
        assertEquals("Smith", buyRequestDetails.getSupplierLastName());
        assertEquals(67890L, buyRequestDetails.getSupplierPincode());
        assertEquals("0123456789", buyRequestDetails.getSupplierPhnNumber());
    }

    // Additional test methods for other scenarios

    // ...
}

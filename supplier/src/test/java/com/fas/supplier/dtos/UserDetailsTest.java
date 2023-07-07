import com.fas.supplier.dtos.UserDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDetailsTest {

    @Test
    public void testGettersAndSetters() {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(1L);
        userDetails.setUsername("john123");
        userDetails.setUserType("supplier");
        userDetails.setLoggedIn(true);

        assertEquals(1L, userDetails.getId());
        assertEquals("john123", userDetails.getUsername());
        assertEquals("supplier", userDetails.getUserType());
        assertEquals(true, userDetails.getLoggedIn());
    }

    // Additional test methods for other scenarios

    // ...
}

import com.fas.supplier.dtos.ChangePasswordRequest;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChangePasswordRequestTest {

    @Test
    public void testGettersAndSetters() {
        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
        changePasswordRequest.setUsername("john.doe");
        changePasswordRequest.setNewPassword("newpassword");

        assertEquals("john.doe", changePasswordRequest.getUsername());
        assertEquals("newpassword", changePasswordRequest.getNewPassword());
    }

//    @Test
//    public void testValidation() {
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        changePasswordRequest.setUsername("johndoe"); // Invalid username length
//        changePasswordRequest.setNewPassword("pass"); // Invalid password length
//
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//
//        var violations = validator.validate(changePasswordRequest);
//        assertEquals(2, violations.size());
//    }

    // Additional test methods for other scenarios

    // ...
}

package com.fas.supplier.utilities;

import com.fas.supplier.dtos.ChangePasswordRequest;
import com.fas.supplier.dtos.LoginCredentials;
import com.fas.supplier.dtos.User;
import com.fas.supplier.dtos.UserDetails;
import com.fas.supplier.exceptions.InvalidUserTypeException;
import com.fas.supplier.exceptions.SupplierLoggedOutException;
import com.fas.supplier.exceptions.SupplierNotFoundException;
import com.fas.supplier.dtos.UserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SupplierUtilityTest {

    @Mock
    private RestTemplate restTemplate;

    private SupplierUtility supplierUtility;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        supplierUtility = new SupplierUtility();
        supplierUtility.restTemplate = restTemplate;
    }

//    @Test
//    void sendLoginRequest() {
//        String baseAdminsUrl = "http://example.com/api/admins";
//        String url = baseAdminsUrl + "/login";
//        LoginCredentials loginCredentials = new LoginCredentials("username", "password");
//        User expectedUser = new User();
//
//        when(restTemplate.postForEntity(url, loginCredentials, User.class))
//                .thenReturn(new ResponseEntity<>(expectedUser, HttpStatus.OK));
//
//        User result = supplierUtility.sendLoginRequest(loginCredentials);
//
//        assertNotNull(result);
//        assertEquals(expectedUser, result);
//        verify(restTemplate, times(1)).postForEntity(url, loginCredentials, User.class);
//    }
//
//    @Test
//    void sendLogoutRequest() {
//        String baseAdminsUrl = "http://example.com/api/admins";
//        String username = "username";
//        String url = baseAdminsUrl + "/logout/" + username;
//        User expectedUser = new User();
//
//        when(restTemplate.getForEntity(url, User.class))
//                .thenReturn(new ResponseEntity<>(expectedUser, HttpStatus.OK));
//
//        User result = supplierUtility.sendLogoutRequest(username);
//
//        assertNotNull(result);
//        assertEquals(expectedUser, result);
//        verify(restTemplate, times(1)).getForEntity(url, User.class);
//    }
//
//    @Test
//    void sendChangePasswordRequest() {
//        String baseAdminsUrl = "http://example.com/api/admins";
//        String url = baseAdminsUrl + "/changePassword";
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        User expectedUser = new User();
//
//        when(restTemplate.postForEntity(url, changePasswordRequest, User.class))
//                .thenReturn(new ResponseEntity<>(expectedUser, HttpStatus.OK));
//
//        User result = supplierUtility.sendChangePasswordRequest(changePasswordRequest);
//
//        assertNotNull(result);
//        assertEquals(expectedUser, result);
//        verify(restTemplate, times(1)).postForEntity(url, changePasswordRequest, User.class);
//    }
//
//    @Test
//    void getUserDetails() {
//        String baseAdminsUrl = "http://example.com/api/admins";
//        String username = "username";
//        String url = baseAdminsUrl + "/getUserDetails/" + username;
//        UserDetails expectedUserDetails = new UserDetails();
//
//        when(restTemplate.getForEntity(url, UserDetails.class))
//                .thenReturn(new ResponseEntity<>(expectedUserDetails, HttpStatus.OK));
//
//        UserDetails result = supplierUtility.getUserDetails(username);
//
//        assertNotNull(result);
//        assertEquals(expectedUserDetails, result);
//        verify(restTemplate, times(1)).getForEntity(url, UserDetails.class);
//    }

    @Test
    void getUserType_validUserType() {
        String userType = "SUPPLIER";
        UserType expectedUserType = UserType.SUPPLIER;

        UserType result = supplierUtility.getUserType(userType);

        assertEquals(expectedUserType, result);
    }

    @Test
    void getUserType_invalidUserType() {
        String userType = "INVALID";

        assertThrows(InvalidUserTypeException.class, () -> supplierUtility.getUserType(userType));
    }

    @Test
    void isUserSupplier_supplierUserType() {
        String userType = UserType.SUPPLIER.toString();
        UserDetails userDetails = new UserDetails();
        userDetails.setUserType(userType);

        assertDoesNotThrow(() -> supplierUtility.isUserSupplier(userDetails));
    }

//    @Test
//    void isUserSupplier_nonSupplierUserType() {
//        String userType = UserType.CUSTOMER.toString();
//        UserDetails userDetails = new UserDetails();
//        userDetails.setUserType(userType);
//
//        assertThrows(SupplierNotFoundException.class, () -> supplierUtility.isUserSupplier(userDetails));
//    }

    @Test
    void isSupplierLoggedIn_loggedIn() {
        UserDetails userDetails = new UserDetails();
        userDetails.setLoggedIn(true);

        assertDoesNotThrow(() -> supplierUtility.isSupplierLoggedIn(userDetails));
    }

    @Test
    void isSupplierLoggedIn_loggedOut() {
        UserDetails userDetails = new UserDetails();
        userDetails.setLoggedIn(false);

        assertThrows(SupplierLoggedOutException.class, () -> supplierUtility.isSupplierLoggedIn(userDetails));
    }
}

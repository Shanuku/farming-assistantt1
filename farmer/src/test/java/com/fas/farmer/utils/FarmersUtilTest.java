package com.fas.farmer.utils;

import com.fas.farmer.dtos.*;
import com.fas.farmer.exceptions.FarmerLoggedOutException;
import com.fas.farmer.exceptions.FarmerNotFoundException;
import com.fas.farmer.exceptions.InvalidUserTypeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class FarmersUtilTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private FarmersUtil farmersUtil;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        farmersUtil = new FarmersUtil();

    }

//    @Test
//    public void sendLoginRequest_shouldReturnUser() {
//        LoginCredentials loginCredentials = new LoginCredentials();
//        User expectedUser = new User();
//
//        when(restTemplate.postForEntity(anyString(), any(LoginCredentials.class), eq(User.class)))
//                .thenReturn(new ResponseEntity<>(expectedUser, HttpStatus.OK));
//
//        User actualUser = farmersUtil.sendLoginRequest(loginCredentials);
//
//        assertEquals(expectedUser, actualUser);
//        verify(restTemplate, times(1)).postForEntity(anyString(), any(LoginCredentials.class), eq(User.class));
//    }

//    @Test
//    public void sendLogoutRequest_shouldReturnUser() {
//        String username = "john";
//        User expectedUser = new User();
//
//        when(restTemplate.getForEntity(anyString(), eq(User.class)))
//                .thenReturn(new ResponseEntity<>(expectedUser, HttpStatus.OK));
//
//        User actualUser = farmersUtil.sendLogoutRequest(username);
//
//        assertEquals(expectedUser, actualUser);
//        verify(restTemplate, times(1)).getForEntity(anyString(), eq(User.class));
//    }

//    @Test
//    public void sendChangePasswordRequest_shouldReturnUser() {
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        User expectedUser = new User();
//
//        when(restTemplate.postForEntity(anyString(), any(ChangePasswordRequest.class), eq(User.class)))
//                .thenReturn(new ResponseEntity<>(expectedUser, HttpStatus.OK));
//
//        User actualUser = farmersUtil.sendChangePasswordRequest(changePasswordRequest);
//
//        assertEquals(expectedUser, actualUser);
//        verify(restTemplate, times(1)).postForEntity(anyString(), any(ChangePasswordRequest.class), eq(User.class));
//    }

    @Test
    public void getUserType_shouldReturnUserType() {
        String userType = "FARMER";
        UserType expectedUserType = UserType.FARMER;

        UserType actualUserType = farmersUtil.getUserType(userType);

        assertEquals(expectedUserType, actualUserType);
    }

//    @Test
//    public void getUserDetails_shouldReturnUserDetails() {
//        String username = "john";
//        UserDetails expectedUserDetails = new UserDetails();
//
//        when(restTemplate.getForEntity(anyString(), eq(UserDetails.class)))
//                .thenReturn(new ResponseEntity<>(expectedUserDetails, HttpStatus.OK));
//
//        UserDetails actualUserDetails = farmersUtil.getUserDetails(username);
//
//        assertEquals(expectedUserDetails, actualUserDetails);
//        verify(restTemplate, times(1)).getForEntity(anyString(), eq(UserDetails.class));
//    }

    @Test
    public void isUserFarmer_shouldNotThrowExceptionWhenUserIsFarmer() {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserType("FARMER");

        assertDoesNotThrow(() -> farmersUtil.isUserFarmer(userDetails));
    }

    @Test
    public void isUserFarmer_shouldThrowExceptionWhenUserIsNotFarmer() {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserType("ADMIN");

        assertThrows(FarmerNotFoundException.class, () -> farmersUtil.isUserFarmer(userDetails));
    }

    @Test
    public void isFarmerLoggedIn_shouldNotThrowExceptionWhenFarmerIsLoggedIn() {
        UserDetails userDetails = new UserDetails();
        userDetails.setLoggedIn(true);

        assertDoesNotThrow(() -> farmersUtil.isFarmerLoggedIn(userDetails));
    }

    @Test
    public void isFarmerLoggedIn_shouldThrowExceptionWhenFarmerIsLoggedOut() {
        UserDetails userDetails = new UserDetails();
        userDetails.setLoggedIn(false);

        assertThrows(FarmerLoggedOutException.class, () -> farmersUtil.isFarmerLoggedIn(userDetails));
    }
}

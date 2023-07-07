package com.fas.supplier.service;

import com.fas.supplier.dtos.*;
import com.fas.supplier.entities.Supplier;

import com.fas.supplier.exceptions.SupplierNotFoundException;
import com.fas.supplier.repository.ISupplierRepository;
import com.fas.supplier.utilities.SupplierUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class SupplierServiceTest {

    @Mock
    private SupplierUtility supplierUtility;

    @Mock
    private ISupplierRepository supplierRepository;

    @InjectMocks
    private SupplierService supplierService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

//    @Test
//    void testLoginWithCredentials() {
//        LoginCredentials loginCredentials = new LoginCredentials("username", "password");
//        User expectedUser = new User();
//        // Set up the expected behavior of the supplierUtility methods
//
//        when(supplierUtility.getUserDetails(loginCredentials.getUsername())).thenReturn(new UserDetails());
//        when(supplierUtility.isUserSupplier(any(UserDetails.class))).thenReturn(true);
//        when(supplierUtility.sendLoginRequest(loginCredentials)).thenReturn(expectedUser);
//
//        User actualUser = supplierService.loginWithCredentials(loginCredentials);
//
//        assertEquals(expectedUser, actualUser);
//        // Verify that the supplierUtility methods were called
//        verify(supplierUtility).getUserDetails(loginCredentials.getUsername());
//        verify(supplierUtility).isUserSupplier(any(UserDetails.class));
//        verify(supplierUtility).sendLoginRequest(loginCredentials);
//    }

//    @Test
//    void testLogout() {
//        String username = "username";
//        User expectedUser = new User();
//        // Set up the expected behavior of the supplierUtility methods
//
//        when(supplierUtility.getUserDetails(username)).thenReturn(new UserDetails());
//        when(supplierUtility.isUserSupplier(any(UserDetails.class))).thenReturn(true);
//        when(supplierUtility.sendLogoutRequest(username)).thenReturn(expectedUser);
//
//        User actualUser = supplierService.logout(username);
//
//        assertEquals(expectedUser, actualUser);
//        // Verify that the supplierUtility methods were called
//        verify(supplierUtility).getUserDetails(username);
//        verify(supplierUtility).isUserSupplier(any(UserDetails.class));
//        verify(supplierUtility).sendLogoutRequest(username);
//    }
//
//    @Test
//    void testChangePassword() {
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest("username", "oldPassword", "newPassword");
//        User expectedUser = new User();
//        // Set up the expected behavior of the supplierUtility methods
//
//        when(supplierUtility.getUserDetails(changePasswordRequest.getUsername())).thenReturn(new UserDetails());
//        when(supplierUtility.isUserSupplier(any(UserDetails.class))).thenReturn(true);
//        when(supplierUtility.sendChangePasswordRequest(changePasswordRequest)).thenReturn(expectedUser);
//
//        User actualUser = supplierService.changePassword(changePasswordRequest);
//
//        assertEquals(expectedUser, actualUser);
//        // Verify that the supplierUtility methods were called
//        verify(supplierUtility).getUserDetails(changePasswordRequest.getUsername());
//        verify(supplierUtility).isUserSupplier(any(UserDetails.class));
//        verify(supplierUtility).sendChangePasswordRequest(changePasswordRequest);
//    }
//
//    @Test
//    void testUpdateSupplier() {
//        UpdateSupplier updateSupplier = new UpdateSupplier("username", "John", "Doe", "12345", "9876543210");
//        Supplier expectedSupplier = new Supplier();
//        // Set up the expected behavior of the supplierUtility methods
//        when(supplierUtility.getUserDetails(updateSupplier.getUsername())).thenReturn(new UserDetails());
//        when(supplierUtility.isUserSupplier(any(UserDetails.class))).thenReturn(true);
//        when(supplierRepository.findByUsername(updateSupplier.getUsername())).thenReturn(Arrays.asList(expectedSupplier));
//        when(supplierRepository.save(any(Supplier.class))).thenReturn(expectedSupplier);
//
//        Supplier actualSupplier = supplierService.updateSupplier(updateSupplier);
//
//        assertEquals(expectedSupplier, actualSupplier);
//        // Verify that the supplierUtility methods were called
//        verify(supplierUtility).getUserDetails(updateSupplier.getUsername());
//        verify(supplierUtility).isUserSupplier(any(UserDetails.class));
//        verify(supplierUtility).isSupplierLoggedIn(any(UserDetails.class));
//        // Verify that the supplierRepository methods were called
//        verify(supplierRepository).findByUsername(updateSupplier.getUsername());
//        verify(supplierRepository).save(any(Supplier.class));
//    }
//
//    @Test
//    void testGetSupplierById() {
//        Long supplierId = 1L;
//        Supplier expectedSupplier = new Supplier();
//        // Set up the expected behavior of the supplierRepository methods
//        when(supplierRepository.findById(supplierId)).thenReturn(Optional.of(expectedSupplier));
//        when(supplierUtility.getUserDetails(expectedSupplier.getUsername())).thenReturn(new UserDetails());
//        when(supplierUtility.isSupplierLoggedIn(any(UserDetails.class))).thenReturn(true);
//
//        Supplier actualSupplier = supplierService.getSupplierById(supplierId);
//
//        assertEquals(expectedSupplier, actualSupplier);
//        // Verify that the supplierRepository methods were called
//        verify(supplierRepository).findById(supplierId);
//        // Verify that the supplierUtility methods were called
//        verify(supplierUtility).getUserDetails(expectedSupplier.getUsername());
//        verify(supplierUtility).isSupplierLoggedIn(any(UserDetails.class));
//    }

    @Test
    void testGetSupplierById_SupplierNotFound() {
        Long supplierId = 1L;
        // Set up the expected behavior of the supplierRepository methods
        when(supplierRepository.findById(supplierId)).thenReturn(Optional.empty());

        assertThrows(SupplierNotFoundException.class, () -> supplierService.getSupplierById(supplierId));

        // Verify that the supplierRepository methods were called
        verify(supplierRepository).findById(supplierId);
    }
}

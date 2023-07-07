package com.fas.admin.service;

import com.fas.admin.dtos.LoginCredentials;

import com.fas.admin.entities.User;

import com.fas.admin.exceptions.InvalidPasswordException;
import com.fas.admin.exceptions.UserNotFoundException;

import com.fas.admin.repository.IAdminRepository;
import com.fas.admin.utilites.AdminUtil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
 class AdminServiceTest {


    @Mock
    private IAdminRepository repository;

    @Mock
    private AdminUtil adminUtil;

    @InjectMocks
    private AdminService adminService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

//    @Test
//    void loginWithCredentials_ValidCredentials_ReturnsUser() {
//        // Arrange
//        LoginCredentials credentials = new LoginCredentials("username", "password");
//        User user = new User();
//        List<User> usersList = new ArrayList<>();
//        usersList.add(user);
//
//        when(repository.getUserWithUsername(credentials.getUsername())).thenReturn(usersList);
//        when(repository.getUserWithCredentials(credentials.getUsername(), credentials.getPassword())).thenReturn(usersList);
//        when(repository.save(user)).thenReturn(user);
//
//        // Act
//        User result = adminService.loginWithCredentials(credentials);
//
//        // Assert
//        assertNotNull(result);
//        assertTrue(result.isLoggedIn());
//        verify(repository, times(1)).save(user);
//    }

    @Test
    void loginWithCredentials_InvalidUsername_ThrowsUserNotFoundException() {
        // Arrange
        LoginCredentials credentials = new LoginCredentials("invalid_username", "password");

        when(repository.getUserWithUsername(credentials.getUsername())).thenReturn(new ArrayList<>());

        // Act and Assert
        assertThrows(UserNotFoundException.class, () -> adminService.loginWithCredentials(credentials));
        verify(repository, never()).getUserWithCredentials(anyString(), anyString());
        verify(repository, never()).save(any(User.class));
    }

    @Test
    void loginWithCredentials_InvalidPassword_ThrowsInvalidPasswordException() {
        // Arrange
        LoginCredentials credentials = new LoginCredentials("username", "invalid_password");
        User user = new User();
        List<User> usersList = new ArrayList<>();
        usersList.add(user);

        when(repository.getUserWithUsername(credentials.getUsername())).thenReturn(usersList);
        when(repository.getUserWithCredentials(credentials.getUsername(), credentials.getPassword())).thenReturn(new ArrayList<>());

        // Act and Assert
        assertThrows(InvalidPasswordException.class, () -> adminService.loginWithCredentials(credentials));
        verify(repository, never()).save(any(User.class));
    }

    // Write similar test methods for other methods in the AdminService class

    // ...
}

//package com.fas.farmer.service;
//
//import com.fas.farmer.constants.ComplaintStatus;
//import com.fas.farmer.dtos.*;
//import com.fas.farmer.entities.Complaint;
//import com.fas.farmer.entities.Farmer;
//import com.fas.farmer.exceptions.FarmerNotFoundException;
//import com.fas.farmer.repository.IComplaintRepository;
//import com.fas.farmer.repository.IFarmersRepository;
//import com.fas.farmer.utils.FarmersUtil;
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
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.*;
//
//class FarmerServiceTest {
//
//    @Mock
//    private FarmersUtil farmersUtil;
//
//    @Mock
//    private IFarmersRepository farmersRepository;
//
//    @Mock
//    private IComplaintRepository complaintRepository;
//
//    @InjectMocks
//    private FarmerService farmerService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testLoginWithCredentials() {
//        // Test setup
//        LoginCredentials loginCredentials = new LoginCredentials();
//        loginCredentials.setUsername("username");
//        UserDetails userDetails = new UserDetails();
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(userDetails);
//        when(farmersUtil.isUserFarmer(eq(userDetails))).thenReturn(true);
//        when(farmersUtil.sendLoginRequest(eq(loginCredentials))).thenReturn(new User());
//
//        // Perform the login
//        User result = farmerService.loginWithCredentials(loginCredentials);
//
//        // Verify the interactions and assertions
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isUserFarmer(eq(userDetails));
//        verify(farmersUtil).sendLoginRequest(eq(loginCredentials));
//        assertNotNull(result);
//    }
//
//    @Test
//    void testLogout() {
//        // Test setup
//        UserDetails userDetails = new UserDetails();
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(userDetails);
//        when(farmersUtil.isUserFarmer(eq(userDetails))).thenReturn(true);
//        when(farmersUtil.sendLogoutRequest(eq("username"))).thenReturn(new User());
//
//        // Perform the logout
//        User result = farmerService.logout("username");
//
//        // Verify the interactions and assertions
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isUserFarmer(eq(userDetails));
//        verify(farmersUtil).sendLogoutRequest(eq("username"));
//        assertNotNull(result);
//    }
//
//    @Test
//    void testChangePassword() {
//        // Test setup
//        ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
//        changePasswordRequest.setUsername("username");
//        UserDetails userDetails = new UserDetails();
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(userDetails);
//        when(farmersUtil.isUserFarmer(eq(userDetails))).thenReturn(true);
//        when(farmersUtil.sendChangePasswordRequest(eq(changePasswordRequest))).thenReturn(new User());
//
//        // Perform the password change
//        User result = farmerService.changePassword(changePasswordRequest);
//
//        // Verify the interactions and assertions
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isUserFarmer(eq(userDetails));
//        verify(farmersUtil).sendChangePasswordRequest(eq(changePasswordRequest));
//        assertNotNull(result);
//    }
//
//    @Test
//    void testUpdateFarmer_existingFarmer() {
//        // Test setup
//        UpdateFarmer updateFarmer = new UpdateFarmer();
//        updateFarmer.setUsername("username");
//        updateFarmer.setId(1L);
//        updateFarmer.setFirstName("John");
//        updateFarmer.setLastName("Doe");
//        updateFarmer.setPincode("123456");
//        updateFarmer.setPhnNumber("987654321");
//
//        Farmer existingFarmer = new Farmer();
//        existingFarmer.setUsername("username");
//
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(new UserDetails());
//        when(farmersUtil.isUserFarmer(any(UserDetails.class))).thenReturn(true);
//        when(farmersRepository.findByUsername(eq("username"))).thenReturn(List.of(existingFarmer));
//        when(farmersRepository.findById(eq(1L))).thenReturn(Optional.of(existingFarmer));
//        when(farmersRepository.save(any(Farmer.class))).thenAnswer(invocation -> invocation.getArgument(0));
//
//        // Perform the farmer update
//        Farmer result = farmerService.updateFarmer(updateFarmer);
//
//        // Verify the interactions and assertions
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isUserFarmer(any(UserDetails.class));
//        verify(farmersRepository).findByUsername(eq("username"));
//        verify(farmersRepository).findById(eq(1L));
//        verify(farmersRepository).save(any(Farmer.class));
//        assertEquals("John", result.getFirstName());
//        assertEquals("Doe", result.getLastName());
//        assertEquals("123456", result.getPincode());
//        assertEquals("987654321", result.getPhnNumber());
//    }
//
//    @Test
//    void testUpdateFarmer_newFarmer() {
//        // Test setup
//        UpdateFarmer updateFarmer = new UpdateFarmer();
//        updateFarmer.setUsername("username");
//        updateFarmer.setId(1L);
//        updateFarmer.setFirstName("John");
//        updateFarmer.setLastName("Doe");
//        updateFarmer.setPincode("123456");
//        updateFarmer.setPhnNumber("987654321");
//
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(new UserDetails());
//        when(farmersUtil.isUserFarmer(any(UserDetails.class))).thenReturn(true);
//        when(farmersRepository.findByUsername(eq("username"))).thenReturn(new ArrayList<>());
//        when(farmersRepository.findById(eq(1L))).thenReturn(Optional.empty());
//        when(farmersRepository.save(any(Farmer.class))).thenAnswer(invocation -> invocation.getArgument(0));
//
//        // Perform the farmer update
//        Farmer result = farmerService.updateFarmer(updateFarmer);
//
//        // Verify the interactions and assertions
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isUserFarmer(any(UserDetails.class));
//        verify(farmersRepository).findByUsername(eq("username"));
//        verify(farmersRepository).findById(eq(1L));
//        verify(farmersRepository).save(any(Farmer.class));
//        assertEquals("John", result.getFirstName());
//        assertEquals("Doe", result.getLastName());
//        assertEquals("123456", result.getPincode());
//        assertEquals("987654321", result.getPhnNumber());
//    }
//
//    @Test
//    void testGetFarmerById_existingFarmer() {
//        // Test setup
//        Farmer existingFarmer = new Farmer();
//        existingFarmer.setId(1L);
//        existingFarmer.setUsername("username");
//
//        when(farmersRepository.findById(eq(1L))).thenReturn(Optional.of(existingFarmer));
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(new UserDetails());
//        when(farmersUtil.isFarmerLoggedIn(any(UserDetails.class))).thenReturn(true);
//
//        // Perform the farmer retrieval
//        Farmer result = farmerService.getFarmerById(1L);
//
//        // Verify the interactions and assertions
//        verify(farmersRepository).findById(eq(1L));
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isFarmerLoggedIn(any(UserDetails.class));
//        assertEquals(1L, result.getId());
//        assertEquals("username", result.getUsername());
//    }
//
//    @Test
//    void testGetFarmerById_farmerNotFound() {
//        // Test setup
//        when(farmersRepository.findById(eq(1L))).thenReturn(Optional.empty());
//
//        // Perform the farmer retrieval and verify the exception
//        assertThrows(FarmerNotFoundException.class, () -> farmerService.getFarmerById(1L));
//
//        // Verify the interactions
//        verify(farmersRepository).findById(eq(1L));
//        verifyNoMoreInteractions(farmersUtil);
//    }
//
//    @Test
//    void testAddComplaint() {
//        // Test setup
//        AddComplaintRequest addComplaintRequest = new AddComplaintRequest();
//        addComplaintRequest.setFarmerId(1L);
//        addComplaintRequest.setComplaintDescription("Test complaint");
//
//        Farmer existingFarmer = new Farmer();
//        existingFarmer.setUsername("username");
//
//        when(farmersRepository.findById(eq(1L))).thenReturn(Optional.of(existingFarmer));
//        when(farmersUtil.getUserDetails(eq("username"))).thenReturn(new UserDetails());
//        when(farmersUtil.isFarmerLoggedIn(any(UserDetails.class))).thenReturn(true);
//        when(complaintRepository.save(any(Complaint.class))).thenAnswer(invocation -> invocation.getArgument(0));
//
//        // Perform the complaint addition
//        Complaint result = farmerService.addComplaint(addComplaintRequest);
//
//        // Verify the interactions and assertions
//        verify(farmersRepository).findById(eq(1L));
//        verify(farmersUtil).getUserDetails(eq("username"));
//        verify(farmersUtil).isFarmerLoggedIn(any(UserDetails.class));
//        verify(complaintRepository).save(any(Complaint.class));
//        assertEquals(1L, result.getFarmerId());
//        assertEquals("Test complaint", result.getComplaintDescription());
//        assertEquals(ComplaintStatus.UNRESOLVED, result.getStatus());
//    }
//}

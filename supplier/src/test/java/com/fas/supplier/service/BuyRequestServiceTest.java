package com.fas.supplier.service;

import com.fas.supplier.constants.RequestStatus;
import com.fas.supplier.dtos.AddBuyRequest;
import com.fas.supplier.dtos.BuyRequestDetails;
import com.fas.supplier.dtos.UserDetails;
import com.fas.supplier.entities.BuyRequest;
import com.fas.supplier.entities.Supplier;
import com.fas.supplier.exceptions.*;
import com.fas.supplier.repository.IBuyRequestRepository;
import com.fas.supplier.repository.ISupplierRepository;
import com.fas.supplier.utilities.BuyRequestUtility;
import com.fas.supplier.utilities.SupplierUtility;
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

public class BuyRequestServiceTest {

    @Mock
    private BuyRequestUtility buyRequestUtility;

    @Mock
    private SupplierUtility supplierUtility;

    @Mock
    private IBuyRequestRepository buyRequestRepository;

    @Mock
    private ISupplierRepository supplierRepository;

    @InjectMocks
    private BuyRequestService buyRequestService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSendBuyRequest() {
        // Mocking the dependencies
        AddBuyRequest addBuyRequest = new AddBuyRequest();
        addBuyRequest.setSupplierId(1L);
        addBuyRequest.setProductId(1L);
        addBuyRequest.setAskedPrice(100.0);

        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setUsername("supplier123");

        when(supplierRepository.findById(1L)).thenReturn(Optional.of(supplier));
        when(supplierUtility.getUserDetails(supplier.getUsername())).thenReturn(new UserDetails());
        when(buyRequestUtility.toBuyRequestDetails(any(BuyRequest.class), any(Supplier.class))).thenReturn(new BuyRequestDetails());

        BuyRequestDetails buyRequestDetails = buyRequestService.sendBuyRequest(addBuyRequest);

        assertNotNull(buyRequestDetails);
        verify(buyRequestRepository, times(1)).save(any(BuyRequest.class));
    }

    @Test
    public void testGetBuyRequestsById() {
        // Mocking the dependencies
        BuyRequest buyRequest = new BuyRequest();
        buyRequest.setId(1L);
        buyRequest.setSupplierId(1L);
        buyRequest.setProductId(1L);
        buyRequest.setRequestStatus(RequestStatus.PENDING);

        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setUsername("supplier123");

        when(buyRequestRepository.findById(1L)).thenReturn(Optional.of(buyRequest));
        when(supplierRepository.findById(1L)).thenReturn(Optional.of(supplier));
        when(supplierUtility.getUserDetails(supplier.getUsername())).thenReturn(new UserDetails());
        when(buyRequestUtility.toBuyRequestDetails(any(BuyRequest.class), any(Supplier.class))).thenReturn(new BuyRequestDetails());

        BuyRequestDetails buyRequestDetails = buyRequestService.getBuyRequestsById(1L);

        assertNotNull(buyRequestDetails);
    }

    @Test
    public void testGetBuyRequestByProductId() {
        // Mocking the dependencies
        Long productId = 1L;

        List<BuyRequest> buyRequestList = new ArrayList<>();
        BuyRequest buyRequest1 = new BuyRequest();
        buyRequest1.setId(1L);
        buyRequest1.setSupplierId(1L);
        buyRequest1.setProductId(productId);
        buyRequest1.setRequestStatus(RequestStatus.PENDING);
        buyRequestList.add(buyRequest1);

        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setUsername("supplier123");

        when(buyRequestRepository.getBuyRequestByProductId(productId)).thenReturn(buyRequestList);
        when(supplierRepository.findById(1L)).thenReturn(Optional.of(supplier));
        when(buyRequestUtility.toBuyRequestDetails(any(BuyRequest.class), any(Supplier.class))).thenReturn(new BuyRequestDetails());

        List<BuyRequestDetails> buyRequestDetailsList = buyRequestService.getBuyRequestByProductId(productId);

        assertFalse(buyRequestDetailsList.isEmpty());
    }

//    @Test
//    public void testApproveBuyRequest() {
//        // Mocking the dependencies
//        Long buyRequestId = 1L;
//
//        BuyRequest buyRequest = new BuyRequest();
//        buyRequest.setId(buyRequestId);
//        buyRequest.setSupplierId(1L);
//        buyRequest.setProductId(1L);
//        buyRequest.setRequestStatus(RequestStatus.PENDING);
//
//        Supplier supplier = new Supplier();
//        supplier.setId(1L);
//        supplier.setUsername("supplier123");
//
//        List<BuyRequest> buyRequestList = new ArrayList<>();
//        buyRequestList.add(buyRequest);
//
//        when(buyRequestRepository.findById(buyRequestId)).thenReturn(Optional.of(buyRequest));
//        when(buyRequestRepository.getBuyRequestByProductId(1L)).thenReturn(buyRequestList);
//        when(supplierRepository.findById(1L)).thenReturn(Optional.of(supplier));
//        when(buyRequestUtility.toBuyRequestDetails(any(BuyRequest.class), any(Supplier.class))).thenReturn(new BuyRequestDetails());
//
//        BuyRequestDetails buyRequestDetails = buyRequestService.approveBuyRequest(buyRequestId);
//
//        assertNotNull(buyRequestDetails);
//        assertEquals(RequestStatus.APPROVED, buyRequest.getRequestStatus());
//        verify(buyRequestRepository, times(1)).save(any(BuyRequest.class));
//    }

    @Test
    public void testRejectBuyRequest() {
        // Mocking the dependencies
        Long buyRequestId = 1L;

        BuyRequest buyRequest = new BuyRequest();
        buyRequest.setId(buyRequestId);
        buyRequest.setSupplierId(1L);
        buyRequest.setProductId(1L);
        buyRequest.setRequestStatus(RequestStatus.PENDING);

        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setUsername("supplier123");

        when(buyRequestRepository.findById(buyRequestId)).thenReturn(Optional.of(buyRequest));
        when(supplierRepository.findById(1L)).thenReturn(Optional.of(supplier));
        when(buyRequestUtility.toBuyRequestDetails(any(BuyRequest.class), any(Supplier.class))).thenReturn(new BuyRequestDetails());

        BuyRequestDetails buyRequestDetails = buyRequestService.rejectBuyRequest(buyRequestId);

        assertNotNull(buyRequestDetails);
        assertEquals(RequestStatus.REJECTED, buyRequest.getRequestStatus());
        verify(buyRequestRepository, times(1)).save(any(BuyRequest.class));
    }

    @Test
    public void testGetBuyRequestBySupplier() {
        // Mocking the dependencies
        Long supplierId = 1L;

        List<BuyRequest> buyRequestList = new ArrayList<>();
        BuyRequest buyRequest1 = new BuyRequest();
        buyRequest1.setId(1L);
        buyRequest1.setSupplierId(supplierId);
        buyRequest1.setProductId(1L);
        buyRequest1.setRequestStatus(RequestStatus.PENDING);
        buyRequestList.add(buyRequest1);

        Supplier supplier = new Supplier();
        supplier.setId(supplierId);
        supplier.setUsername("supplier123");

        when(buyRequestRepository.getBuyRequestBySupplierId(supplierId)).thenReturn(buyRequestList);
        when(supplierRepository.findById(supplierId)).thenReturn(Optional.of(supplier));
        when(supplierUtility.getUserDetails(supplier.getUsername())).thenReturn(new UserDetails());
        when(buyRequestUtility.toBuyRequestDetails(any(BuyRequest.class), any(Supplier.class))).thenReturn(new BuyRequestDetails());

        List<BuyRequestDetails> buyRequestDetailsList = buyRequestService.getBuyRequestBySupplier(supplierId);

        assertFalse(buyRequestDetailsList.isEmpty());
    }

}

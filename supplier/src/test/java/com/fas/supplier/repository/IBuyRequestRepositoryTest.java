package com.fas.supplier.repository;

import com.fas.supplier.entities.BuyRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManagerAutoConfiguration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest(excludeAutoConfiguration = TestEntityManagerAutoConfiguration.class)
class IBuyRequestRepositoryTest {

    @Autowired
    private IBuyRequestRepository buyRequestRepository;

//    @Test
//    void getBuyRequestsBySupplierId() {
//        // Create a sample BuyRequest and save it in the test database
//        BuyRequest buyRequest = new BuyRequest();
//        buyRequest.setSupplierId(1L);
//        buyRequestRepository.save(buyRequest);
//
//        // Call the repository method
//        List<BuyRequest> result = buyRequestRepository.getBuyRequestsBySupplierId(1L);
//
//        // Assert the result
//        assertThat(result).containsExactly(buyRequest);
//    }

//    @Test
//    void getBuyRequestByProductId() {
//        // Create a sample BuyRequest and save it in the test database
//        BuyRequest buyRequest = new BuyRequest();
//        buyRequest.setProductId(1L);
//        buyRequestRepository.save(buyRequest);
//
//        // Call the repository method
//        List<BuyRequest> result = buyRequestRepository.getBuyRequestByProductId(1L);
//
//        // Assert the result
//        assertThat(result).containsExactly(buyRequest);
//    }

//    @Test
//    void getBuyRequestBySupplierId() {
//        // Create a sample BuyRequest and save it in the test database
//        BuyRequest buyRequest = new BuyRequest();
//        buyRequest.setSupplierId(1L);
//        buyRequestRepository.save(buyRequest);
//
//        // Call the repository method
//        List<BuyRequest> result = buyRequestRepository.getBuyRequestBySupplierId(1L);
//
//        // Assert the result
//        assertThat(result).containsExactly(buyRequest);
//    }
}

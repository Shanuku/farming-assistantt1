package com.fas.supplier.repository;

import com.fas.supplier.entities.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@DataJpaTest
@ActiveProfiles("test")
public class ISupplierRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ISupplierRepository supplierRepository;

//    @Test
//    public void testFindByUsername() {
//        // Create a test supplier
//        Supplier supplier = new Supplier();
//        supplier.setUsername("testUser");
//        entityManager.persist(supplier);
//        entityManager.flush();
//
//        // Call the repository method
//        List<Supplier> foundSuppliers = supplierRepository.findByUsername("testUser");
//
//        // Assert the result
//        Assertions.assertEquals(1, foundSuppliers.size());
//        Supplier foundSupplier = foundSuppliers.get(0);
//        Assertions.assertEquals("testUser", foundSupplier.getUsername());
//    }
}

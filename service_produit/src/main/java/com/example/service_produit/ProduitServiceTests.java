package com.example.service_produit;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
public class ProduitServiceTests {

    @Autowired
    private ProduitService produitService;

    @Test
    public void testAddProduit() {
        Produit produit = new Produit("Test Produit", 100.0);
        Produit savedProduit = produitService.addProduit(produit);
        assertNotNull(savedProduit.getId());
        assertEquals("Test Produit", savedProduit.getName());
    }
}

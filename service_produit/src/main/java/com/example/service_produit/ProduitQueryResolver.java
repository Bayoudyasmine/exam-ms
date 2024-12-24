package com.example.service_produit;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProduitQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ProduitService produitService;

    // Récupérer tous les produits
    public List<Produit> produits() {
        return produitService.getAllProduits();
    }

    // Récupérer un produit par ID
    public Produit produitById(Long id) {
        return produitService.getProduitById(id);
    }
}

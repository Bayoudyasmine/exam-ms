package com.example.service_produit;

import com.example.service_produit.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    // Récupérer tous les produits
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    // Ajouter un produit
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    // Supprimer un produit
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}

package com.example.service_commandes;

import graphql.kickstart.annotations.GraphQLMutationResolver;
import graphql.kickstart.annotations.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;

@Component
public class CommandeGraphQLResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private CommandeService commandeService;

    // Query for fetching all commandes
    public List<Commande> commandes() {
        return commandeService.getAllCommandes();
    }

    // Mutation for creating a new commande
    public Commande createCommande(String produitId, int quantity) {
        Commande commande = new Commande(produitId, quantity);
        return commandeService.saveCommande(commande);
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

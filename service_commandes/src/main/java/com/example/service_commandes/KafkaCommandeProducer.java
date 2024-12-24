package com.example.service_commandes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaCommandeProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
    @Autowired
    private KafkaCommandeProducer kafkaCommandeProducer;

    public Commande createCommande(String produitId, int quantity) {
        Commande commande = new Commande(produitId, quantity);
        Commande savedCommande = commandeService.saveCommande(commande);

        // Send Kafka message
        kafkaCommandeProducer.sendMessage("commandes", "Nouvelle commande créée : " + savedCommande.getId());
        return savedCommande;
    }

}

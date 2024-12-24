package com.example.service_produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProduitProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "produits";

    // Envoyer un message Kafka
    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}

package com.example.service_notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @KafkaListener(topics = "commandes", groupId = "notification-group")
    public void handleCommandeNotification(String message) {
        System.out.println("Notification reçue pour une commande : " + message);
        // Logique pour envoyer la notification (e.g., Email, SMS, etc.)
    }

    @KafkaListener(topics = "produits", groupId = "notification-group")
    public void handleProduitNotification(String message) {
        System.out.println("Notification reçue pour un produit : " + message);
        // Logique pour envoyer la notification (e.g., Email, SMS, etc.)
    }
    @Autowired
    private NotificationService notificationService;



}

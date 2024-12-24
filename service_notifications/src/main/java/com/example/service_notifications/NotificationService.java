package com.example.service_notifications;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendEmailNotification(String subject, String body) {
        // Simule l'envoi d'un email
        System.out.println("Envoi d'email avec sujet : " + subject + " et contenu : " + body);
    }

    public void sendSmsNotification(String phoneNumber, String message) {
        // Simule l'envoi d'un SMS
        System.out.println("Envoi de SMS à " + phoneNumber + " avec message : " + message);
    }
}

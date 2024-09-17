package com.example.geolocation.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String processLocationData(String locationData) {
        // Process location data and generate notifications
        return "Notification based on location data: " + locationData;
    }
}

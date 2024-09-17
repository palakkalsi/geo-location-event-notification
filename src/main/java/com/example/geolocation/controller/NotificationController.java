package com.example.geolocation.controller;

import com.example.geolocation.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @MessageMapping("/location")
    @SendTo("/topic/notifications")
    public String sendNotifications(String locationData) {
        return notificationService.processLocationData(locationData);
    }
}

package com.feautures.java9to17.privateMethods;

import org.springframework.boot.SpringApplication;

import com.feautures.java9to17.Java9to17Application;

public class SendNotificationImpl implements SendNotification {

    public static void main(String[] args) {
        SpringApplication.run(Java9to17Application.class, args);
        SendNotification sendNotification = new SendNotificationImpl();
        sendNotification.sendNotification();
        sendNotification.sendNotifications();
    }
}

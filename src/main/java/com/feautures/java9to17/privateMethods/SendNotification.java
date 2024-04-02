package com.feautures.java9to17.privateMethods;

public interface SendNotification {
    default void sendNotifications() {
        // System.out.println("Establish a connection");
        connection();
        System.out.println("multiple notification sent");
    }

    default void sendNotification() {
        // System.out.println("Establish a connection");
        connection();
        System.out.println("single notification sent");
    }

    private void connection() {
        System.out.println("Establish a connection");
    }
}

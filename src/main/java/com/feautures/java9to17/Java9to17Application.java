package com.feautures.java9to17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.feautures.java9to17.privateMethods.SendNotification;
import com.feautures.java9to17.privateMethods.SendNotificationImpl;

@SpringBootApplication
public class Java9to17Application {

	public static void main(String[] args) {
		SpringApplication.run(Java9to17Application.class, args);
		SendNotification sendNotification = new SendNotificationImpl();
		sendNotification.sendNotification();
		sendNotification.sendNotifications();
	}

}

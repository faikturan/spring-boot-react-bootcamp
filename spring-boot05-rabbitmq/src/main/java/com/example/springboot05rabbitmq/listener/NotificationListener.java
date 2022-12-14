package com.example.springboot05rabbitmq.listener;

import com.example.springboot05rabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "techcareer-queue")
    public void handleMessage(Notification notification){
        System.out.println("Message received");
        System.out.println(notification.toString());

    }
}

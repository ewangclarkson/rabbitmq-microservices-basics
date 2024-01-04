package com.ewangclarks.mqc.service;

import com.ewangclarks.mqc.dto.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class MessageListener {
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void listenMessage(CustomMessage message) {
        System.out.println("message = " + message);
    }
}

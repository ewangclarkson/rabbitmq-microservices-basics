package com.ewangclarks.mq.domain.service;

import com.ewangclarks.mq.config.RabbitMqConfig;
import com.ewangclarks.mq.dto.CustomMessage;
import com.ewangclarks.mq.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final RabbitTemplate rabbitTemplate;
    private final RabbitMqConfig rabbitMqConfig;

    @Override
    public String sendMessage(CustomMessage message) {
      message.setMessageId(UUID.randomUUID().toString());
      message.setMessageDate( new Date());
      rabbitTemplate.convertAndSend(rabbitMqConfig.getExchange(),rabbitMqConfig.getRoutingKey(),message);
      return  "Message published";
    }
}

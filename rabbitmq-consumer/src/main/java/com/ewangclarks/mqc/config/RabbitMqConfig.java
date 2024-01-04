package com.ewangclarks.mqc.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "rabbitmq")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RabbitMqConfig {
    private String queue;
    private String exchange;
    private String routingKey;
}

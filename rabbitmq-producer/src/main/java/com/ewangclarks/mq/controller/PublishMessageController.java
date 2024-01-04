package com.ewangclarks.mq.controller;

import com.ewangclarks.mq.dto.CustomMessage;
import com.ewangclarks.mq.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PublishMessageController {

    private final MessageService messageService;
    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage message){
        return messageService.sendMessage(message);
    }
}

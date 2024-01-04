package com.ewangclarks.mq.service;

import com.ewangclarks.mq.dto.CustomMessage;

public interface MessageService {
    public String sendMessage(CustomMessage message);
}

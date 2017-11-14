package com.example.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "testQueue")
    @SendTo("outQueue")
    public String receiveQueue(String text){
        System.out.println("收到的消息为："+text);
        return "成功接收";
    }
}

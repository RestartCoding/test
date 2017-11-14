package com.example.demo.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Service
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, String message){
        jmsTemplate.convertAndSend(destination, message);
    }

    @JmsListener(destination = "outQueue")
    public void consumerMessage(String text){
        System.out.println("consumer回复的消息为："+text);
    }
}

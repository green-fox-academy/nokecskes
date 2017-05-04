package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.04..
 */
@Component
public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public MessageProceeder() {
  }

  public void processMessage(String message, String destination) {
    System.out.println(messageService.messageToString(message, destination));
  }

}

package com.greenfox.messageservice.service;

/**
 * Created by Connor on 2017.05.04..
 */
public class EmailService implements MessageService {

  public EmailService() {};

  @Override
  public String messageToString(String message, String destination) {
    return String.format("Email Sent to %s with Message = %s", destination, message);
  }
}




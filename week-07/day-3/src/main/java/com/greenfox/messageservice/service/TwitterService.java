package com.greenfox.messageservice.service;

import com.greenfox.messageservice.service.MessageService;

/**
 * Created by Connor on 2017.05.04..
 */
public class TwitterService implements MessageService {

  public TwitterService() {};

  @Override
  public String messageToString(String message, String destination) {
    return String.format("Twitter Sent to %s with Message = %s", destination, message);
  }
}

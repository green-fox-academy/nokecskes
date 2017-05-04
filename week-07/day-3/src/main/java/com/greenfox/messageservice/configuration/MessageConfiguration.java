package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProceeder;
import com.greenfox.messageservice.service.MessageService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Connor on 2017.05.04..
 */

@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public EmailService getEmailService () {
    return new EmailService();
  }

  @Bean
  public TwitterService getTwitterService() {
    return new TwitterService();
  }

}




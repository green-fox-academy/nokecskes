package com.greenfox.controllers;

import com.greenfox.models.Trick;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Connor on 2017.05.05..
 */
@Configuration
public class HippoConfig {

  @Bean
  public ArrayList<Trick> getTrickList() {
    ArrayList<Trick> trickList = new ArrayList<>();
    trickList.add(getTrick("code in Java"));
    trickList.add(getTrick("write HTML"));
    trickList.add(getTrick("chew hay"));
    trickList.add(getTrick("sleep underwater"));
    trickList.add(getTrick("swim in deep water"));
    return trickList;
  }

  public Trick getTrick(String trick) {
    return new Trick(trick);
  }
}

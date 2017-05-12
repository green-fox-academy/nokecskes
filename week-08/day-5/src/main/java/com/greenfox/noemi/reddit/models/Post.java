package com.greenfox.noemi.reddit.models;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Connor on 2017.05.12..
 */
@Entity
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String href;
  private Timestamp timestamp;
  private int score;

  public Post() {
    timestamp = new Timestamp(System.currentTimeMillis());
    score = 0;
  }
}

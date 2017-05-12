package com.greenfox.noemi.reddit.models;

import javax.persistence.Entity;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created by Connor on 2017.05.12..
 */
@Entity
@Getter
@Setter
public class Post {

  @id
  Long id;

  /*"id": 25,
          "title": "Dear JavaScript",
          "href": "http://9gag.com",
          "timestamp": 1494339525,
          "score": 791,*/

}

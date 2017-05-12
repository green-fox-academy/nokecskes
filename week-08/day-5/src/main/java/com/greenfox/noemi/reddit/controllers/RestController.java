package com.greenfox.noemi.reddit.controllers;

import com.greenfox.noemi.reddit.models.Post;
import com.greenfox.noemi.reddit.repository.PostRepository;
import java.util.ArrayList;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Connor on 2017.05.12..
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Iterable<Post> getposts() {
    return postRepository.findAll();
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post getposts(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }



}

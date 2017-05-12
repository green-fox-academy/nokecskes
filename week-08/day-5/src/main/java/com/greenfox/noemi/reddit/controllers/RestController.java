package com.greenfox.noemi.reddit.controllers;

import com.greenfox.noemi.reddit.models.Post;
import com.greenfox.noemi.reddit.models.PostList;
import com.greenfox.noemi.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
  public PostList getPosts() {
    PostList postList = new PostList();
    postList.setPosts(postRepository.findAll());
    return postList;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  //@RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  @PutMapping("/posts/{id}/upvote")
  public Post upvote(@PathVariable String id) {
    Long idLong = Long.parseLong(id);
    Post post = postRepository.findById(idLong);
    post.incrementScore();
    postRepository.save(post);
    return post;
  }

 @RequestMapping("/posts/{id}/downvote")
  public Post downvote(@PathVariable String id) {
    Long idLong = Long.parseLong(id);
    Post post = postRepository.findById(idLong);
    post.decrementScore();
    postRepository.save(post);
    return post;
  }



}

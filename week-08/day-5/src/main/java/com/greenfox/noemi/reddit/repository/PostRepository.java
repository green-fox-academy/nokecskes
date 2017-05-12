package com.greenfox.noemi.reddit.repository;

import com.greenfox.noemi.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Connor on 2017.05.12..
 */
public interface PostRepository extends CrudRepository<Post, Long> {

}

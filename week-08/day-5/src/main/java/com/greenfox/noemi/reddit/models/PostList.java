package com.greenfox.noemi.reddit.models;

import com.greenfox.noemi.reddit.repository.PostRepository;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Connor on 2017.05.12..
 */
@Getter
@Setter
public class PostList {

  Iterable<Post> posts;

}

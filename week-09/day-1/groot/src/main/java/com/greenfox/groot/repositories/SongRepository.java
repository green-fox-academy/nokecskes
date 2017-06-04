package com.greenfox.groot.repositories;

import com.greenfox.groot.models.Song;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by K on 2017.06.04..
 */
@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

  List<Song> findAll();

  List<Song> findAllByOrderByRatingDesc();

  Song findById(Long id);

  List<Song> findByAuthor(String author);

  List<Song> findByGenre(String genre);

  List<Song> findByYear(int year);

}

package com.greenfox.groot.service;

import com.greenfox.groot.models.Song;
import com.greenfox.groot.repositories.SongRepository;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017.06.04..
 */
@Service
public class SongService {

  @Autowired
  SongRepository songRepository;

  public List<Song> getPlayList() {
    if (songRepository.findAll().isEmpty()) {
      setUpPlayList();
    }
    return songRepository.findAll();
  }

  public void setUpPlayList() {
    songRepository.save(new Song
        ("Lordi", "Hard Rock Hallelujah", "fun-metal", 2006, 10));
    songRepository.save(new Song
        ("Aqua", "Barbie girl", "pop", 1997, 8));
    songRepository.save(new Song
        ("Vivaldi", "Concerto for two cellos in G minor, RV 531", "classical-metal", 1711, 10));
  }

  public List<Song> addToPlayList(@Valid Song song) {
    songRepository.save(song);
    return getPlayList();
  }

  public List<Song> deleteFromPlayList(long id) {
    songRepository.delete(id);
    return getPlayList();
  }

  public List<Song> updateRating (long id, int newRating) {
    Song songToUpdate = songRepository.findById(id);
    songToUpdate.setRating(newRating);
    songRepository.save(songToUpdate);
    return getPlayList();
  }

  public List<Song> listByAuthor(String author) {
    return songRepository.findByAuthor(author);
  }

  public List<Song> listByGenre(String genre) {
    return songRepository.findByGenre(genre);
  }

  public List<Song> listByYear(int year) {
    return songRepository.findByYear(year);
  }


  public List<Song> listFavorites(int numberOfListElements) {
    List<Song> orderedPlayList = songRepository.findAllByOrderByRatingDesc();
    List<Song> favorites= new ArrayList<>();
    for (int i = 0; i < numberOfListElements ; i++) {
      favorites.add(orderedPlayList.get(i));
    }
    return favorites;
  }
}

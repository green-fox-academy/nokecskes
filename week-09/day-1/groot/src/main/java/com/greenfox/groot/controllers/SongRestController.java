package com.greenfox.groot.controllers;

import com.greenfox.groot.models.ErrorMessage;
import com.greenfox.groot.models.Song;
import com.greenfox.groot.service.ErrorMessageService;
import com.greenfox.groot.service.SongService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017.06.04..
 */
@RestController
@RequestMapping("/awesome")
public class SongRestController {

  @Autowired
  SongService songService;

  @Autowired
  ErrorMessageService errorMessageService;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage noParameterHandler() {
    return errorMessageService.setErrorMessage("I am Groot");
  }

  @GetMapping("/")
  public List<Song> getPlayList() {
    return songService.getPlayList();
  }

  @PostMapping("/add")
  public List<Song> addToPlayList (@Valid @RequestBody Song song) {
    return songService.addToPlayList(song);
  }

  @DeleteMapping("/delete")
  public List<Song> deleteFromPlayList(@RequestParam("id") long id) {
    return songService.deleteFromPlayList(id);
  }

  @PutMapping("/updateRating")
  public List<Song> updateRating (@RequestParam("id") long id, @RequestParam("newRating") int newRating) {
    return songService.updateRating(id, newRating);
  }

  @GetMapping("/listByAuthor")
  public List<Song> listByFields(@RequestParam(value = "author") String author) {
    return songService.listByAuthor(author);
  }

  @GetMapping("/listByGenre")
  public List<Song> listByGenre(@RequestParam(value = "genre") String genre) {
    return songService.listByGenre(genre);
  }

  @GetMapping("/listByYear")
  public List<Song> listByYear(@RequestParam(value = "year") int year) {
    return songService.listByYear(year);
  }


  @GetMapping("/listFavorites")
  public List<Song> listFavorites(@RequestParam(value = "list") int numberOfListElements) {
    return songService.listFavorites(numberOfListElements);
  }

}

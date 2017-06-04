package com.greenfox.groot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


/**
 * Created by K on 2017.06.04..
 */
@Entity
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String author;
  private String title;
  private String genre;

  @Max(value = 2017, message = "Are you from the future?")
  private int year;

  @Min(value = 1, message = "The rating should be between 1 and 10.")
  @Max(value = 10, message = "The rating should be between 1 and 10.")
  private int rating;

  public Song() {
  }

  public Song(String author, String title, String genre, int year, int rating) {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.year = year;
    this.rating = rating;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}

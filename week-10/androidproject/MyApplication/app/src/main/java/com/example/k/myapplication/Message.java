package com.example.k.myapplication;

/**
 * Created by K on 2017.05.26..
 */

public class Message {

    String username;
    String text;

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

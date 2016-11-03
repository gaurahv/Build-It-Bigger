package com.example.Administrator.myapplication.backend;

import com.example.JokesClass;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {
    JokesClass jokeClass;

    public MyBean() {
        jokeClass = new JokesClass();
    }

    public String getData() {
        return jokeClass.getJoke();
    }
}
package com.example.wordle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wordle {

    private int attempts;
    private List<String> wordList = Arrays.asList("chili","snuff","stuff");
    private String word;

    //----------------------------------------------------------------------------------
    //constructor
    Wordle()
    {
        this.createWord(); //gets a new word everytime the class is created
    }

    //----------------------------------------------------------------------------------
    //method to get the word
    public String getWord()
    {
        return this.word;
    }

    //----------------------------------------------------------------------------------
    //method to create the word
    public void createWord()
    {
        int size = this.wordList.size(); //size of list
        int random = (int)(Math.random()* size) + 1; //select random word
        this.word = wordList.get(random);
    }
}

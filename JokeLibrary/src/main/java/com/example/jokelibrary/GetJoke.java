package com.example.jokelibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetJoke {

    List<String> list = new ArrayList<String>(){{
        add("What do you get when you cross a Jaguar and an Elephant? A sports car with a big trunk.");
        add("Why do all Java programmers wear glasses? Because they cannot C#.");
        add("Debugging definition: Being the detective in a crime movie where you are also the murderer.");
        add("Programmer definition: A machine that turns coffee into code.");
        add("Udacity's Android Developer Nanodegree is very up-to-date...");
    }};

    public String getRandomJoke() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
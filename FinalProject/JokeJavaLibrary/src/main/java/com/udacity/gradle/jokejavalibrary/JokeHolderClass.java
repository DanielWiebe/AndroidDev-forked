package com.udacity.gradle.jokejavalibrary;

import java.util.Random;

public class JokeHolderClass {
     private final String[] arrayOfJokes = new String[]{
             "Helvetica and Times New Roman walk into a bar. \"Get out of here!\" shouts the bartender. \"We don't serve your type.\"",
             "\"Doctor, I keep seeing an inspect buzzing around me.\"\n\"Don't worry; that's just a bug that's going around.\"",
             "Don't interrupt someone working intently on a puzzle. Chances are, you'll hear some crosswords.",
             "\"Did you hear about the monkeys who shared an Amazon account? They were Prime mates.\"",
             "Why are iPhone chargers not called Apple Juice?!",
             "\"How does a computer get drunk?\"\n \"It takes screenshots.\"",
             "\"Have you heard of that new band 1023 Megabytes? They're pretty good, but they don't have a gig just yet.\"",
             "\"I just got fired from my job at the keyboard factory. They told me I wasn’t putting in enough shifts.\"",
             "Person 1: Do you know how to use Outlook?\nPerson 2: As a matter of fact, I Excel at it.\nPerson 1: Was that a Microsoft Office pun? \nPerson 2: Word.",
             "Thanks to autocorrect, 1 in 5 children will be getting a visit from Satan this Christmas.",
             "I am hungary. \nMaybe you should czech the fridge.\nI'm russian to the kitchen.\nIs there any turkey?\nWe have some, but it's covered in greece.\nEw, there's norway I'd eat that!",

     };

     public String retrieveJokeFromJavaLibrary() {
          Random random = new Random();
          return arrayOfJokes[random.nextInt(arrayOfJokes.length - 1)];
     }
}

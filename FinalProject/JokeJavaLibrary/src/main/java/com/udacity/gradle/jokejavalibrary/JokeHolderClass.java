package com.udacity.gradle.jokejavalibrary;

import java.util.Random;

public class JokeHolderClass {
     private final String[] arrayOfJokes = new String[]{
             "Helvetica and Times New Roman walk into a bar. \"Get out of here!\" shouts the bartender. \"We don't serve your type.\"",
             "\\u201CDoctor, I keep seeing an inspect buzzing around me.\\u201D\\r\\n\\r\\n\\u201CDon\\u2019t worry; that\\u2019s just a bug that\\u2019s going around.\\u201D",
             "Don\u2019t interrupt someone working intently on a puzzle. Chances are, you\u2019ll hear some crosswords.",
             "Did you hear about the monkeys who shared an Amazon account? They were Prime mates.",
             "Why are iPhone chargers not called Apple Juice?!",
             "Q. How does a computer get drunk?\\r\\n\\r\\nA. It takes screenshots.",
             "Have you heard of that new band \\u201C1023 Megabytes\\u201D? They\\u2019re pretty good, but they don\\u2019t have a gig just yet.",
             "I just got fired from my job at the keyboard factory. They told me I wasn’t putting in enough shifts.",
             "Person 1: Do you know how to use Outlook?\\r\\n\\r\\nPerson 2: As a matter of fact, I Excel at it.\\r\\n\\r\\nPerson 1: Was that a Microsoft Office pun?\\r\\n\\r\\nPerson 2: Word.",
             "Thanks to autocorrect, 1 in 5 children will be getting a visit from Satan this Christmas.",
             "\\u201CI am hungary.\\u201D\\r\\n\\r\\n\\u201CMaybe you should czech the fridge.\\u201D\\r\\n\\r\\n\\u201CI\\u2019m russian to the kitchen.\\u201D\\r\\n\\r\\n\\u201CIs there any turkey?\\u201D\\r\\n\\r\\n\\u201CWe have some, but it\\u2019s covered in greece\\u201D\\r\\n\\r\\n\\u201Cew, there\\u2019s norway I\\u2019d eat that!\\u201D",

     };

     public String retrieveJokeFromJavaLibrary() {
          Random random = new Random();
          return arrayOfJokes[random.nextInt(arrayOfJokes.length - 1)];
     }
}

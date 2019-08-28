package com.udacity.gradle.jokeandroidlibrarywithactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JokeActivity extends AppCompatActivity {
     public static String KEY = "Joke key";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_joke);
          TextView view = findViewById(R.id.jokeReceiveTV);
          Bundle extras = getIntent().getExtras();
          if (extras == null){
               return;
          }

          String receivedJoke = extras.getString(KEY);
          if (receivedJoke!=null){
               view.setText(receivedJoke);
          }

     }
}

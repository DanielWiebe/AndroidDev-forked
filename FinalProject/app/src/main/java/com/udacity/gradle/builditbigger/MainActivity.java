package com.udacity.gradle.builditbigger;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.udacity.gradle.jokeandroidlibrarywithactivity.JokeActivity;


public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
     }

//     public void tellJoke(View view) {
//
//          JokeHolderClass jokes = new JokeHolderClass();
//          String randomJoke = jokes.retrieveJokeFromJavaLibrary();
//          Toast.makeText(this, randomJoke, Toast.LENGTH_SHORT).show();
//          Intent myIntent = new Intent(getApplicationContext(), JokeActivity.class);
//          myIntent.putExtra(JokeActivity.KEY, randomJoke);
//          startActivity(myIntent);
//     }


     @SuppressLint("StaticFieldLeak")
     public void tellJoke(View view) {
          new EndpointsAsyncTask() {
               @Override
               protected void onPostExecute(String result) {
                    Intent myIntent = new Intent(getApplicationContext(), JokeActivity.class);
                    myIntent.putExtra(JokeActivity.KEY, result);
                    startActivity(myIntent);
               }
          }.execute();

     }
}

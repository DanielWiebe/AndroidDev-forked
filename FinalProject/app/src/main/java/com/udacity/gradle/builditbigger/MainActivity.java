package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.udacity.gradle.jokeandroidlibrarywithactivity.JokeActivity;
import com.udacity.gradle.jokejavalibrary.JokeHolderClass;


public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
     }


     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
          // Inflate the menu; this adds items to the action bar if it is present.
          getMenuInflater().inflate(R.menu.menu_main, menu);
          return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
          // Handle action bar item clicks here. The action bar will
          // automatically handle clicks on the Home/Up button, so long
          // as you specify a parent activity in AndroidManifest.xml.
          int id = item.getItemId();

          //noinspection SimplifiableIfStatement
          if (id == R.id.action_settings) {
               return true;
          }

          return super.onOptionsItemSelected(item);
     }

     public void tellJoke(View view) {

          JokeHolderClass jokes = new JokeHolderClass();
          String randomJoke = jokes.retrieveJokeFromJavaLibrary();
          Toast.makeText(this, randomJoke, Toast.LENGTH_SHORT).show();
          Intent myIntent = new Intent(getApplicationContext(), JokeActivity.class);
          myIntent.putExtra(JokeActivity.KEY, randomJoke);
          startActivity(myIntent);
     }


     //public void tellJoke(View view) {
//          new ASyncTaskToEndpoints() {
//               @Override
//               protected void onPostExecute(String result) {
//                    Intent myIntent = new Intent(getApplicationContext(), JokeActivity.class);
//                    myIntent.putExtra(JokeActivity.KEY, result);
//
//                    startActivity(myIntent);
//               }
//          }

}

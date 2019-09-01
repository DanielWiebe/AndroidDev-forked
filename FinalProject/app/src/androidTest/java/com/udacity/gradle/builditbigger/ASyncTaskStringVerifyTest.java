package com.udacity.gradle.builditbigger;

import android.util.Log;

import androidx.test.runner.AndroidJUnit4;
import androidx.test.runner.AndroidJUnitRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

@RunWith(AndroidJUnit4.class)
public class ASyncTaskStringVerifyTest extends AndroidJUnitRunner {

     @Test
     public void testForNonEmptyJokeReceivedFromTask() {
          try {
               Thread.sleep(5000);
               EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
               asyncTask.execute();
               String jokeReceived = asyncTask.get(10, TimeUnit.SECONDS);

               assertNotNull(jokeReceived);
               assertTrue(jokeReceived.length() > 0);
          } catch (InterruptedException e) {
               Log.e("Test", "task test interrupted");
          } catch (ExecutionException e) {
               e.printStackTrace();
          } catch (TimeoutException e) {
               Log.e("Test", "task test timed out");
               e.printStackTrace();
          } catch (Exception e) {
               fail("test failed");
          }
     }
}

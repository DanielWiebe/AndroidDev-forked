package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivityFragment extends Fragment {

     public MainActivityFragment() {
     }

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

          View root = inflater.inflate(R.layout.fragment_main, container, false);
          if (BuildConfig.FLAVOR.equals("free")) {
               AdView mAdView = (AdView) root.findViewById(R.id.adView);
               // Create an ad request. Check logcat output for the hashed device ID to
               // get test ads on a physical device. e.g.
               // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
               AdRequest adRequest = new AdRequest.Builder()
                       .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                       .build();
               mAdView.loadAd(adRequest);
          }
          return root;
     }
}

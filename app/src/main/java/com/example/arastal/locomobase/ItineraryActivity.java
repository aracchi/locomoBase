package com.example.arastal.locomobase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by arastal on 8/6/2016.
 */
public class ItineraryActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itinerary_activity);

        TextView display = (TextView)findViewById(R.id.itinerary_title);
    }
}

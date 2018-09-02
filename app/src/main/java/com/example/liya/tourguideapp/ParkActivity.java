package com.example.liya.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back);
        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.brno_dam, R.string.brno_dam_desc));
        locations.add(new Location(R.string.zoo_brno, R.string.zoo_brno_desc));
        locations.add(new Location(R.string.botanica, R.string.botanica_desc));
        locations.add(new Location(R.string.park_luzanky, R.string.park_luzanky_desc));
        locations.add(new Location(R.string.junglepark, R.string.junglepark_desc));
        locations.add(new Location(R.string.open_gardens, R.string.open_gardens_desc));

        // setting up the array adapter
        LocationAdapter adapter = new LocationAdapter(this, locations);

        // finding the listView and setting the adapter to it
        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

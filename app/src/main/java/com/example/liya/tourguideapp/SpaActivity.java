package com.example.liya.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class SpaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spa);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.infinit, R.string.infinit_desc));
        locations.add(new Location(R.string.tawan, R.string.tawan_desc));
        locations.add(new Location(R.string.happyyoga, R.string.happyyoga_desc));
        locations.add(new Location(R.string.relax_body, R.string.realx_body_desc));
        locations.add(new Location(R.string.forcomfort, R.string.forcomfort_desc));
        locations.add(new Location(R.string.masaze, R.string.masaze_desc));
        locations.add(new Location(R.string.sabai, R.string.sabai_desc));
        locations.add(new Location(R.string.infinit_lesna, R.string.infinit_lesna_desc));


        // setting up the array adapter
        LocationAdapter adapter = new LocationAdapter(this, locations);

        // finding the listView and setting the adapter to it
        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

package com.example.liya.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.grandezza, R.string.grandezza_desc, R.drawable.grandezza));
        locations.add(new Location(R.string.barcelo, R.string.barcelo_desc, R.drawable.barcelo));
        locations.add(new Location(R.string.avanti, R.string.avanti_desc, R.drawable.avanti));
        locations.add(new Location(R.string.royal, R.string.royal_desc, R.drawable.royal));
        locations.add(new Location(R.string.grandhotel, R.string.grandhotel_desc, R.drawable.grand));
        locations.add(new Location(R.string.best, R.string.best_desc, R.drawable.best));
        locations.add(new Location(R.string.orea, R.string.orea_desc, R.drawable.oreo));
        locations.add(new Location(R.string.sono, R.string.sono_desc, R.drawable.sono));
        locations.add(new Location(R.string.efi, R.string.efi_desc, R.drawable.efi));

        // setting up the array adapter
        LocationAdapter adapter = new LocationAdapter(this, locations);

        // finding the listView and setting the adapter to it
        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

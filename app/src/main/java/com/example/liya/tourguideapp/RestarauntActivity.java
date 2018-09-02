package com.example.liya.tourguideapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class RestarauntActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.borgo, R.string.borgo_desc));
        locations.add(new Location(R.string.koishi, R.string.koishi_desc));
        locations.add(new Location(R.string.pavilion, R.string.pavilion_desc));
        locations.add(new Location(R.string.valoria, R.string.valoria_desc));
        locations.add(new Location(R.string.pegas, R.string.pegas_desc));
        locations.add(new Location(R.string.starobrno, R.string.starobrno_desc));
        locations.add(new Location(R.string.tulip, R.string.tulip_desc));
        locations.add(new Location(R.string.ktery, R.string.ktery_desc));


        // setting up the array adapter
        LocationAdapter adapter = new LocationAdapter(this, locations);

        // finding the listView and setting the adapter to it
        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

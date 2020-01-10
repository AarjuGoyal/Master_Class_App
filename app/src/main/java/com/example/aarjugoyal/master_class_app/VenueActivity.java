package com.example.aarjugoyal.master_class_app;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class VenueActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap Venue_Location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);
        Log.e("VenueActivty","My run reached here 0");

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.venueToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Location");
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        Log.e("VenueActivty","My run reached here 1");

        Venue_Location = googleMap;
        Venue_Location.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        Log.e("VenueActivty","My run reached here 2");
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(23.047690, 72.570412);
        Venue_Location.addMarker(new MarkerOptions().position(sydney).title("Fortune Landmark Hotel"));

        Log.e("VenueActivty","My run reached here 3");
        Venue_Location.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}

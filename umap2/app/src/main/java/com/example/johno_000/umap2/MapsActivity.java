package com.example.johno_000.umap2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    public void initMap(LatLng start, LatLng end){
        double lat = (start.latitude + end.latitude)/2;
        double lon = (start.longitude + end.longitude)/2;
        LatLng camera = new LatLng(lat, lon);
        double dist = Math.sqrt(Math.pow((end.latitude-start.latitude),2)+ Math.pow((end.longitude-start.longitude),2));
        if(dist < .004){
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(camera, 18f));
        }
        else if(dist < .005){
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(camera, 17f));
        }
        else if(dist < .006){
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(camera, 16f));
        }
        else {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(camera, 15f));
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng lib = new LatLng(42.389944, -72.5285212);
        LatLng ILC = new LatLng(42.39089999, -72.525261);
        LatLng has = new LatLng(42.392088, -72.525893);
        mMap.addMarker(new MarkerOptions().position(has).title("ILC"));
        LatLng ISB = new LatLng(42.3867, -72.524);
        mMap.addMarker(new MarkerOptions().position(ILC).title("Isenburg"));
        initMap(has,ILC);
    }
}

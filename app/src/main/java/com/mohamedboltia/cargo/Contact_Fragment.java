package com.mohamedboltia.cargo;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Contact_Fragment extends Fragment implements OnMapReadyCallback {

    GoogleMap map;
    private static final int Location_request = 500;
    ArrayList<LatLng> list_points;
   // Marker m1,m2;
  //  Double lati,longe;
  //  Double lati2,longe2;

    public Contact_Fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_contact_, container, false);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map3);
        mapFragment.getMapAsync(this);
        list_points = new ArrayList<>();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.getUiSettings().setZoomControlsEnabled(true);
//     LatLng cairo = new LatLng(30.03855885, 31.21205711);
//     m1=map.addMarker(new MarkerOptions().position(cairo).title("Cairo"));
//        map.moveCamera(CameraUpdateFactory.newLatLng(cairo));
//        LatLng latLng=m1.getPosition();
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(),new String[] {Manifest.permission.ACCESS_FINE_LOCATION},Location_request);

            return ;
        }
        map.setMyLocationEnabled(true);
       /* map.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {
                //Reset marker when already 2
                if (list_points.size() == 2){
                    list_points.clear();
                    map.clear();
                }
                //save first point select
                list_points.add(latLng);
                //create marker
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(latLng);
                if (list_points.size() == 1){

                    //Add first marker to map
                    markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
             /*       m1=  map.addMarker(new MarkerOptions().title("Cairo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
                   LatLng latLng1=m1.getPosition();
                    lati=latLng1.latitude;
                    longe=latLng1.longitude;*/
/*
                }else {
                    //Add second marker
                    markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
                   /* m2=  map.addMarker(new MarkerOptions().title("Cairo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
                    LatLng latLng2=m2.getPosition();
                    lati2=latLng2.latitude;
                    longe2=latLng2.longitude;*//*
                }
                map.addMarker(markerOptions);*/

            }
 /*       });

    }

    @SuppressLint("MissingPermission")
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case Location_request :
                if (grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    map.setMyLocationEnabled(true);
                }
                break;
        }
    }*/
}

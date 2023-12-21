package com.example.a07ex11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var map: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        map = findViewById<MapView>(R.id.map)
        map.onCreate(savedInstanceState)
        map.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val helsinque = LatLng(60.1097541, 24.6890498)
        val bebedouro = LatLng(-20.9375332, -48.5196743)
        val ifsp = LatLng(-20.5217811, -48.5780139)

        mMap.addMarker(MarkerOptions().position(helsinque).title("Marker in Helsinque - FIN"))
        mMap.addMarker(MarkerOptions().position(bebedouro).title("Marker in Bebedouro - SP"))
        mMap.addMarker(MarkerOptions().position(ifsp).title("Marker in IFSP - Barretos"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(ifsp))
        mMap.setMinZoomPreference(20f)
    }

    override fun onResume() {
        super.onResume()
        map.onResume()
    }
}
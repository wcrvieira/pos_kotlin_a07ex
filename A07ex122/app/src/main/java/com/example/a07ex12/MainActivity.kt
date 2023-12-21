package com.example.a07ex12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        // Inicialize o MapView e o GoogleMap
        map = findViewById<MapView>(R.id.map)
        map.onCreate(savedInstanceState)
        map.getMapAsync(this)

        val bebedouro = LatLng(-20.9375332, -48.5196743)
        val ifsp = LatLng(-20.5217811, -48.5780139)
        val senai = LatLng(-20.955136, -48.4704256)

        val btnCasa = findViewById<Button>(R.id.btnCasa)
        val btnEscola = findViewById<Button>(R.id.btnEscola)
        val btnTrabalho = findViewById<Button>(R.id.btnTrabalho)

        btnCasa.setOnClickListener {
            mMap.addMarker(MarkerOptions().position(bebedouro).title("Minha casa"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(bebedouro))
        }

        btnEscola.setOnClickListener {
            mMap.addMarker(MarkerOptions().position(ifsp).title("IFSP Barretos"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ifsp))
        }

        btnTrabalho.setOnClickListener {
            mMap.addMarker(MarkerOptions().position(senai).title("Senat Sertãozinho"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(senai))
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map.onResume()
    }
}
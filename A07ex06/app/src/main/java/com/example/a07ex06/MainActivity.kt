package com.example.a07ex06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var r = findViewById<RecyclerView>(R.id.rv)

        r.layoutManager = LinearLayoutManager(this)

        var arr = Array<String>(100){"$it"}

        var adapter = CustomAdapter(arr)

        r.adapter = adapter
    }
}
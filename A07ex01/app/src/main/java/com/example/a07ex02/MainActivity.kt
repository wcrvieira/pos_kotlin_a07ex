package com.example.a07ex02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var meuLayout = findViewById<ConstraintLayout>(R.id.meuLayout)

        meuLayout.setOnClickListener { view ->

            var rotulo = findViewById<TextView>(R.id.textView)

            var s = Snackbar.make(view, rotulo.text, Snackbar.LENGTH_INDEFINITE)
            s.setAction("Fechar", { s.dismiss() })
            s.show()
        }
    }
}
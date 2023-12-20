package com.example.a07ex08

import android.app.Instrumentation.ActivityResult
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    lateinit var btnCapturar: Button
    lateinit var imgFoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCapturar = findViewById(R.id.btnCapturar)
        imgFoto = findViewById(R.id.imgFoto)
    }

    val register = registerForActivityResult(
        ActivityResultContracts.TakePicturePreview()
    ) { image: Bitmap? ->
        imgFoto.setImageBitmap(image)
    }

    fun capturarFoto(view: View) {
        register.launch(null)
    }
}
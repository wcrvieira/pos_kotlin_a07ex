package com.example.a07ex03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabChamadas = findViewById<ExtendedFloatingActionButton>(R.id.fabChamadas)
        val fabNavegador = findViewById<ExtendedFloatingActionButton>(R.id.fabNavegador)
        val fabSMS = findViewById<ExtendedFloatingActionButton>(R.id.fabSMS)
        val fabEmail = findViewById<ExtendedFloatingActionButton>(R.id.fabEmail)

        fabChamadas.setOnClickListener {
            val intentCall = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:" + "1733439695")
            }
            startActivity(intentCall)
        }

        fabNavegador.setOnClickListener {
            val intentBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("https://gmail.com"))
            startActivity(intentBrowser)
        }

        fabSMS.setOnClickListener {
            val intentSMS = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("sms:" + "17334396954")
                putExtra("sms_body", "Olá mundo!")
            }
            startActivity(intentSMS)
        }

        fabEmail.setOnClickListener {
            val intentEmail = Intent(Intent.ACTION_SEND)
            intentEmail.data = Uri.parse("mailto:")
            intentEmail.type = "message/rfc822"
            intentEmail.putExtra(Intent.EXTRA_EMAIL, arrayOf("teste@gmail.com", "teste@gmail.com"));
            intentEmail.putExtra(Intent.EXTRA_SUBJECT, "Assunto");
            intentEmail.putExtra(Intent.EXTRA_TEXT, "Mensagem");
            startActivity(intentEmail)
        }
    }
}
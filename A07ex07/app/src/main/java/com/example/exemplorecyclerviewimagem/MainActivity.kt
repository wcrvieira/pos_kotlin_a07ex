package com.example.exemplorecyclerviewimagem

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

        // definindo o array de produtos
        var arr = ArrayList<Produto>()
        // adicionando dois primeiros produtos
        arr.add(Produto(android.R.drawable.ic_menu_camera, "Máquina fotográfica", "R$ 100,00"))
        arr.add(Produto(android.R.drawable.ic_menu_call, "Telefone analógico", "R$ 12,00"))
        // adicionando os demais produtos fictícios
        for (i in 3 .. 99)
            arr.add(Produto(android.R.drawable.ic_menu_edit,"Produto $i", "R$ $i,99"))
        // definindo o adapter
        var adapter = CustomAdapter(arr)
        r.adapter = adapter
    }
}
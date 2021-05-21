package com.example.build_variants_tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoUm = findViewById<Button>(R.id.btnOne)
        val botaoDois = findViewById<Button>(R.id.btnTwo)
        val botaoTres = findViewById<Button>(R.id.btnTree)

        botaoUm.setOnClickListener {
            Toast.makeText(applicationContext, R.string.clickOne, Toast.LENGTH_LONG).show()
        }

        botaoDois.setOnClickListener {
            Toast.makeText(applicationContext, R.string.clickTwo, Toast.LENGTH_LONG).show()
        }

        botaoTres.setOnClickListener {
            Toast.makeText(applicationContext, R.string.clickTree, Toast.LENGTH_LONG).show()
        }


    }
}
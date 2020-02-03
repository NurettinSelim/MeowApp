package com.nurettinselim.meowapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var ses1: MediaPlayer? = null
    private var ses2: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ses1 = MediaPlayer.create(this, R.raw.meow1)
        ses1?.setOnPreparedListener{println("ready")}

        ses2 = MediaPlayer.create(this, R.raw.first_miuw)
        ses2?.setOnPreparedListener{println("ready")}
        ses2?.start()

        val kedyler_button = findViewById<Button>(R.id.btn1)

    }

    fun sesMeow1(view: View){
        ses1?.start()
    }

    fun kedy_buton(view: View){
        val intent = Intent(this, kediler::class.java)
        startActivity(intent)
    }

    fun miuw_buton(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }




    //


}

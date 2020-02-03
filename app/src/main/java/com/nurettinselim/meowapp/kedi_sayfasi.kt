package com.nurettinselim.meowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_kedi_sayfasi.*

class kedi_sayfasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedi_sayfasi)

        var intent = intent

        var kedy_name = intent.getStringExtra("name")
        var kedy_story = intent.getStringExtra("story")
        var kedy_res = intent.getStringExtra("res")
        name.text = kedy_name
        story.text = kedy_story
        resim.setImageBitmap(resimBitmap)
    }





    fun kedy_buton(view: View){
        val intent = Intent(this, kediler::class.java)
        startActivity(intent)
    }

    fun miuw_buton(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

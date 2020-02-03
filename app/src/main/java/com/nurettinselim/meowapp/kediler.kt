package com.nurettinselim.meowapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_kediler.*


var resimBitmap : Bitmap? = null

class kediler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kediler)

        var kedyler = HashMap<String,String>()

        kedyler.put("Angelina Pelinsu","Dış görüşünüşe önem verir. Berkecan en yakın kankasıdır. Diğer kedylerin hepsinden nefret eder.")
        kedyler.put("Şaşkın Kedy","Dedesinden bayram harçlığını almış ve annesi ona 'Paranı biz alacağız' demiş ve parasını saklama yolu düşünüyor.")
        kedyler.put("Şişkoo","Dünyaları yeme potansiyeline sahip. Düştü mü aynen böyle kalır ve kalır :D")
        kedyler.put("uwu uwu","Sevdiceğini görmüş tatlııış")
        kedyler.put("Uykucuu", "Yeni uyanmış boş boş bakınıyor")




        val res_pelinsu = BitmapFactory.decodeResource(this.resources, R.drawable.kedi1)
        val res_saskin = BitmapFactory.decodeResource(this.resources, R.drawable.kedi2)
        val res_sisko = BitmapFactory.decodeResource(this.resources, R.drawable.kedi3)
        val res_uwu = BitmapFactory.decodeResource(this.resources, R.drawable.kedi4)
        val res_uykucu = BitmapFactory.decodeResource(this.resources, R.drawable.kedi5)

        var res = HashMap<String, Bitmap>()

        res.put("Angelina Pelinsu",res_pelinsu)
        res.put("Şaşkın Kedy",res_saskin)
        res.put("Şişkoo",res_sisko)
        res.put("uwu uwu",res_uwu)
        res.put("Uykucuu",res_uykucu)


        var kedy_numara = ArrayList<String>()

        var i = 0
        for(kedy in ArrayList(kedyler.keys)){
            i++
            kedy_numara.add("Kedi $i: $kedy")

        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, kedy_numara)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, kedi_sayfasi::class.java)
            intent.putExtra("name", ArrayList(kedyler.keys)[position])
            intent.putExtra("story", ArrayList(kedyler.values)[position])
            resimBitmap = res[ArrayList(kedyler.keys)[position]]
            startActivity(intent)

        }

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


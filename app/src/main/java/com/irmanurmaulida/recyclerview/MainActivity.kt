package com.irmanurmaulida.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.irmanurmaulida.recyclerview.adapter.AdapterTeamBola
import com.irmanurmaulida.recyclerview.databinding.ActivityMainBinding
import com.irmanurmaulida.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Thibaut Courtois",R.drawable.courtois, "Penjaga Gawang", "2.00m", "Bre(Belgia)", "11 Mei 1992"))
        listPemain.add(Pemain("Karim Benzema",R.drawable.benzema, "Penyerang", "1.85m", "Lyon(Francis)", "19 Desember 1987"))
        listPemain.add(Pemain("Marcelo Vieira da Silva",R.drawable.marcello, "Belakang", "1.74m", "Rio de Janeiro(Brazil)", "12 Mei 1988"))
        listPemain.add(Pemain("Sergio Ramos Garcia",R.drawable.ramos, "Belakang", "1.84m", "Camas (Sevilla)", "30 Maret 1986"))
        listPemain.add(Pemain("Zinedine Yazid Zidane",R.drawable.zidan, "Pelatih", "1.85m", "Marsille(Prancis)", "23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola(this, listPemain, object : AdapterTeamBola.OnclickListener {
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }
        })
    }

}
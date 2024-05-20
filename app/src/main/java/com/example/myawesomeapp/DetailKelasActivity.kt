package com.example.myawesomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailKelasActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataMahasiswaClass>
    private lateinit var adapter: AdapterClass

    lateinit var imageMahasiswaList: Array<Int>
    lateinit var nameMahasiswaList: Array<String>
    lateinit var nimMahasiswaList: Array<String>
    lateinit var kelasMahasiswaList: Array<String>
    lateinit var prodiMahasiswaList: Array<String>
    lateinit var jurusanMahasiswaList: Array<String>
    lateinit var alamatMahasiswaList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kelas)

        imageMahasiswaList = arrayOf(
            R.drawable.imgmahasiswa1,
            R.drawable.imgmahasiswa2,
            R.drawable.imgmahasiswa3,
            R.drawable.imgmahasiswa4,
            R.drawable.imgmahasiswa5,
            R.drawable.imgmahasiswa6,
            R.drawable.imgmahasiswa7,
            R.drawable.imgmahasiswa8,
            R.drawable.imgmahasiswa9,
            R.drawable.imgmahasiswa10,
            R.drawable.imgmahasiswa11,
            R.drawable.imgmahasiswa12,
            R.drawable.imgmahasiswa13,
            R.drawable.imgmahasiswa14,
            R.drawable.imgmahasiswa15,
            R.drawable.imgmahasiswa16,
            R.drawable.imgmahasiswa17,
            R.drawable.imgmahasiswa18,
            R.drawable.imgmahasiswa19,
            R.drawable.imgmahasiswa20,
            R.drawable.imgmahasiswa21,
            R.drawable.imgmahasiswa22,
            R.drawable.imgmahasiswa23,
            R.drawable.imgmahasiswa24,
            R.drawable.imgmahasiswa25,
            R.drawable.imgmahasiswa26,
            R.drawable.imgmahasiswa27,
            R.drawable.imgmahasiswa28)

        nameMahasiswaList = arrayOf(
            "ADI ALAM",
            "ACHMAD HAMDANI",
            "ALZAMNA L.A.",
            "ANNISYA",
            "BAGAS YUDHA A.",
            "BAGUS PRASETYO",
            "BINTANG RAKA PUTRA",
            "DIRAJATI KUSUMA W.",
            "EVITA DWI R.",
            "FERRY FERNANDO",
            "HADZIQ NAUFAL A.",
            "ILHAM GADING P.",
            "ILHAM SURYAPUTRA",
            "ILMA AYU P.S.",
            "KRESS SATU JAVA D.",
            "LENI AYU",
            "MUAZ M.H.",
            "M. IKHSAN A.",
            "M. MIFTAHUL KARIM",
            "NIHLATANSYA",
            "NIKEN PUTRI",
            "PUTRI ARENSYA",
            "RIFIA MARSYADAH",
            "SAMUDRA HAQQI A.",
            "TRIYANI",
            "UMI LATIFAH",
            "WARDA IMANA",
            "YOLA SEPTIANINGRUM")

        nimMahasiswaList = arrayOf(
            "233307091",
            "233307092",
            "233307093",
            "233307094",
            "233307095",
            "233307096",
            "233307097",
            "233307098",
            "233307099",
            "233307100",
            "233307101",
            "233307102",
            "233307103",
            "233307104",
            "233307105",
            "233307106",
            "233307107",
            "233307108",
            "233307109",
            "233307110",
            "233307111",
            "233307112",
            "233307113",
            "233307114",
            "233307115",
            "233307116",
            "233307117",
            "233307118")

            kelasMahasiswaList = arrayOf(
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D",
            "TI D")

        prodiMahasiswaList = arrayOf(
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI",
            "TEKNOLOGI INFORMASI")

        jurusanMahasiswaList = arrayOf(
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK",
            "TEKNIK")

        alamatMahasiswaList = arrayOf(
            "MADIUN",
            "MADIUN",
            "MADIUN",
            "MAGETAN",
            "NGAWI",
            "MAGETAN",
            "NGAWI",
            "MADIUN",
            "MAGETAN",
            "MAGETAN",
            "MADIUN",
            "NGAWI",
            "NGAWI",
            "MADIUN",
            "MADIUN",
            "PONOROGO",
            "MADIUN",
            "MADIUN",
            "TULUNGAGUNG",
            "NGANJUK",
            "MAGETAN",
            "MADIUN",
            "MADIUN",
            "MADIUN",
            "MAGETAN",
            "MAGETAN",
            "NGAWI",
            "MAGETAN")

        recyclerView = findViewById(R.id.rvDetailKelas)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataMahasiswaClass>()
        getData()

        adapter = AdapterClass (dataList)
        recyclerView.adapter = adapter
    }

    private fun getData() {
        for (i in imageMahasiswaList.indices) {
            val dataMahasiswa = DataMahasiswaClass (
                imageMahasiswaList[i],
                nameMahasiswaList[i],
                nimMahasiswaList[i],
                kelasMahasiswaList[i],
                prodiMahasiswaList[i],
                jurusanMahasiswaList[i],
                alamatMahasiswaList[i]
            )
        dataList.add(dataMahasiswa)
        }
    }
}
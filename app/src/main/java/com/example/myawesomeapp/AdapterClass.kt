package com.example.myawesomeapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private var dataList: ArrayList<DataMahasiswaClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.detail_kelas_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImageMahasiswa.setImageResource(currentItem.dataImage)
        holder.rvNameMahasiswa.text = currentItem.dataName
        holder.rvNimMahasiswa.text = currentItem.dataNim
        holder.rvKelasMahasiswa.text = currentItem.dataKelas
        holder.rvProdiMahasiswa.text = currentItem.dataProdi
        holder.rvJurusanMahasiswa.text = currentItem.dataJurusan
        holder.rvAlamatMahasiswa.text = currentItem.dataAlamat
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImageMahasiswa:ImageView = itemView.findViewById(R.id.imgMahasiswa)
        val rvNameMahasiswa:TextView = itemView.findViewById(R.id.tvNameMahasiswa)
        val rvNimMahasiswa:TextView = itemView.findViewById(R.id.tvNimMahasiswa)
        val rvKelasMahasiswa:TextView = itemView.findViewById(R.id.tvKelasMahasiswa)
        val rvProdiMahasiswa:TextView = itemView.findViewById(R.id.tvProdiMahasiswa)
        val rvJurusanMahasiswa:TextView = itemView.findViewById(R.id.tvJurusanMahasiswa)
        val rvAlamatMahasiswa:TextView = itemView.findViewById(R.id.tvAlamatMahasiswa)
    }
}
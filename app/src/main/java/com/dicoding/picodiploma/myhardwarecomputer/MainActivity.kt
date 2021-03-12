package com.dicoding.picodiploma.myhardwarecomputer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHardware : RecyclerView
    private var list: ArrayList<Hardware> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHardware = findViewById(R.id.rv_hardware)
        rvHardware.setHasFixedSize(true)

        list.addAll(HardwareData.listData)
        showRecyclerlist()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_icon, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, Profile::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showRecyclerlist(){
        rvHardware.layoutManager = LinearLayoutManager(this)
        val listHardwareAdapter = ListHardwareAdapter (list)
        rvHardware.adapter = listHardwareAdapter

        listHardwareAdapter.setOnItemClickCallback(object : ListHardwareAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hardware) {
                showSelectedHardware(data)
            }
        })
    }

    private fun showSelectedHardware(hardware: Hardware) {
        val moveIntent = Intent(this@MainActivity, HardwareDetail::class.java)

        moveIntent.putExtra(HardwareDetail.EXTRA_NAME, hardware.name)
        moveIntent.putExtra(HardwareDetail.EXTRA_DETAIL, hardware.detail)
        moveIntent.putExtra(HardwareDetail.EXTRA_IMAGES, hardware.photo)
        startActivity(moveIntent)
    }
}
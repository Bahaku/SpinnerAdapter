package com.example.spinneradapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private var spinner: Spinner? = null
    private var btnGo: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupAdapter()
        //setupListener()
        spinnerListener()
    }

    private fun setupView() {
        spinner = findViewById(R.id.spinner)
        btnGo = findViewById(R.id.btnGo)

    }

    private fun setupAdapter() {
        val adapter = SpinnerAdapter(applicationContext, R.id.tvTitle, getData())
        spinner?.adapter = adapter
    }

    private fun getData(): ArrayList<CustomDataClass> {
        val data = arrayListOf<CustomDataClass>()

        data.add(CustomDataClass(1, "Грид"))
        data.add(CustomDataClass(2, "Лайнир"))
        return data

    }

    private fun spinnerListener() {
        val int = Intent(applicationContext, RecycleView::class.java)
        val inte = Intent(applicationContext, RecycleViewGrid::class.java)

        spinner?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {

                btnGo?.setOnClickListener {
                    if (position != 0)
                        startActivity(int)
                    else {
                        startActivity(inte)
                    }
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }
    }


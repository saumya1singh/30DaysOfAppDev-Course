package com.example.day13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomer= intent.getStringExtra(MainActivity.KEY)

        tVOrder.text= "Order Placed " + ordersOfCustomer.toString()
    }
}
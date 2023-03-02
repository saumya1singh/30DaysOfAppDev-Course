package com.example.day22project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Saumya", "Prastuti", "Ankit", "Pradeep", "Aman")

        val lastMsg = arrayOf("Hey everyone", "I am fine", "Good", "Awesome", "cool")

        val lastMsgTime = arrayOf("6:25 AM", "7:30 PM", "5:00 PM", "6:25 AM", "7:30 PM")

        val phoneNumber = arrayOf("786453739", "986453739", "7366382829", "7383413440", "4159251517")

        val imgId = intArrayOf(R.drawable.pic5, R.drawable.pic1, R.drawable.pic2,
        R.drawable.pic3, R.drawable.pic4)

        userArrayList = ArrayList()

        for(eachIndex in name.indices){
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phoneNumber[eachIndex],
            imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { parent, view, position, id ->
            // open a new activity

            val userName = name[position]
            val userPhone = phoneNumber[position]
            val imageId = imgId[position]

            val i = Intent(this, UserActivity::class.java)

            i.putExtra("name", userName)
            i.putExtra("phone", userPhone)
            i.putExtra("imageId", imageId)
            startActivity(i)
        }


    }
}
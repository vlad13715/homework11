package com.example.homework11

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    var image:ImageView?=null
    var changeImage:Button?=null
    var editText:EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         image = findViewById<ImageView>(R.id.ivPicture)
         changeImage = findViewById<Button>(R.id.btnChangeImage)
        editText = findViewById<EditText>(R.id.etSearchPicture)
        setOnClickListeners()



    }

    private fun setOnClickListeners() {
        changeImage?.setOnClickListener {
            when (editText?.text.toString()) {
                "kotlin" -> image?.setImageDrawable(getDrawable(R.drawable.kotlin))
                "java" -> image?.setImageDrawable(getDrawable(R.drawable.java))
                "python" -> image?.setImageDrawable(getDrawable(R.drawable.python))
            }
        }
    }
}
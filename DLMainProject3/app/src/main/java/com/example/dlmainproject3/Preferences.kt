package com.example.dlmainproject3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)


        val actionBar=supportActionBar
        actionBar!!.title="Preferences"
        actionBar.setDisplayHomeAsUpEnabled(true)

        var selectBtn=findViewById<Button>(R.id.selectCurrency)
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        selectBtn.setOnClickListener {
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            // Assigning id of the checked radio button
            val radioButton = findViewById<RadioButton>(selectedOption)
            // Displaying text of the checked radio button in the form of toast
            Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()

            var currency = radioButton.text.toString()

            val intent = Intent(this@Preferences, MainActivity::class.java)
            intent.putExtra("currency", currency)
            startActivity(intent)




        }
    }


}



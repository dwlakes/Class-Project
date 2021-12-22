package com.example.dlmainproject3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal.COUNTRY
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.String as String1

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {


    lateinit var spinner: Spinner
    lateinit var textView: TextView
    lateinit var test: TextView


    override fun onCreate(savedInstanceState: Bundle?) {


        this.setTitle("The Digital Nomad Tax Calculator")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //loadData()
        var currency = intent.getStringExtra("currency")
        //test.text = currency.toString()

        /*if (currency == null) {

            val intent = Intent(this@MainActivity, Preferences::class.java)

            startActivity(intent)

        }*/

        title = "Digital Nomad Tax Calculator"
        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)

        val country = resources.getStringArray(R.array.locations)
        test = findViewById<TextView>(R.id.textView5)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.locations,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this
        val button = findViewById<Button>(R.id.button2)
        val helpButton = findViewById<Button>(R.id.helpButton)



        helpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

    }


    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        loadData()
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String1 = parent?.getItemAtPosition(position).toString()
        textView.text = text

        var currency = intent.getStringExtra("currency")


        if (currency == null) {
            loadData()

        } else {
            test.text = currency.toString()

        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {

            R.id.preferences -> {
                Toast.makeText(this, "Preferences", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Preferences::class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)
            }
            R.id.help -> {
                Toast.makeText(this, "Sorry, I need some help myself.", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)

        }


    }


    fun onButtonClick(view: View?) {

        saveData()

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        val country = textView.text.toString()
        var currencyType = test.text.toString()

        intent.putExtra("currency", currencyType)
        intent.putExtra("country", country)
        startActivity(intent)


    }


    private fun saveData() {
        val textView5=findViewById<TextView>(R.id.textView5)
        val insertedText = test.text.toString()
        textView5.text = insertedText

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply {
            putString("STRING_KEY", insertedText)
        }.apply()

    }
        private fun loadData() {

            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val savedString = sharedPreferences.getString("STRING_KEY", null)
            val textView5 = findViewById<TextView>(R.id.textView5)


            test.text= savedString

        }
}




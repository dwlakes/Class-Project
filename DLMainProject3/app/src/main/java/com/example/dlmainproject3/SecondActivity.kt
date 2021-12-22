package com.example.dlmainproject3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal.COUNTRY
import android.text.TextUtils
import android.view.View
import android.widget.*
import org.w3c.dom.Text
import java.lang.NullPointerException
import java.text.DecimalFormat
import kotlin.math.roundToLong
import kotlin.String as String1

 class SecondActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

     lateinit var results: TextView
     lateinit var calculate: Button
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main2)

         this.setTitle("The Digital Nomad Tax Calculator")

         var salary = findViewById<EditText>(R.id.salary)
         var results = findViewById<TextView>(R.id.results)
         val calculate = findViewById<Button>(R.id.calculate)
         val country = intent.getStringExtra("country")
         var currency = intent.getStringExtra("currency")
         var textView = findViewById<TextView>(R.id.textView3)
         textView.text = ("Enter salary in $currency").toString()
         var salaryConverted = null;
         var mxn = 0.0;

         val actionBar = supportActionBar
         actionBar!!.title = "Second Activity"
         actionBar.setDisplayHomeAsUpEnabled(true)




         calculate.setOnClickListener {


             val Salary = salary.text.toString().toDouble()



             if (currency == "USD") {
                 var currencySign = "$"
                 if (country == "Mexico") {
                     var mxnInc = Salary.toString().toDouble() * 21.50;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (mxnInc >= 3898140.13) {
                         taxes =
                             ((mxnInc - 3898140.13) * .35) + ((3898140.12 - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"

                     } else if (mxnInc >= 1299380.05) {
                         taxes =
                             ((mxnInc - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 974535.04) {
                         taxes =
                             ((mxnInc - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 510451.01) {
                         taxes =
                             ((mxnInc - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 323862.01) {
                         taxes =
                             ((mxnInc - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 160577) {
                         taxes =
                             ((mxnInc - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 134119.42) {
                         taxes =
                             ((mxnInc - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 115375.91) {
                         taxes =
                             ((mxnInc - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 65651.08) {
                         taxes =
                             ((mxnInc - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 7735.01) {
                         taxes = ((mxnInc - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc <= 7735.01) {
                         taxes = (mxnInc * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.047
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.047
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     }

                 } else if (country == "Costa Rica") {
                     var crInc = Salary.toString().toDouble() * 640.168 ;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (crInc > 18683000) {
                         taxes =
                             ((crInc - 18683001) * .25) + ((18683000 - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.00156319
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.00156319
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                         "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc >= 9038000) {
                         taxes =
                             ((crInc - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.00156319
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.00156319
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc > 5598000) {
                         taxes = ((crInc - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.00156319
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.00156319
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc > 3742001) {
                         taxes = ((crInc - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.00156319
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.00156319
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.00156319
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.00156319
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     }


                 } else if (country == "Croatia") {
                     var croatInc = Salary.toString().toDouble() * 6.70541;
                     var taxes = 0.0;
                     var netSal = 0.0;
                     if (croatInc > 360000) {
                         var taxes = ((croatInc - 360001) * .3) + ((360000 - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.149036
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.149036
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else if (croatInc > 48000) {
                         var taxes = ((croatInc - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.149036
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.149036
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.149036
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.149036
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     }

                 } else {
                     results.text = "Nope."
                 }

             } else if (currency == "Euro") {
                 var currencySign= "€"
                 if (country == "Mexico") {
                     var mxnInc = Salary.toString().toDouble() * 24.16;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (mxnInc >= 3898140.13) {
                         taxes =
                             ((mxnInc - 3898140.13) * .35) + ((3898140.12 - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"

                     } else if (mxnInc >= 1299380.05) {
                         taxes =
                             ((mxnInc - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 974535.04) {
                         taxes =
                             ((mxnInc - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 510451.01) {
                         taxes =
                             ((mxnInc - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 323862.01) {
                         taxes =
                             ((mxnInc - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 160577) {
                         taxes =
                             ((mxnInc - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 134119.42) {
                         taxes =
                             ((mxnInc - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 115375.91) {
                         taxes =
                             ((mxnInc - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 65651.08) {
                         taxes =
                             ((mxnInc - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 7735.01) {
                         taxes = ((mxnInc - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc <= 7735.01) {
                         taxes = (mxnInc * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.041
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.041
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     }

                 } else if (country == "Costa Rica") {
                     var crInc = Salary.toString().toDouble() * 717.94;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (crInc > 18683000) {
                         taxes =
                             ((crInc - 18683001) * .25) + ((18683000 - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0014
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0014
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc >= 9038000) {
                         taxes =
                             ((crInc - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0014
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0014
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc > 5598000) {
                         taxes = ((crInc - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0014
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0014
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc > 3742001) {
                         taxes = ((crInc - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0014
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0014
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0014
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0014
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     }


                 } else if (country == "Croatia") {
                     var croatInc = Salary.toString().toDouble() * 7.51985;
                     var taxes = 0.0;
                     var netSal = 0.0;
                     if (croatInc > 360000) {
                         var taxes = ((croatInc - 360001) * .3) + ((360000 - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.132981
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0132981
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else if (croatInc > 48000) {
                         var taxes = ((croatInc - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.132981
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0132981
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.132981
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0132981
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     }

                 } else {
                     results.text = "Nope."
                 }
             } else if (currency == "Brazilian Real"){
                 var currencySign = "R$"
                 if (country == "Mexico") {
                     var mxnInc = Salary.toString().toDouble() * 3.82;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (mxnInc >= 3898140.13) {
                         taxes =
                             ((mxnInc - 3898140.13) * .35) + ((3898140.12 - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"

                     } else if (mxnInc >= 1299380.05) {
                         taxes =
                             ((mxnInc - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 974535.04) {
                         taxes =
                             ((mxnInc - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 510451.01) {
                         taxes =
                             ((mxnInc - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 323862.01) {
                         taxes =
                             ((mxnInc - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 160577) {
                         taxes =
                             ((mxnInc - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 134119.42) {
                         taxes =
                             ((mxnInc - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 115375.91) {
                         taxes =
                             ((mxnInc - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 65651.08) {
                         taxes =
                             ((mxnInc - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc >= 7735.01) {
                         taxes = ((mxnInc - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     } else if (mxnInc <= 7735.01) {
                         taxes = (mxnInc * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.26
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.26
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     }

                 } else if (country == "Costa Rica") {
                     var crInc = Salary.toString().toDouble() * 114.53;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (crInc > 18683000) {
                         taxes =
                             ((crInc - 18683001) * .25) + ((18683000 - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0087
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0087
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc >= 9038000) {
                         taxes =
                             ((crInc - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0087
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0087
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc > 5598000) {
                         taxes = ((crInc - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0087
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0087
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else if (crInc > 3742001) {
                         taxes = ((crInc - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0087
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0087
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0087
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0087
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     }


                 } else if (country == "Croatia") {
                     var croatInc = Salary.toString().toDouble() * 1.20;
                     var taxes = 0.0;
                     var netSal = 0.0;
                     if (croatInc > 360000) {
                         var taxes = ((croatInc - 360001) * .3) + ((360000 - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.83
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.83
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else if (croatInc > 48000) {
                         var taxes = ((croatInc - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.83
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.83
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.83
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.83
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     }

                 } else {
                     results.text = "Nope."
                 }

             }
         }
     }
         override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
             TODO("Not yet implemented")
         }

         override fun onNothingSelected(p0: AdapterView<*>?) {
             TODO("Not yet implemented")
         }


         private fun Any.setText(salary: TextView?) {

         }
     }







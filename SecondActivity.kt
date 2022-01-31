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
                     var mxnInc = Salary.toString().toDouble() * 20.387201;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (mxnInc >= 3898140.13) {
                         taxes =
                             ((mxnInc - 3898140.13) * .35) + ((3898140.12 - 1299380.05) * .34) + ((1299380.04 - 974535.04) * .32) + ((974535.03 - 510451.01) * .3) + ((510451.01 - 323862.01) * .2352) + ((323862 - 160577) * .2136) + ((160577.67 - 134119.42) * .1792) + ((134119.41 - 115375.91) * .16) + ((115375.9 - 65651.08) * .1088) + ((65651.07 - 7735.01) * .064) + (7735 * .0192)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (mxnInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
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
                         var netSalOriginal = netSal*0.049041054
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.049041054
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  Mex$$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe Mex$$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Bien gracias, ¿y tú?"
                     }

                 } else if (country == "Costa Rica") {
                     var crInc = Salary.toString().toDouble() * 634.9562 ;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (crInc > 18683000) {
                         taxes =
                             ((crInc - 18683001) * .25) + ((18683000 - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0015749118
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0015749118
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
                         var netSalOriginal = netSal*0.0015749118
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0015749118
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
                         var netSalOriginal = netSal*0.0015749118
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0015749118
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
                         var netSalOriginal = netSal*0.0015749118
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0015749118
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
                         var netSalOriginal = netSal*0.0015749118
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.0015749118
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

                 } else if (country == "Norway") {
                     var norInc = Salary.toString().toDouble() * 8.8003161;
                     var taxes22 = norInc * .22
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (norInc > 2000000) {
                         taxes =
                             ((norInc - 2000000) * .174) + ((1999999 - 969200) * .164) + ((969199 - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.1136055
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.1136055
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     } else if (norInc > 969199) {
                         taxes =
                             ((norInc - 969200) * .164) + ((969199 - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.1136055
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.1136055
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"

                     } else if (norInc > 643799) {
                         taxes =
                             ((norInc - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.1136055
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.1136055
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc > 267899) {
                         taxes =
                             ((norInc - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.1136055
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.1136055
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc > 190349) {
                         taxes =
                             ((norInc  - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.1136055
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.1136055
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc < 190350) {
                         taxes = taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.1136055
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.1136055
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }
                 } else if (country == "Portugal"){
                     var euroInc = Salary.toString().toDouble() * 0.88288978;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (euroInc>80882) {
                         taxes = ((euroInc - 80883)*.48)+((80882-36968)*.45)+((36967-25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     } else if (euroInc>36967){
                         taxes = ((euroInc -36968)*.45)+((36967-25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>25075){
                         taxes = ((euroInc - 25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>20322){
                         taxes = ((euroInc - 20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>10372){
                         taxes = ((euroInc - 10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>7112){
                         taxes = ((euroInc -7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc<7113){
                         taxes = (euroInc *.145)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }
                 } else if (country == "Spain") {
                     var euroInc = Salary.toString().toDouble() * 0.88288978;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (euroInc > 60000) {
                         taxes = ((euroInc - 60001)*.4)+((60000-35201)*.37)+((35200-20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 35200) {
                         taxes = ((euroInc -35201)*.37)+((35200-20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 20200) {
                         taxes = ((euroInc - 20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 12450) {
                         taxes = ((euroInc -12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc < 12451) {
                         taxes = (euroInc *.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 1.1326442
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 1.1326442
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }
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
                     var crInc = Salary.toString().toDouble() * 718.63739 ;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (crInc > 18683000) {
                         taxes =
                             ((crInc - 18683001) * .25) + ((18683000 - 9322001) * .2) + ((9038000 - 5598001) * .15) + ((5598000 - 3742001) * .1)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (crInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.0013915224
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0013915224
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
                         var netSalOriginal = netSal*0.0013915224
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0013915224
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
                         var netSalOriginal = netSal*0.0013915224
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0013915224
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
                         var netSalOriginal = netSal*0.0013915224
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0013915224
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
                         var netSalOriginal = netSal*0.0013915224
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.0013915224
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about  ₡$netSalRounded " + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe ₡$taxesRounded in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Pura vida, más Tico que el hallo pinto"
                     }


                 } else if (country == "Croatia") {
                     var croatInc = Salary.toString().toDouble() * 7.5213827;
                     var taxes = 0.0;
                     var netSal = 0.0;
                     if (croatInc > 360000) {
                         var taxes = ((croatInc - 360001) * .3) + ((360000 - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (croatInc - taxes);
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.13296463
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.13296463
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
                         var netSalOriginal = netSal*0.13296463
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.13296463
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
                         var netSalOriginal = netSal*0.13296463
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*.13296463
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     }

                 } else if (country == "Norway") {
                     var norInc = Salary.toString().toDouble() * 9.9729272;
                     var taxes22 = norInc * .22
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (norInc > 2000000) {
                         taxes =
                             ((norInc - 2000000) * .174) + ((1999999 - 969200) * .164) + ((969199 - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.10027146
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.10027146
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     } else if (norInc > 969199) {
                         taxes =
                             ((norInc - 969200) * .164) + ((969199 - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.10027146
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.10027146
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"

                     } else if (norInc > 643799) {
                         taxes =
                             ((norInc - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.10027146
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.10027146
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc > 267899) {
                         taxes =
                             ((norInc - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.10027146
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.10027146
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc > 190349) {
                         taxes =
                             ((norInc  - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.10027146
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.10027146
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc < 190350) {
                         taxes = taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.10027146
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.10027146
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }
                 }else if (country == "Portugal"){
                     var euroInc = Salary.toString().toDouble()
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (euroInc>80882) {
                         taxes = ((euroInc - 80883)*.48)+((80882-36968)*.45)+((36967-25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     } else if (euroInc>36967){
                         taxes = ((euroInc -36968)*.45)+((36967-25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>25075){
                         taxes = ((euroInc - 25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>20322){
                         taxes = ((euroInc - 20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>10372){
                         taxes = ((euroInc - 10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>7112){
                         taxes = ((euroInc -7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     }else if (euroInc<7113){
                         taxes = (euroInc *.145)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Até breve!"
                     }
                 }else if (country == "Spain") {
                     var euroInc = Salary.toString().toDouble()
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (euroInc > 60000) {
                         taxes = ((euroInc - 60001)*.4)+((60000-35201)*.37)+((35200-20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 35200) {
                         taxes = ((euroInc -35201)*.37)+((35200-20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 20200) {
                         taxes = ((euroInc - 20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 12450) {
                         taxes = ((euroInc -12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc < 12451) {
                         taxes = (euroInc *.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "¡Que gusto de verlo!"
                     }
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
                     var croatInc = Salary.toString().toDouble() * 1.2278749;
                     var taxes = 0.0;
                     var netSal = 0.0;
                     if (croatInc > 360000) {
                         var taxes = ((croatInc - 360001) * .3) + ((360000 - 48000) * .2)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = croatInc-taxes
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*.81450058
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.81450058
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else if (croatInc > 48000) {
                         var taxes = ((croatInc - 48000) * .2)
                         netSal = croatInc-taxes
                         var taxesRounded = String.format("%.2f", taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.81450058
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.81450058
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     } else {
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = croatInc-taxes
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal*0.81450058
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes*0.81450058
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded"+"kn" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n"+
                                 "You owe $taxesRounded"+"kn in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded"+"\n"+
                                 "Šta ima novo?"
                     }

                 } else if (country == "Norway") {
                     var norInc = Salary.toString().toDouble() * 1.5826194;
                     var taxes22 = norInc * .22
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (norInc > 2000000) {
                         taxes =
                             ((norInc - 2000000) * .174) + ((1999999 - 969200) * .164) + ((969199 - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.63186386
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.63186386
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     } else if (norInc > 969199) {
                         taxes =
                             ((norInc - 969200) * .164) + ((969199 - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.63186386
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.63186386
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"

                     } else if (norInc > 643799) {
                         taxes =
                             ((norInc - 643800) * .134) + ((643799 - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.63186386
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.63186386
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc > 267899) {
                         taxes =
                             ((norInc - 267900) * .04) + ((267899 - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.63186386
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.63186386
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc > 190349) {
                         taxes =
                             ((norInc  - 190350) * .017) + taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.63186386
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.63186386
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }else if (norInc < 190350) {
                         taxes = taxes22
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (norInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 0.63186386
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 0.63186386
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about $netSalRounded" + "NOK" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe $taxesRounded" + "NOK in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Det er ugler i mosen!"
                     }
                 }else if (country == "Portugal"){
                     var euroInc = Salary.toString().toDouble() * 0.15858169;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (euroInc>80882) {
                         taxes = ((euroInc - 80883)*.48)+((80882-36968)*.45)+((36967-25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     } else if (euroInc>36967){
                         taxes = ((euroInc -36968)*.45)+((36967-25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>25075){
                         taxes = ((euroInc - 25076)*.37)+((25075-20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>20322){
                         taxes = ((euroInc - 20323)*.35)+((20322-10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>10372){
                         taxes = ((euroInc - 10733)*.285)+((10732-7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc>7112){
                         taxes = ((euroInc -7113)*.23)+((7112*.145))
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }else if (euroInc<7113){
                         taxes = (euroInc *.145)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "Até breve!"
                     }
                 }else if (country == "Spain") {
                     var euroInc = Salary.toString().toDouble() * 0.15858169;
                     var taxes = 0.0;
                     var netSal = 0.0;

                     if (euroInc > 60000) {
                         taxes = ((euroInc - 60001)*.4)+((60000-35201)*.37)+((35200-20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 35200) {
                         taxes = ((euroInc -35201)*.37)+((35200-20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 20200) {
                         taxes = ((euroInc - 20201)*.3)+((20200-12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc > 12450) {
                         taxes = ((euroInc -12451)*.24)+(12450*.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }else if (euroInc < 12451) {
                         taxes = (euroInc *.19)
                         var taxesRounded = String.format("%.2f", taxes)
                         netSal = (euroInc - taxes)
                         var netSalRounded = String.format("%.2f", netSal)
                         var netSalOriginal = netSal * 6.3058984
                         var netSalOriginalRounded = String.format("%.2f", netSalOriginal)
                         var taxesOriginal = taxes * 6.3058984
                         var taxesOriginalRounded = String.format("%.2f", taxesOriginal)
                         results.text = "Your take home is about €$netSalRounded" + "\n" +
                                 "or $currencySign$netSalOriginalRounded" + "\n" +
                                 "You owe €$taxesRounded" + " in taxes" + "\n" +
                                 "Or $currencySign$taxesOriginalRounded" + "\n" +
                                 "¡Que gusto de verlo!"
                     }
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







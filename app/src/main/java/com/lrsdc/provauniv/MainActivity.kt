package com.lrsdc.provauniv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //abbimo già dichiarati tutti gli oggetti che abbiamo a schermo, tali oggetti sono già importati
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //con val si definisce una costante, la struttura dei metodi è molto più semplice per raggiungere il testo dell'oggetto basta la chiamata di un unico metodo
        val A0 = Addendo0.text.toString()
        val A1 = Addendo1.text.toString()
        //si potevano creare tante funzioni diverse ma mi rompevo le palle
        Piu.setOnClickListener{
                ResultText.text = Op_(A0,A1,0).toString()
        } // è tipo un handler quandi ci vogliono le parentesi graffe
        //banale def di un variabile var a : int
        //usando val capisce da solo che tipo di varibile si tratta
        Meno.setOnClickListener{

            ResultText.text = Op_(A0,A1,1).toString()

        }
        Per.setOnClickListener{

            ResultText.text = Op_(A0,A1,2).toString()

        }
        Diviso.setOnClickListener {

            ResultText.text = Op_(A0,A1,3).toString()

        }
    }

    fun Op_( a:String, b:String, operation:Int) :Double{
        var result : Double  = 0.0
        try {
            var ad0 : Double = a.toDouble()
            var ad1 : Double = b.toDouble()
            if(operation==0) {
                result = ad0 + ad1
            }else if(operation == 1){
                result = ad0 - ad1
            }else if(operation == 2){
                result = ad0 * ad1
            }else if(operation == 3){
                result = ad0 / ad1
            }
        } catch (e: InterruptedException) { }
        return result
    }

}

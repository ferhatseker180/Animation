package com.example.animasyongiris

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    /*   buttonAsagidanEkranaGiris()
        resimSonradanEkranaGiris()
        yaziSonradanEkranaGiris()
   */
        button.setOnClickListener {
            //     Toast.makeText(applicationContext,"Animasyon Çalışma Testi",Toast.LENGTH_SHORT).show()
           // alphaAnimasyonu()
           // scaleAnimasyonu()
          //  rotateAnimasyonu()
         //   translationAnimasyonu()
            animasyonOzellikler()
        }
    }
        fun alphaAnimasyonu() {
            val a = ObjectAnimator.ofFloat(imageView,"alpha",1.0f,0.0f).apply {
                duration = 3000 // ms cinsinden belirtilir.
        }
            a.start()
    }
// Alpha animasyonu için aşağıdaki metodlar vardır...
    // 0.0f : Görünmez     1.0f : Görünür
    //     startDelay = 2000
    //     interpolator = BounceInterpolator()
    //    repeatCount = ObjectAnimator.INFINITE
    //     repeatMode = ObjectAnimator.REVERSE

    fun scaleAnimasyonu() {
        val s = ObjectAnimator.ofFloat(imageView,"scaleX",1.0f,2.0f).apply {
            duration = 3000 // ms cinsinden belirtilir.
        }
        s.start()
        // Yatayda ise scaleX  dikeyde ise scaleY yani boyutlandırma koordinat düzlemine göre belirtilir.
        // 1.0f kendi boyutudur ve 2.0f ile 2 kat büyültülür.
    }

    fun rotateAnimasyonu() {
        val r = ObjectAnimator.ofFloat(textView,"rotation",0.0f,360.0f).apply {
            duration = 3000 // ms cinsinden belirtilir.
        }
        r.start()
        // Döndürme işlemi derece cinsindendir ve saat 0.0f-90.0f saat yönünü 90.0f-0.0f saat yönü tersine göre hareketi ifade eder.
    }

    fun translationAnimasyonu() {
        val t = ObjectAnimator.ofFloat(textView,"translationY",0.0f,50.0f).apply {
            duration = 3000 // ms cinsinden belirtilir.
        }
        t.start()
        // Yatayda ise translationX ile kaydırma yapar  dikeyde ise translationY ile kaydırma gerçekleştirilir.
        // koordinatlara - konulursa hareketin ters yönünde hareket etmeye başlar.
        // 0.0f varsayılan konumdur.
    }

    fun buttonAsagidanEkranaGiris() {
        val t = ObjectAnimator.ofFloat(button,"translationY",900.0f,0.0f).apply {
            duration = 1000 // ms cinsinden belirtilir.
        }
        t.start()
        // 900.0f ile ekran dışında kalacak ve görünmeyecek ardından kendi konumuna geçecek.

    }

    fun resimSonradanEkranaGiris() {
        val t = ObjectAnimator.ofFloat(imageView,"translationX",-900.0f,0.0f).apply {
            duration = 1000 // ms cinsinden belirtilir.
        }
        t.start()
        // 900.0f ile ekran dışında kalacak ve görünmeyecek ardından kendi konumuna geçecek.
    }

    fun yaziSonradanEkranaGiris() {
        val t = ObjectAnimator.ofFloat(textView,"translationX",-900.0f,0.0f).apply {
            duration = 1000 // ms cinsinden belirtilir.
        }
        t.start()
        // 900.0f ile ekran dışında kalacak ve görünmeyecek ardından kendi konumuna geçecek.
    }

    fun animasyonOzellikler() {
        val t = ObjectAnimator.ofFloat(textView,"translationY",0.0f,100.0f).apply {
            duration = 1000 // ms cinsinden belirtilir.
            startDelay = 2000 // 2 saniye gecikmeli başlar.
        }
        //  t.start()
        // 900.0f ile ekran dışında kalacak ve görünmeyecek ardından kendi konumuna geçecek.

            val ivme = ObjectAnimator.ofFloat(imageView,"translationY",0.0f,200.0f).apply {
              //  interpolator = OvershootInterpolator()
                interpolator = BounceInterpolator()
                duration = 2000
            }
            // İvme özelliği animasyon hızının değişim sürecini değiştirir.
            //  ivme.start()

            val tekrar = ObjectAnimator.ofFloat(imageView,"translationY",0.0f,100.0f).apply {

                duration = 2000
                repeatCount = ObjectAnimator.INFINITE // Infinite sonsuza kadar tekrara devam edilmesi istenildiğinde tercih edilir.
                // repeatMode = ObjectAnimator.RESTART // Restart ile tekrar başa dönüyor yani hareket kaldığı yerden başa dönmüyor doğrudan başa dönüyor ve tekrarlıyor.
                repeatMode = ObjectAnimator.REVERSE  // Reverse tekrarlama hareketini kaldığı yerden devam ederek tamamlıyor ve daha doğal gözüküyor.
            }
        tekrar.start()

        }



}
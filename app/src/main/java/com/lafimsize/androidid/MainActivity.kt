package com.lafimsize.androidid

import android.os.Bundle
import android.provider.Settings
import android.provider.Settings.Secure
import androidx.appcompat.app.AppCompatActivity
import com.lafimsize.androidid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root

        setContentView(view)

       // val android_id = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID)
        val android_id = Secure.getString(this.getContentResolver(), Secure.ANDROID_ID)

        //f2c113ad428792ff
        //f2c113ad428792ff
        //f2c113ad428792ff
        //e7907091adf36f8e


        println(android_id)
    }
}
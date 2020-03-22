package com.imtiaz.androidboilerplates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var retrofit : Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(retrofit != null){
            Log.e("retrofit", "not null")
        }
    }
}

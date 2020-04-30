package com.imtiaz.androidboilerplates.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.imtiaz.androidboilerplates.R
import dagger.android.support.AndroidSupportInjection
import retrofit2.Retrofit
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(retrofit != null){
            Log.e("retrofitNull", "No")
        }
        else{
            Log.e("retrofitNull", "Yes")
        }
    }

}

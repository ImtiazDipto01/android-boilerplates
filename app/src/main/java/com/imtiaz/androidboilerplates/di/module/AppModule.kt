package com.imtiaz.androidboilerplates.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.imtiaz.androidboilerplates.utils.BASE_URL
import com.imtiaz.androidboilerplates.utils.TIME_OUT
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class AppModule {

    //Room, SharedPref will be here..

    @Singleton
    @Provides
    fun provideGson() : Gson = GsonBuilder().setLenient().create()

    @Singleton
    @Provides
    fun provideOkHttpClient() : OkHttpClient{
        return OkHttpClient().newBuilder()
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient, gson: Gson) : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}